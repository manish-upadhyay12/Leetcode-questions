-- Write your PostgreSQL query statement below
SELECT player_id,
       Min(event_date) AS first_login
FROM activity
GROUP BY player_id;