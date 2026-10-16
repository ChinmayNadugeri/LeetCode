# Write your MySQL query statement below
SELECT today.id FROM Weather yest
CROSS JOIN Weather today
WHERE DATEDIFF(today.recordDate,yest.recordDate)=1 AND today.temperature>yest.temperature;