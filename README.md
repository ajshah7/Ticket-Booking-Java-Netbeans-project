# Ticket-Booking-Java-Netbeans-project by Ajmal Shah.
A java Ticket booking Application created using Netbeans and dbms as backend

This is a mini Project created for collage using java as frontend and Dbms as backend.

The default database details is given bellow for the easy working of this project.
DataBase is created using MySQL 8.0

Two plugings are used to support DataBase to the frontend in Netbeans:
  ->mysql-connector-java-8.0.13 
  ->rs2xml.jar
  
  There are 3 tables the :
  
    1) customer with attributes:  +----------+-------------+------+-----+---------+-------+
                                  | Field    | Type        | Null | Key | Default | Extra |
                                  +----------+-------------+------+-----+---------+-------+
                                  | c_name   | char(30)    | YES  |     | NULL    |       |
                                  | username | varchar(30) | NO   | PRI | NULL    |       |
                                  | mobile   | varchar(12) | YES  |     | NULL    |       |
                                  | password | varchar(30) | YES  |     | NULL    |       |
                                  +----------+-------------+------+-----+---------+-------+
                                
                                
       
    2) admin with attributes:     Field    | Type        | Null | Key | Default | Extra |
                                  +----------+-------------+------+-----+---------+-------+
                                  | adminid  | varchar(30) | NO   | PRI | NULL    |       |
                                  | password | varchar(30) | YES  |     | NULL    |       |
                                  +----------+-------------+------+-----+---------+-------+
                                  
                      
    3)tickets with attributes:    +-------------+-------------+------+-----+---------+----------------+
                                  | Field       | Type        | Null | Key | Default | Extra          |
                                  +-------------+-------------+------+-----+---------+----------------+
                                  | username    | varchar(30) | YES  |     | NULL    |                |
                                  | ref         | int(11)     | NO   | PRI | NULL    | auto_increment |
                                  | source      | varchar(30) | YES  |     | NULL    |                |
                                  | destination | varchar(30) | YES  |     | NULL    |                |
                                  | Amount      | varchar(30) | YES  |     | NULL    |                |
                                  +-------------+-------------+------+-----+---------+----------------+
