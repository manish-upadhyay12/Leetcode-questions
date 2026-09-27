-- Write your PostgreSQL query statement below
SELECT activity_date as day,
         count(DISTINCT user_id) active_users
FROM Activity 
GROUP BY activity_date
HAVING activity_date BETWEEN '2019-06-28' and '2019-07-27' ;