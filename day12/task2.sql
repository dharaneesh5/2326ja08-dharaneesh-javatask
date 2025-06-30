SELECT student_id, total
FROM (
    SELECT student_id, SUM(score) AS total
    FROM marks
    GROUP BY student_id
) AS student_totals
WHERE total = (
    SELECT MAX(total)
    FROM (
        SELECT SUM(score) AS total
        FROM marks
        GROUP BY student_id
    ) AS totals
);
