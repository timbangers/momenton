drop table employees;

create table employees (
  id int auto_increment primary key,
  employee_name varchar(32) not null,
  employee_id int not null,
  manager_id int
);
 
insert into employees (employee_name, employee_id, manager_id) values
  ('Alan', 100, 150),
  ('Martin', 220, 100),
  ('Jamie', 150, null),
  ('Alex', 275, 100),
  ('Steve', 400, 150),
  ('David', 190, 400);
