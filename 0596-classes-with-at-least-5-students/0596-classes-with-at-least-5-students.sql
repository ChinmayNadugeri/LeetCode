# Write your MySQL query statement below
SELECT class 
FROM Courses
Group BY class
Having COUNT(class)>=5
;