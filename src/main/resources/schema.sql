DROP TABLE IF EXISTS EXPENSES;
CREATE TABLE EXPENSES
(
    ID          INT AUTO_INCREMENT PRIMARY KEY,
    COST        DOUBLE NOT NULL,
    NAME        VARCHAR(50) NOT NULL,
    DESCRIPTION VARCHAR(100)
)