-- Write your PostegreSQL query statement below
SELECT today.Id
 FROM weather AS yesterday
JOIN Weather AS today
ON today.recordDate  = yesterday.recordDate +1
where today.temperature > yesterday.temperature;