SELECT e.emp_id, e.emp_name, e.salary, d.dept_name
FROM employee e
JOIN department d ON e.dept_id = d.dept_id
WHERE e.salary > 50000 AND d.dept_name = 'Engineering'
ORDER BY e.salary DESC;
