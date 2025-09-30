Singleton DP : Creates object only once and can be used infinite times

eg : JDBC connection to DB is established only once 

IMP Points about Singleton

1. Constructor should always be private so that no one would call it directly
2. Object create with help of method
3. Field to store created object is private