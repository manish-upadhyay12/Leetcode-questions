-- Write your PostgreSQL query statement below
SELECT e.name AS Employee
from employee e  JOIN employee m
on e.managerId = m.id
WHERE e.salary >m.salary;