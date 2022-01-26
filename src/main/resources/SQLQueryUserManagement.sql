DROP DATABASE StudentManagermentDatabase;
CREATE DATABASE StudentManagermentDatabase;
USE StudentManagermentDatabase;
CREATE TABLE Users (
	Id int IDENTITY(1,1) PRIMARY KEY,
	UserName varchar(20),
	PassWords varchar(20) 
)