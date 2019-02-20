-- Used for Hibernate (JPA)
create table RECORD (id integer NOT NULL ,value varchar(255), PRIMARY KEY (id))
-- Used for JDBC
create table RECORD (id integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),value varchar(255), PRIMARY KEY (id))