SELECT s.name, d.dept_name,
       SUM(m.score) AS total_marks,
       AVG(m.score) AS average_score
FROM students s
JOIN departments d ON s.dept_id = d.dept_id
JOIN marks m ON s.student_id = m.student_id
GROUP BY s.student_id, s.name, d.dept_name
ORDER BY d.dept_name, total_marks DESC;