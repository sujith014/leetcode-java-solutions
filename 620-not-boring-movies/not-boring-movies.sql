# Write your MySQL query statement below

#select * from Cinema
#where id%2 = 1 AND description != 'boring'
#order by rating DESC;

select  id, movie ,description , rating from Cinema
where mod(id,2) = 1 AND description != 'boring'
order by rating DESC;