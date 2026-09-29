class Demo2 {
    public static void  main(String args[]){
        Computer comp=new Computer();
        comp.musicPlay();
       String str= comp.getpen(10);
       System.out.println(str);
    }
    
}



class Computer{
    public void musicPlay(){
        System.out.println("music Player");
    }

    public String getpen(int cost){
        if(cost>=10)
        return "Pen";
        return "nothing"; //behaving like a else statement 
    }
}