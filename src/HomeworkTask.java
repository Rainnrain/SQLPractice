public class HomeworkTask {
  /*
--- Question 1--- 1. Show all job_id and average salary who work as any of these jobs IT_PROG, SA_REP, FI_ACCOUNT, AD_VP

    SELECT distinct job_id, AVG(salary)
    from employees
    GROUP BY job_id
    HAVING job_id IN('IT_PROG','SA_REP', 'FI_ACCOUNT', 'AD_VP');

--- Question 2 ---2. Show all records whose last name contains 2 lowercase 'a's

    SELECT *
    from employees
    where last_name like '%a%a%';

--- Question 3 ---
            -- Display max salary for each department ---
    SELECT  department_id, MAX(salary)
    from employees
    group by department_id;

--- Question 4 ---4. Display total salary for each department except department_id 50, and where total salary >30000

    select  department_id, sum(salary)
    from employees
    GROUP BY department_id
    Having department_id NOT iN(50) AND sum(salary)>30000;

    select  department_id, sum(salary)
    from employees
    GROUP BY department_id
    Having  sum(salary)>30000 AND department_id !=50;

--- Question 5 ---5. Write a SQL query that returns first and last name any employees who started job between 1-JAN-2000 and 3-SEP-2007 from the hr database

    select first_name, last_name
    from employees
    WHERE hire_date BETWEEN '2000-01-06' AND  '2007-09-03';

--- Question 6 ---6. Display country_id, country name, region id, region name from hr database

    SELECT country_id, country_name, r.region_id, r.region_name
    from countries join regions r
    on countries.region_id = r.region_id;

--- Question 7 ---7. Display All cities, country names from hr database

    SELECT country_name, l.city
    from countries join locations l
    on countries.country_id = l.country_id;

--- Question 8 ---8. display the first name, last name, department number, and department name,  for all employees for departments 80 or 40.

    SELECT first_name, last_name, d.department_id, d.department_name
    from employees  join departments d
    on employees.department_id= d.department_id;

--- Question 9 ---9. Display employees' first name, Lastname department id and all departments including those where do not have any employee.

    SELECT first_name, last_name, d.department_id, d.department_name
    from employees  right outer join departments d
    on employees.department_id= d.department_id;

--- Question 10 ---10. Display the first name, last name, department number, and name, for all employees who have or have not any department
    SELECT first_name, last_name, d.department_id, d.department_name
    from employees  left outer join departments d
    on employees.department_id= d.department_id;

--- Question 11 ---11. Display all employee and their manager's names

    SELECT e.first_name, d.first_name
    from employees e join employees d
    on e.manager_id = d.employee_id


*/
}
