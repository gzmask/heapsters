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

CREATE TABLE Entity (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name varchar(255),
    node_id int,
    pos_x float,
    pos_y float
);

CREATE TABLE Wall (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    node_id, int,
    point1_x float,
    point1_y float,
    point2_x float,
    point2_y float,
    texture varchar(255)
);

CREATE TABLE Heapster (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    hp int,
    entity_id int,
    user_id int
);

CREATE TABLE Warrior (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    power int,
    heapster_id int
);

CREATE TABLE Rogue (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    energy int,
    heapster_id int
);

CREATE TABLE Wizard (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    mp int,
    heapster_id int
);

CREATE TABLE Dungeon (
    id INTEGER PRIMARY KEY AUTOINCREMENT
);

CREATE TABLE Node (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    left_node_id int,
    right_node_id int,
    parent_node_id int,
    dungeon_id int
);

insert into User_role (id, role_name) values (1, "developer");
insert into User_role (id, role_name) values (2, "manager");
insert into User_role (id, role_name) values (3, "player");

insert into User (id, account_name, password, user_role) values (1, "gzmask", "123456", 1);
insert into User (id, account_name, password, user_role) values (2, "daisy", "123456", 2);

insert into Dungeon (id) values (1);
insert into Node (id, left_node_id, right_node_id, parent_node_id, dungeon_id) values (1, 2, 3, null, 1);
insert into Node (id, left_node_id, right_node_id, parent_node_id, dungeon_id) values (2, 4, 5, null, 1);
insert into Node (id, left_node_id, right_node_id, parent_node_id, dungeon_id) values (3, 6, 7, null, 1);

insert into Entity (id, name, node_id, pos_x, pos_y) values (1, "gzmask", 1, 0.0, 0.0);
insert into Heapster (id, hp, entity_id, user_id) values (1, 100, 1, 1);
insert into Rogue (id, energy, heapster_id) values (1, 100, 1);
