DROP DATABASE IF EXISTS task_1;
create database task_1;
use task_1 ;
CREATE TABLE T1 (
id INT(6) AUTO_INCREMENT not null,
projectType VARCHAR(32) NOT NULL,
atribueX VARCHAR(32) NOT NULL,
iDescription VARCHAR(128) NOT NULL,
revenues float NOT NULL,
expenses float NOT NULL,
PRIMARY KEY(id));