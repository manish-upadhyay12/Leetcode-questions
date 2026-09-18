-- Write your PostgreSQL query statement below
SELECT p.product_name , sum(o.unit) AS unit 
from products p
INNER JOIN orders o
ON p.product_id = o.product_id
WHERE EXTRACT(MONTH FROM o.order_date) =2 AND EXTRACT(YEAR FROM o.order_date) = 2020
GROUP BY p.product_name
HAVING sum(o.unit) >=100 ;