SELECT d.dept_name, AVG(m.score) AS avg_score
FROM students s
JOIN departments d ON s.dept_id = d.dept_id
JOIN marks m ON s.student_id = m.student_id
GROUP BY d.dept_name;


SELECT *
FROM (
  SELECT s.student_id, s.name, d.dept_name,
         SUM(m.score) AS total_score,
         RANK() OVER (PARTITION BY d.dept_id ORDER BY SUM(m.score) DESC) AS rank_in_dept
  FROM students s
  JOIN departments d ON s.dept_id = d.dept_id
  JOIN marks m ON s.student_id = m.student_id
  GROUP BY s.student_id, s.name, d.dept_name
) AS ranked
WHERE rank_in_dept <= 3;
