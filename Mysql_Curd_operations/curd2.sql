--  1.   create database employee;

-- 2. use employee;



-- 3. INSERT operation

  -- INSERT INTO employees VALUES(1, 'Vaishnavi', 'IT', 500000);
-- 4.mysql> insert into employees values(2,'nilesh','IT',300000);
-- Query OK, 1 row affected (0.01 sec)

-- mysql> INSERT INTO employees values(3,'saniya','IT',40000);
-- Query OK, 1 row affected (0.01 sec)


 5. mysql> insert into employees values(4,'ankita','IT', 468646);
Query OK, 1 row affected (0.02 sec)

--  6. READ operation
 
  mysql> select * from employees;
+--------+-----------+------------+--------+
| emp_id | emp_name  | department | salary |
+--------+-----------+------------+--------+
|      1 | Vaishnavi | IT         | 500000 |
|      2 | nilesh    | IT         | 300000 |
|      3 | saniya    | IT         |  40000 |
|      4 | ankita    | IT         | 468646 |
+--------+-----------+------------+--------+
4 rows in set (0.00 sec)




mysql> select * from employees
    -> where salary > 10000;
+--------+-----------+------------+--------+
| emp_id | emp_name  | department | salary |
+--------+-----------+------------+--------+
|      1 | Vaishnavi | IT         | 500000 |
|      2 | nilesh    | IT         | 300000 |
|      3 | saniya    | IT         |  40000 |
|      4 | ankita    | IT         | 468646 |
+--------+-----------+------------+--------+
4 rows in set (0.00 sec)




SELECT * FROM EMPLOYEES
    -> WHERE EMP_NAME = 'VAISHNAVI';
+--------+-----------+------------+--------+
| emp_id | emp_name  | department | salary |
+--------+-----------+------------+--------+
|      1 | Vaishnavi | IT         | 500000 |
+--------+-----------+------------+--------+
1 row in set (0.00 sec)


 SELECT * FROM EMPLOYEES
    -> WHERE EMP_NAME = 'SANIYA';
+--------+----------+------------+--------+
| emp_id | emp_name | department | salary |
+--------+----------+------------+--------+
|      3 | saniya   | IT         |  40000 |
+--------+----------+------------+--------+
1 row in set (0.00 sec)


mysql> select * from employees;select * from employees;
+--------+-----------+------------+--------+
| emp_id | emp_name  | department | salary |
+--------+-----------+------------+--------+
|      1 | Vaishnavi | IT         | 500000 |
|      2 | nilesh    | IT         |  40000 |
|      3 | saniya    | IT         |  40000 |
|      4 | ankita    | IT         | 468646 |
+--------+-----------+------------+--------+