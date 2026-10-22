-- Write your PostgreSQL query statement below
Select *, case 
            when  x+y >z and y+z >x AND x+z >y then 'Yes'
            else 'No'
END AS triangle from triangle;