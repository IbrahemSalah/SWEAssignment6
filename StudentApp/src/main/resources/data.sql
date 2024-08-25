INSERT IGNORE address (id, street, zip, city)  values (1, 'street 1', 'zip 1', 'city1');
INSERT IGNORE address (id, street, zip, city)  values (2, 'street 2', 'zip 2', 'city2');
INSERT IGNORE address (id, street, zip, city)  values (3, 'street 3', 'zip 3', 'city3');
INSERT IGNORE address (id, street, zip, city)  values (4, 'street 4', 'zip 4', 'city4');
INSERT IGNORE address (id, street, zip, city)  values (5, 'street 5', 'zip 5', 'city5');

INSERT IGNORE category (id, name)  values (1, 'category 1');
INSERT IGNORE category (id, name)  values (2, 'category 2');

INSERT IGNORE product (id, name, color, price, id_category)  values (1, 'product 1', 'red', 500, 1);
INSERT IGNORE product (id, name, color, price, id_category)  values (2, 'product 2', 'blue', 200, 1);
INSERT IGNORE product (id, name, color, price ,id_category)  values (3, 'product 3', 'blue', 100, 2);

INSERT IGNORE user (id, email, password, first_name, last_name, id_address)  values (1, 'a@a.com', '123', 'a','a',1);
INSERT IGNORE user (id, email, password, first_name, last_name, id_address)  values (2, 'b@b.com', '123', 'b','b',2);

INSERT IGNORE review (id, comment, id_product, id_user)  values (1, 'good product', 1, 1);
INSERT IGNORE review (id, comment, id_product, id_user)  values (2, 'bad product', 2, 1);

