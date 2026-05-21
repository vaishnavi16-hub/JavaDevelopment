-- CURD OPERATIONS IN MY SQL.........

-- 1.  CREATE DATABASE studentdb;
-- 2.use studentdb;
-- 3. insert into student values(1,'vaishnavi','AIML');

 
4. select * from student;
+----+-----------+--------+
| id | name      | course |
+----+-----------+--------+
|  1 | vaishnavi | AIML   |
-- +----+-----------+--------+

mysql> SELECT * FROM STUDENT;
+----+--------+----------+
| id | name   | course   |
+----+--------+----------+
|  1 | nilesh | computer |
+----+--------+----------+
1 row in set (0.00 sec)

mysql> SHOW TABLES;
+---------------------+
| Tables_in_studentdb |
+---------------------+
| student             |
| students            |
+---------------------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM STUDENTS;
+----+-----------+--------+
| id | name      | course |
+----+-----------+--------+
|  1 | VAISHNAVI | AIML   |
|  2 | SANIYA    | AIML   |
|  3 | NILESH    | AIML   |
+----+-----------+--------+
3 rows in set (0.00 sec)

mysql> UPDATE STUDENTS
    -> SET COURSE ='AI'
    -> WHERE ID = 1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT * FROM STUDENTS;
+----+-----------+--------+
| id | name      | course |
+----+-----------+--------+
|  1 | VAISHNAVI | AI     |
|  2 | SANIYA    | AIML   |
|  3 | NILESH    | AIML   |
+----+-----------+--------+
3 rows in set (0.00 sec)

mysql> DELETE FROM STUDENTS
    -> WHERE ID = 3;
Query OK, 1 row affected (0.02 sec)

mysql> SELECT * FROM STUDENTS;
+----+-----------+--------+
| id | name      | course |
+----+-----------+--------+
|  1 | VAISHNAVI | AI     |
|  2 | SANIYA    | AIML   |
+----+-----------+--------+
2 rows in set (0.00 sec)

mysql>




























































