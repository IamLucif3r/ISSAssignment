# Database Management System

Database is a collection of interrelated data which helps in the efficient retrieval, insertion, and deletion of data from the database and organizes the data in the form of tables, views, schemas, reports, etc.

### There are four types of Data Languages

- Data Definition Language (DDL)
- Data Manipulation Language(DML)
- Data Control Language(DCL)
- Transactional Control Language(TCL)

## Normalization
Normalization is the process of organizing the data in the database.Normalization is used to minimize the redundancy from a relation or set of relations. It is also used to eliminate undesirable characteristics like Insertion, Update, and Deletion Anomalies.The main reason for normalizing the relations is removing these anomalies. Failure to eliminate anomalies leads to data redundancy and can cause data integrity and other problems as the database grows. 

### Types of Normal Forms
- 1NF	: A relation is in 1NF if it contains an atomic value.
- 2NF	: A relation will be in 2NF if it is in 1NF and all non-key attributes are fully functional dependent on the primary key.
- 3NF	: A relation will be in 3NF if it is in 2NF and no transition dependency exists.
- BCNF :	A stronger definition of 3NF is known as Boyce Codd's normal form.

