CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    city VARCHAR(50),
    age INT,
    total_purchase DECIMAL(10,2)
);

INSERT INTO customer VALUES
(1, 'Pandi', 'pandi@mail.com', 'Chennai', 25, 1500.50),
(2, 'Dharani', 'dharani@mail.com', 'Bangalore', 30, 2000.00),
(3, 'Vasanth', 'vasanth@mail.com', 'Delhi', 28, 1200.75),
(4, 'Ganesh', 'ganesh@mail.com', 'Chennai', 35, 3000.00),
(5, 'Kevin', 'kevin@mail.com', 'Mumbai', 22, 900.00);


SELECT * FROM customer
WHERE city = 'Chennai';

SELECT * FROM customer
WHERE total_purchase > 1000;

SELECT * FROM customer
ORDER BY total_purchase DESC;

