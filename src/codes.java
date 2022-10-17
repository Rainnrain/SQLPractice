public class codes {





    /*

     select count(*) from employees where job_id = 'IT_PROG';

    select count(8) from employees where salary >8000;

    select count (distinct first_name) from employees;

    select * from employees order by salary desc;

    select * from employees order by first_name;

    select* from employees order by hire_date;

    select*from employees where first_name like 'C%';

    select*from employees where first_name like 'C_____';

    select * from employees where first_name like '_u%';

    select*from employees where employees.first_name ILIKE '%c%';

    select sum (salary) from employees;

    select round (avg(salary),2) from employees;

    select max(salary) from employees;

    select * from employees where salary=24000;

    select * from employees where salary=(select max(salary)from employees);

    select  MAX(salary)from employees where salary<(select max(salary) from employees);

    select * from employees where salary=(select MAX(salary)from employees where salary
                                                                                 <(select MAX(salary) from employees));

    select * from employees order by salary desc offset 1 limit 2;

    select  * from employees order by salary desc offset 6 limit 3;

-- 14th highest salary(removing duplicates)
    select distinct salary
    from employees order by salary desc offset 13 limit 1;

--  who is making highest salary? change offset value n-1;
    select * from employees where salary=(select distinct salary
    from employees order by salary desc offset 13 limit 1);
-- what is the average salary from IT Programmers

    select avg(salary) from employees where job_id = 'IT_PROG';

-- what is the average salary for SA_REP

    select avg(salary) from employees where job_id = 'SA_REP';

    select  distinct job_id from employees;

-- people working for IT Prog

    select count(*) from employees where job_id = 'IT_PROG';


-- solution

    select job_id ,avg(salary),count(*),sum(salary) from employees group by job_id;

-- get me job_ids where their salary is more then 5k

    select * from employees where salary>5000;

    select job_id,avg(salary) from employees where salary>5000 group by job_id;

-- the correct solution is

    select job_id,avg(salary) from employees group by job_id having avg(salary)>5000;

-- how to find duplicate names? how many times they repeat

    select first_name,count(*) from employees group by first_name having count(*)>1;
 -- how can we rename the colum we displayed

    select first_name as "give_name", last_name as "surname" from employees;

    select first_name||' '||last_name as "full_name" from employees;

-- add @cydeo.com and name new colum to full_email

    select lower(email||'@cydeo.com') as "full_email" from employees;-- lowercase

    select upper(email||'@cydeo.com') as "full_email" from employees; -- uppercase

    select first_name,length(first_name)as "length_name" from employees;

--substr(colName,begIndex,NumberPfChar)
    select substr(first_name,1,1)||'.'||substr(last_name,1,1)as"initials" from employees; --substr initials


-- initials , fullname,email(cydeo)(lower)

    create view emailList as select substr(first_name,1,1)||'.'||substr(last_name,1,1)as"initials",
    first_name||' '|| employees.last_name as "full_name",
    lower(email||'@cydeo.com') as "e-mail" from employees;

    select * from emailList;  -- we store it as variable on views;

    select initials from emailList; -- nice cool futures

    select first_name,last_name from employees;

--find the longest name in DB

    select distinct first_name, length(first_name)from employees where length(first_name)
            = (select max(length(first_name)) from employees)
    order by first_name limit 2 ;

    select max(salary)from employees;
    select *from employees where salary =(select max(salary)from employees);









     */
    /*
    SELECT * FROM countries;

Create TABLE ScrumTeam(

    Emp_ID Integer PRIMARY KEY ,
    FirstName varchar(30) NOT NULL ,
    LastName varchar(30),
    JobTitle varchar(20)
);

SELect * from scrumteam;

/*
INSERT INTO tableName (column1, column2,…)
VALUES (value1, value2 … );
*/
/*
    insert into ScrumTeam (Emp_ID, FirstName, LastName, JobTitle)
    VALUES (1,'Severus', 'Snape', 'Tester');

    Insert into scrumteam values (2,'Lorraine', 'Eliza', 'Programmer');
    Insert into scrumteam values (3,'Lore', 'Ramazan', 'ScrumMaster');

    UPDATE ScrumTeam
    SET jobtitle ='DevOps'
    WHERE Emp_ID=23;

    DELETE from ScrumTeam
    WHERE Emp_ID=3;

    AlTER TABLE ScrumTeam ADD SALARY INTEGER;


    UPDATE ScrumTeam
    SET SALARY = 120000
    WHERE Emp_ID=1;

    UPDATE ScrumTeam
    SET SALARY = 120345000
    WHERE Emp_ID=2;

    UPDATE ScrumTeam
    SET SALARY = 120034555
    WHERE Emp_ID=23;

    ALTER TABLE ScrumTeam RENAME COLUMN SALARY TO ANNUAL_SALARY;

    ALTER TABLE ScrumTeam DROP COLUMN ANNUAL_SALARY;

    ALTER TABLE ScrumTeam RENAME TO AGILE_TEAM;

     /*
    SELECT * FROM customer;

    SELECT * FROM ADDRESS;

    SELECT first_name, last_name, address, phone
    FROM customer FULL OUTER JOIN address
    ON customer.address_id= address.address_id;

    SELECT first_name, last_name, c.address_id, a.address_id, phone
    FROM customer  c FULL OUTER JOIN address a
    ON c.address_id= a.address_id;
    */

    /*
SELECT * from employees;

SELECT * from departments;

--- display firstname, lastname, departmentname.

SELECT first_name, last_name,department_name
from employees e left outer join departments d
on e.department_id = d.department_id;

--- get me the firstname, last name departent name and city for all employees

SELECT  first_name, last_name, department_name, city
from employees e  join departments d
on e.department_id = d.department_id
join locations l on d.location_id = l.location_id;

SELECT  first_name, last_name, department_name, city, country_name
from employees e  join departments d
on e.department_id = d.department_id
join locations l on d.location_id = l.location_id
join countries c on l.country_id= c.country_id;

Select e1.first_name, e1.last_name, e1.manager_id,e2.employee_id, e2.first_name, e2.last_name
from employees e1 Left join employees e2
on e1.manager_id=e2.employee_id ;A
     */


    /*
    select * from testers;

SELECT NAMES FROM developers
EXCEPT
SELECT NAMES FROM TESTERS;

SELECT * FROM testers
UNION ALL
SELECT * FROM developers;

SELECT * FROM testers
UNION
SELECT * FROM developers;

SELECT NAMES FROM developers
INTERSECT
SELECT NAMES FROM TESTERS;



CREATE TABLE Towns (
                       id SERIAL UNIQUE NOT NULL,
                       code VARCHAR(10) NOT NULL, -- not unique
                       article TEXT,
                       name TEXT NOT NULL -- not unique
);


insert into towns (
    code, article, name
)
select
    left(md5(i::text), 10),
    md5(random()::text),
    md5(random()::text)
from generate_series(1, 1000000) s(i);


select * from towns;

explain analyse
select *
from towns
where name='e60ab71c16a081732be46b8131b3e90d';

explain analyse
select *
from towns
where id= 123;

create index idx_towns_name on towns (name);
------ shows available indexes---------

SELECT
    tablename,
    indexname,
    indexdef
FROM
    pg_indexes
WHERE
        schemaname = 'public'
ORDER BY
    tablename,
    indexname;
    -------------------------------------------------------------------------
    creating a function with SQL

    CREATE OR REPLACE FUNCTION get_jobId_count_by_name ( job_name varchar)
    returns int
    language plpgsql
AS
    $$DECLARE
        jobId_count integer;

        BEGIN
            SELECT COUNT(*)
            INTO jobId_count
            FROM employees
            WHERE  job_id = job_name;

            RETURN jobId_count;
        END
    $$;

select get_jobId_count_by_name('SA_REP');


----------------------------------------------------------

CREATE OR REPLACE FUNCTION get_employees_managed_by_id(mngr_id integer)
    returns table
        (
            employee_firstname varchar,
            employee_lastname varchar
        )
    language plpgsql
AS
$$

        BEGIN
            RETURN QUERY
            SELECT first_name,last_name
            FROM employees
            WHERE manager_id = mngr_id;
        END
$$;

SELECT * FROM get_employees_managed_by_id(103);


--write a procedure that will accept 2 params, emp_id, job_title , it will update that employee job title
--based on what we provide

CREATE OR REPLACE PROCEDURE update_jobTitle_by_id(empId integer, job_title varchar)
    language plpgsql
AS
$$
BEGIN
    UPDATE scrumteam
    SET jobtitle = job_title
    WHERE emp_id = empId;

END
$$;

call update_jobTitle_by_id(4,'Spring Developer');

Select * FROM scrumteam;

DROP TABLE IF EXISTS mentors;
CREATE TABLE mentors(
                        id INT GENERATED ALWAYS AS IDENTITY,
                        first_name varchar(40) not null,
                        last_name varchar(40) not null ,
                        primary key(id)
);

DROP TABLE IF EXISTS mentor_audit;
CREATE TABLE mentor_audit(
                             id INT GENERATED ALWAYS AS IDENTITY,
                             mentor_id INT not null,
                             last_name varchar(40) not null ,
                             changed_on timestamp(6) not null,
                             primary key(id)
);


insert into mentors(first_name, last_name) values ('Harold','Finch');
insert into mentors(first_name, last_name) values ('Severus','Snape');


select * FROM mentors;
select * from mentor_audit;

CREATE OR REPLACE FUNCTION log_last_name_changes()
returns trigger
language plpgsql

AS
    $$BEGIN

        IF NEW.last_name <> OLD.last_name THEN
            INSERT INTO mentor_audit(mentor_id, last_name, changed_on) values
            (OLD.id, OLD.last_name, now());
        end if;

        RETURN NEW;
end
$$;

CREATE TRIGGER last_name_difference
    BEFORE UPDATE
    ON mentors
    FOR EACH ROW
    EXECUTE FUNCTION log_last_name_changes();

UPDATE mentors
SET last_name ='Stever'
WHERE id=2;






     */

    public static void main(String[] args) {
        String str=" updates";
    }


}
