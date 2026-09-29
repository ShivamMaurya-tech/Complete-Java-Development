Set-StrictMode -Version Latest

$root = Split-Path -Parent $MyInvocation.MyCommand.Path
$libDir = Join-Path $root "lib"
$outDir = Join-Path $root "out"
$jarUrl = "https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.2/junit-platform-console-standalone-1.10.2.jar"
$jarPath = Join-Path $libDir "junit-platform-console-standalone-1.10.2.jar"

New-Item -ItemType Directory -Force -Path $libDir, $outDir | Out-Null

if (!(Test-Path $jarPath)) {
    Invoke-WebRequest -Uri $jarUrl -OutFile $jarPath
}

$mainFiles = @(Get-ChildItem -Path (Join-Path $root "src\main\java") -Recurse -Filter *.java)
$testFiles = @(Get-ChildItem -Path (Join-Path $root "src\test\java") -Recurse -Filter *.java)

if ($mainFiles.Count -eq 0) {
    throw "No main Java source files found in src/main/java"
}

if ($testFiles.Count -eq 0) {
    throw "No test Java source files found in src/test/java"
}

javac -cp $jarPath -d $outDir $mainFiles.FullName $testFiles.FullName
java -jar $jarPath --class-path $outDir --scan-classpath
