# Write your MySQL query statement below
DELETE FROM person
WHERE id NOT IN(
    Select id from(
    SELECT Min(id) as id 
    FROM person
    GROUP BY email
)as temp
);