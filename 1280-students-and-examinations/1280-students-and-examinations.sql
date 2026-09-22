-- Write your PostgreSQL query statement below
SELECT s.student_id ,
       s.student_name,
       su.subject_name,
       count(e.subject_name)  AS Attended_exams
from students s 
cross join subjects su
left join examinations e
ON s.student_id  = e.student_id  AND su.subject_name = e.subject_name 
group by  s.student_id ,s.student_name,su.subject_name
ORDER BY s.student_id , s.student_name ASC;