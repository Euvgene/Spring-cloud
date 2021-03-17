CREATE TABLE `products`
(
    `product_id` bigint(15)   NOT NULL AUTO_INCREMENT,
    `title_fld`  varchar(255) NOT NULL,
    `price_fld`   int(11)   DEFAULT NULL,


    PRIMARY KEY (`product_id`)
);
insert into products (title_fld, price_fld)
values ('Boots', 5499),
       ('Hat', 1499),
       ('Bag', 1459),
       ('Cookies', 199),
       ('Phone', 15499),
       ('Tomato', 199),
       ('Sausage', 299),
       ('Herring', 299);