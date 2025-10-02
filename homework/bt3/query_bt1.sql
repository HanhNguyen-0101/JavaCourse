create database student_db;

create table Student (
	id int auto_increment primary key,
    fullName varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci not null,
    gender varchar(10) CHARACTER SET ascii COLLATE ascii_general_ci,
    age int,
    city varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
    weight float
);

INSERT INTO Student (fullName, gender, age, city, weight)
VALUES ("Nguyen Thanh Nam", "Nam", 19, "Can Tho", 565674),
("Pham Thu Huong", "Nu", 20, "Vinh Long", 72.456),
("Nguyen Nhu Ngoc", "Nu", 20, "Soc Trang", 85.387),
("Bui Thanh Bao", "Nam", 19, "Soc Trang", 49.3),
("Le My Nhan", "Nu", 22, "Can Tho", 62.963),
("Tan Thuc Bao", "Nam", 35, "An Giang", 55.5678),
("Trinh Giao Kim", "Nam", 44, "Bac Lieu", 67.34);

select * from Student where gender like "Nam" order by age desc;

select * from Student where gender like "Nu" limit 2;

select fullName, age from Student where city like "Can Tho" or city like "Soc Trang";



