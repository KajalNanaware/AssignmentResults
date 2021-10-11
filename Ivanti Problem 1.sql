Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 3
Server version: 5.1.40-community MySQL Community Server (GPL)

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use Inventory;
Database changed
mysql> CREATE TABLE Cars (
    ->     Manufacturer varchar(255),
    ->     Model varchar(255),
    ->     Price int
    -> );
Query OK, 0 rows affected (0.15 sec)

mysql> Insert into Cars values ('Toyota','Camry',16000);
Query OK, 1 row affected (0.03 sec)

mysql> Insert into Cars values ('Toyota','Highlander',22000);
Query OK, 1 row affected (0.08 sec)

mysql> Insert into Cars values ('Honda','Pilot',24000);
Query OK, 1 row affected (0.07 sec)

mysql> Insert into Cars values ('Honda','Accord',17000);
Query OK, 1 row affected (0.07 sec)

mysql> select * from Cars;
+--------------+------------+-------+
| Manufacturer | Model      | Price |
+--------------+------------+-------+
| Toyota       | Camry      | 16000 |
| Toyota       | Highlander | 22000 |
| Honda        | Pilot      | 24000 |
| Honda        | Accord     | 17000 |
+--------------+------------+-------+
4 rows in set (0.00 sec)

mysql> Select Manufacturer, Model, Price from Cars where Price in (Select max(price) from Cars Group By Manufacturer);
+--------------+------------+-------+
| Manufacturer | Model      | Price |
+--------------+------------+-------+
| Toyota       | Highlander | 22000 |
| Honda        | Pilot      | 24000 |
+--------------+------------+-------+
2 rows in set (0.02 sec)