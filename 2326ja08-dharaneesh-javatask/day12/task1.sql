SELECT s.student_id, s.name, m.subject, m.score
FROM students s
JOIN marks m ON s.student_id = m.student_id;
