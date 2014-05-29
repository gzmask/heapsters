CREATE TABLE Entity (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name varchar(255),
    pos_x float,
    pos_y float
);
CREATE TABLE Heapster (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    hp int,
    entity_id int
);
CREATE TABLE Rogue (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    energy int,
    heapster_id int
);
CREATE TABLE User (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    account_name varchar(255),
    password varchar(255),
    user_role int
);
CREATE TABLE User_role (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    role_name varchar(255)
);
CREATE TABLE Warrior (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    power int,
    heapster_id int
);
CREATE TABLE Wizard (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    mp int,
    heapster_id int
);
