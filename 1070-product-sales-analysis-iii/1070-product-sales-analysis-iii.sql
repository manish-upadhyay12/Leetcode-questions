-- Write your PostgreSQL query statement below
SELECT  product_id,
        year as first_year,
        quantity,
        price
        from sales
        where (product_id,year) in(select product_id,Min(year) from sales group by product_id);
