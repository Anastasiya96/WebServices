# WebServices

## Lab №1


Oracle Database used.
Table Books created:

```
CREATE TABLE Books (
   id         NUMBER PRIMARY KEY,
   name       VARCHAR(100),
   publishing VARCHAR(30)
   author     VARCHAR(40),
   year       NUMBER,
   pages      NUMBER
);
```

Implemented:
- SOAP standalone-application 
- SOAP J2EE-application based on Glassfish5 server
