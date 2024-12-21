-- Create the database
CREATE DATABASE portfolio_tracker;

-- Use the database
USE portfolio_tracker;

-- Create the stocks table
CREATE TABLE stocks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY, -- Unique ID for each stock
    name VARCHAR(255) NOT NULL,           -- Name of the stock
    ticker VARCHAR(50) NOT NULL,          -- Stock ticker symbol
    quantity INT DEFAULT 1,               -- Quantity of stock (default is 1)
    buy_price DOUBLE NOT NULL,            -- Purchase price of the stock
    current_price DOUBLE                  -- Current price of the stock
);

-- Optional: Insert sample data for testing
INSERT INTO stocks (name, ticker, quantity, buy_price, current_price) VALUES
('Apple Inc.', 'AAPL', 1, 150.00, 180.00),
('Tesla, Inc.', 'TSLA', 1, 700.00, 800.00),
('Microsoft Corporation', 'MSFT', 1, 250.00, 310.00),
('Amazon.com, Inc.', 'AMZN', 1, 3300.00, 3400.00),
('Google LLC', 'GOOGL', 1, 2800.00, 2900.00);
