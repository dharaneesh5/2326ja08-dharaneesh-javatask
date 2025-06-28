CREATE TABLE sales (
    sale_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    category VARCHAR(100),
    quantity INT,
    price DECIMAL(10,2),
    sale_date DATE
);

--Total revenue per category:
SELECT category, SUM(quantity * price) AS total_revenue
FROM sales
GROUP BY category;

--Monthly sales summary:
SELECT MONTH(sale_date) AS sale_month, SUM(quantity * price) AS revenue
FROM sales
GROUP BY MONTH(sale_date)
ORDER BY sale_month;


--Average quantity sold per product:
SELECT product_name, AVG(quantity) AS avg_quantity
FROM sales
GROUP BY product_name;