INSERT INTO tb_users(username, email, password) VALUES ('Jailson Mendes', 'jaja@gmail.com', '$2a$10$RsB5BPHXdY2eRotNKWkhv.Wg2wshgsVVNi6OQNSmrbRUGEUd8bMtS');
INSERT INTO tb_users(username, email, password) VALUES ('Paulo Guina', 'paulaojeba@gmail.com', '$2a$10$RsB5BPHXdY2eRotNKWkhv.Wg2wshgsVVNi6OQNSmrbRUGEUd8bMtS');
INSERT INTO tb_users(username, email, password) VALUES ('Jamanta', 'jamanta@gmail.com', '$2a$10$RsB5BPHXdY2eRotNKWkhv.Wg2wshgsVVNi6OQNSmrbRUGEUd8bMtS');
INSERT INTO tb_users(username, email, password) VALUES ('Jumenta', 'jumenta@gmail.com', '$2a$10$RsB5BPHXdY2eRotNKWkhv.Wg2wshgsVVNi6OQNSmrbRUGEUd8bMtS');

INSERT INTO tb_role(authority) VALUES ('ROLE_USER');
INSERT INTO tb_role(authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role(user_id, role_id) VALUES(1, 1);
INSERT INTO tb_user_role(user_id, role_id) VALUES(1, 2);
INSERT INTO tb_user_role(user_id, role_id) VALUES(2, 1);
INSERT INTO tb_user_role(user_id, role_id) VALUES(3, 1);
INSERT INTO tb_user_role(user_id, role_id) VALUES(4, 1);