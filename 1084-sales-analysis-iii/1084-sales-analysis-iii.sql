-- Write your PostgreSQL query statement below
SELECT p.product_id,p.product_name
 FROM product p
 INNER JOIN  sales s
 ON p.product_id = s.product_id
 group by  p.product_id,p.product_name
 having MIN(s.sale_date)>= '2019-01-01' AND  Max(s.sale_date) <= '2019-03-31';