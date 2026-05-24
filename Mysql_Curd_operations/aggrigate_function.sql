-- AGGRIGATE FUNCTIONS....

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| batch1320          |
| college            |
| company            |
| employee           |
| information_schema |
| libarary           |
| library            |
| mysql              |
| performance_schema |
| studentdb          |
| sys                |
+--------------------+
11 rows in set (0.02 sec)

mysql> use company;
Database changed
mysql> create table employeerecord;
ERROR 1050 (42S01): Table 'employeerecord' already exists
mysql> create table employeerecord(id int,name varchar(50), salary int);
ERROR 1050 (42S01): Table 'employeerecord' already exists
mysql> select * from employeerecord;
+------+-----------+-----------+---------------------+----------+---------+
| id   | name      | salary    | email               | mob_numb | country |
+------+-----------+-----------+---------------------+----------+---------+
|    1 | vaishnavi |     30000 | vaishnavi@gmail.com | 68939893 | India   |
|    2 | sneha     |    479689 | sneha@gmail.com     | 42735378 | usa     |
|    3 | usha      | 368478999 | usha@gmail.com      |  1234565 | America |
|    4 | seema     |  25000000 | seema@gmail.com     | 53744944 | uk      |
+------+-----------+-----------+---------------------+----------+---------+
4 rows in set (0.00 sec)

mysql> select min(salary)
    -> from employeerecord;
+-------------+
| min(salary) |
+-------------+
|       30000 |
+-------------+
1 row in set (0.00 sec)

mysql> select max (salary)
    -> from employeerecord;
ERROR 1630 (42000): FUNCTION company.max does not exist. Check the 'Function Name Parsing and Resolution' section in the Reference Manual
mysql> from employeerecord;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'from employeerecord' at line 1
mysql>
mysql> from employeerecord;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'from employeerecord' at line 1
mysql> select min(salary)
    -> from employeerecord;
+-------------+
| min(salary) |
+-------------+
|       30000 |
+-------------+
1 row in set (0.00 sec)

mysql> select max(salary)
    -> from employeerecord;
+-------------+
| max(salary) |
+-------------+
|   368478999 |
+-------------+
1 row in set (0.00 sec)

mysql> select count(*)
    -> from employeerecord;
+----------+
| count(*) |
+----------+
|        4 |
+----------+
1 row in set (0.01 sec)

mysql> select avg(salary)
    -> from employeerecord;
+---------------+
| avg(salary)   |
+---------------+
| 98497172.0000 |
+---------------+
1 row in set (0.00 sec)

mysql> select sum(salary)
    -> from employeerecord;
+-------------+
| sum(salary) |
+-------------+
|   393988688 |
+-------------+
1 row in set (0.00 sec)

mysql>




































