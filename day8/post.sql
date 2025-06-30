CREATE TABLE department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(100),
    location VARCHAR(100)
);

CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    email VARCHAR(100),
    salary DECIMAL(10,2),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);

INSERT INTO department VALUES
(1, 'HR', 'Chennai'),
(2, 'Finance', 'Mumbai'),
(3, 'Engineering', 'Bangalore'),
(4, 'Sales', 'Delhi'),
(5, 'Support', 'Hyderabad');

INSERT INTO employee VALUES
(101, 'Pandi', 'pandi@company.com', 50000.00, 3),
(102, 'Dharani', 'dharani@company.com', 45000.00, 1),
(103, 'Vasanth', 'vasanth@company.com', 60000.00, 3),
(104, 'Ganesh', 'ganesh@company.com', 48000.00, 2),
(105, 'Kevin', 'kevin@company.com', 47000.00, 4);
