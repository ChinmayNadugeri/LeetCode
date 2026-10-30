# Write your MySQL query statemen
SELECT D.name as Department, E.name as Employee, E.salary as Salary
FROM Employee E
JOIN Department D ON E.departmentId=D.id
WHERE E.salary =(
    SELECT Max(salary)
    FROM Employee
    WHERE departmentId=E.departmentId
);