# JDBC Student Demo

This is a complete JDBC CRUD console application. It uses an in-memory H2 database, so no separate database installation or configuration is required.

## Run

From this folder, execute:

```text
mvn clean compile exec:java
```

The program creates a `students` table and demonstrates:

- Creating a table with `Statement`
- Inserting records with `PreparedStatement`
- Reading all records with `ResultSet`
- Filtering records with a parameterized query
- Updating and deleting records
- Committing and rolling back a transaction
- Closing JDBC resources with try-with-resources

The database is in memory, so all data is cleared when the program exits.
