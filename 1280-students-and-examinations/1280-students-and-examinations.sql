

        -- Write your PostgreSQL query statement below
SELECT s.student_id ,
       s.student_name,
       su.subject_name,
       count(ex.subject_name)  AS Attended_exams
FROM students s
cross join subjects su
left join examinations ex
on s.student_id   = ex.student_id AND su.subject_name = ex.subject_name
GROUP BY s.student_id,s.student_name,su.subject_name
ORDER BY s.student_id,s.student_name ,su.subject_name asc;
