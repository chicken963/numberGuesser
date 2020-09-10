DROP TABLE IF EXISTS USERS;

CREATE TABLE USER (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) not null,
    last_name VARCHAR(250) not null,
    email VARCHAR(250) default null,
    isAdmin boolean not null
);