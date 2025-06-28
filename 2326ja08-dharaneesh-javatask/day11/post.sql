SELECT d.dept_name,
       COUNT(e.emp_id) AS total_employees,
       SUM(e.salary) AS total_salary,
       AVG(e.salary) AS avg_salary
FROM employee e
JOIN department d ON e.dept_id = d.dept_id
GROUP BY d.dept_name;
