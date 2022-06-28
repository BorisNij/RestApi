DROP TABLE IF EXISTS Person;

CREATE TABLE Person
(
    id    SERIAL PRIMARY KEY,
    name  varchar(255) NOT NULL,
    email varchar(255) default NULL,
    dob   date
);

INSERT INTO Person (name, email, dob)
VALUES ('Charissa Bryan', 'gravida@outlook.couk', 'May 8, 2017'),
       ('Virginia Hale', 'faucibus@yahoo.edu', 'December 16, 1996'),
       ('Marah Hinton', 'morbi.sit.amet@aol.net', 'June 21, 2020'),
       ('Freya James', 'vestibulum.nec.euismod@protonmail.ca', 'August 3, 1974'),
       ('Seth Holloway', 'arcu@outlook.edu', 'December 14, 1976'),
       ('Jamalia Strickland', 'elit.a.feugiat@google.org', 'May 21, 1952'),
       ('Rhona Sexton', 'quis@icloud.edu', 'January 12, 2014'),
       ('Plato Maxwell', 'nam.consequat.dolor@outlook.couk', 'December 6, 2013'),
       ('Brandon Nichols', 'et.ipsum@hotmail.ca', 'January 17, 2001'),
       ('Kim Valencia', 'nec.ante.blandit@aol.org', 'November 25, 2009');
