# Write your MySQL query statement below
SELECT name as Customers FROM Customers c
left outer join Orders o
on c.id=o.customerId
WHERE customerId IS NULL
;