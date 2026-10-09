-- Write your PostgreSQL query statement below
SELECT customer_id
FROM customer 

GROUP BY customer_id
HAVING count(Distinct product_key) = (select count(*) from  product)
order by customer_id;