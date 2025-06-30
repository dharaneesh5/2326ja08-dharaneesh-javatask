SELECT course_id, COUNT(student_id) AS student_count
FROM enrollments
GROUP BY course_id;
