public class HomeworkTask {
   /*
    --- Question 1---

    SELECT distinct job_id, AVG(salary)
    from employees
    GROUP BY job_id
    HAVING job_id IN('IT_PROG','SA_REP', 'FI_ACCOUNT', 'AD_VP');

--- Question 2 ---
    SELECT *
    from employees
    where last_name like '%a%a%';

--- Question 3 ---
    SELECT  department_id, MAX(salary)
    from employees
    group by department_id;

--- Question 4 ---

    select  department_id, sum(salary)
    from employees
    GROUP BY department_id
    Having department_id NOT iN(50) AND sum(salary)>30000;

--- Question 5 ---

    select first_name, last_name
    from employees
    WHERE hire_date BETWEEN '2000-01-06' AND  '2007-09-03';

--- Question 6 ---

    SELECT country_id, country_name, r.region_id, r.region_name
    from countries join regions r
    on countries.region_id = r.region_id;

--- Question 7 ---

    SELECT country_name, l.city
    from countries join locations l
    on countries.country_id = l.country_id;

--- Question 8 ---

    SELECT first_name, last_name, d.department_id, d.department_name
    from employees  join departments d
    on employees.department_id= d.department_id;

--- Question 9 ---

    SELECT first_name, last_name, d.department_id, d.department_name
    from employees  right outer join departments d
    on employees.department_id= d.department_id;

--- Question 10 ---
    SELECT first_name, last_name, d.department_id, d.department_name
    from employees  left outer join departments d
    on employees.department_id= d.department_id;

--- Question 11 ---

    SELECT e.first_name, d.first_name
    from employees e join employees d
    on e.manager_id = d.employee_id
*/
}
