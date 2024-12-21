CREATE DATABASE portfolio_tracker;

CREATE TABLE stocks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    ticker VARCHAR(50) NOT NULL,
    quantity INT DEFAULT 1,
    buy_price DOUBLE NOT NULL,
    current_price DOUBLE
);
