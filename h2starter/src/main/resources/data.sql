-- Insert sample accounts
INSERT INTO ACCOUNTS (ACC_ID, ACC_NAME, EMAIL, BAL) VALUES
(1, 'Alice Smith', 'alice@mail.com', 5000.00),
(2, 'Bob Johnson', 'bob@mail.com', 3000.50),
(3, 'Charlie Brown', 'charlie@mail.com', 7500.75);

-- Insert sample transactions
INSERT INTO TRANSACTIONS (TRNS_ID, ACC_ID, AMT, TRNS_TYPE, TRNS_TS) VALUES
(1, 1, 250.00, 'debit', CURRENT_TIMESTAMP),
(2, 1, 1500.00, 'credit', CURRENT_TIMESTAMP),
(3, 2, 200.00, 'debit', CURRENT_TIMESTAMP),
(4, 3, 500.00, 'credit', CURRENT_TIMESTAMP),
(5, 3, 100.00, 'debit', CURRENT_TIMESTAMP);
