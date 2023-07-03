REM   Script: ACTIVITY1_2_3
REM   Suneel SQL activity

select * from suneel;

CREAT TABLE salesman(salesman_id PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int); 


DESCRIBE salesman; --description of the table 


CREATE TABLE salesman(salesman_id PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman; --description of the table 


CREATE TABLE salesman(salesman_id PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman


CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman


INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
	INTO salesman VALUES(5001, 'James Hoog', 'New York', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

INSERT ALL 
	INTO salesman VALUES(5001, 'James Hoog', 'New York', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

INSERT INTO salesman VALUES(5009, 'Suneel Magham', 'Bangalore', 13);

SELECT * FROM salesman;

SELECT * FROM salesman Where SALESMAN_NAME = 'Suneel Magham';

INSERT INTO salesman VALUES(5009, 'Suneel Magham', 'NANDYAL', 13);

INSERT INTO salesman VALUES(5009, 'Suneel KUmar Magham', 'NANDYAL', 13);

INSERT INTO salesman VALUES(5019, 'Suneel Magham', 'NANDYAL', 19);

SELECT * FROM salesman Where SALESMAN_NAME = 'Suneel Magham';

INSERT INTO salesman VALUES(5018, 'MGP', 'NANDYAL', 18);

SELECT * FROM salesman Where SALESMAN_CITY = 'NANDYAL';

DROP TABLE salesman 
CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman


INSERT INTO salesman VALUES(5018, 'MGP', 'NANDYAL', 18);

INSERT ALL 
	INTO salesman VALUES(5001, 'James Hoog', 'New York', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman Where SALESMAN_CITY = 'NANDYAL';

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman


INSERT INTO salesman VALUES(5018, 'MGP', 'NANDYAL', 18);

INSERT ALL 
	INTO salesman VALUES(5001, 'James Hoog', 'New York', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman Where SALESMAN_CITY = 'NANDYAL';

INSERT INTO salesman VALUES(5028, 'MRD', 'NANDYAL', 20);

SELECT * FROM salesman Where SALESMAN_CITY = 'NANDYAL';

SELECT SALESMAN_CITY, salesman_id from salesman;

SELECT * FROM salesman WHERE salesman_city='NANDYAL';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_city='NANDYAL;

SELECT salesman_id, commission FROM salesman WHERE salesman_city='NANDYAL';

SELECT salesman_id, commission FROM salesman WHERE salesman_city='Rome';

UPDATE TABLE salesman Where salesman_id = '20';

UPDATE salesman Where salesman_id = '20';

SELECT DISTINCT salesman_city FROM salesman;

SELECT salesman_city FROM salesman;

SELECT salesman_city, commision FROM salesman WHERE salesman_city LIKE '%_a';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '%_a';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '%a';

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman


INSERT INTO salesman VALUES(5028, 'MRD', 'NANDYAL', 20);

INSERT ALL 
	INTO salesman VALUES(5001, 'James Hoog', 'New York', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman Where SALESMAN_CITY = 'NANDYAL';

SELECT SALESMAN_CITY, salesman_id from salesman;

SELECT * FROM salesman WHERE salesman_city='NANDYAL';

SELECT salesman_id, commission FROM salesman WHERE salesman_city='Rome';

SELECT DISTINCT salesman_city FROM salesman;

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '%a';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '%a';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE 'a%';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '___%';

UPDATE salesman SET salesman_city='El Paso';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '___%';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '___ %';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '___%';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '%el';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE 'el%';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE 'e%';

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '__%';

SELECT * FROM salesman ORDER BY salesman_id;

INSERT INTO salesman VALUES(5028, 'MRD', 'NANDYAL', 20);

SELECT * FROM salesman ORDER BY salesman_id;

INSERT INTO salesman VALUES(5038, 'MRD', 'NANDYAL', 20);

SELECT salesman_city, commission FROM salesman WHERE salesman_city LIKE '__%';

SELECT * FROM salesman ORDER BY salesman_id;

SELECT * FROM salesman ORDER BY salesman_id, COMMISSION;

SELECT * FROM salesman ORDER BY salesman_id, COMMISSION;

SELECT * FROM salesman ORDER BY salesman_id, COMMISSION, saleman_name;

SELECT * FROM salesman ORDER BY salesman_id, COMMISSION, salesman_name;

