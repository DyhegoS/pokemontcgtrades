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

INSERT INTO tb_cards(name, type, stage, hp, img, ability) VALUES('Squirtle', 'Water','Basic', 60, 'https://pocket.pokemongohub.net/pt/card/eieqnq8xi26zku6-squirtle', '');
INSERT INTO tb_cards(name, type, stage, hp, img, ability) VALUES('Wartortle', 'Water','Stage 1', 80, 'https://pocket.pokemongohub.net/pt/card/n2qq9203mln1x4p-wartortle', '');
INSERT INTO tb_cards(name, type, stage, hp, img, ability) VALUES('Blastoise', 'Water','Stage 2', 150, 'http://pocket.pokemongohub.net/pt/card/em0jjsjn3hfsnpc-blastoise', '');
INSERT INTO tb_cards(name, type, stage, hp, img, ability) VALUES('Charmander', 'Fire','Basic', 60, 'https://pocket.pokemongohub.net/pt/card/6066ttdk5hv4or2-charmander', '');
INSERT INTO tb_cards(name, type, stage, hp, img, ability) VALUES('Charmeleon', 'Fire','Stage 1', 90, 'https://pocket.pokemongohub.net/pt/card/2d257p127lb548k-charmeleon', '');
INSERT INTO tb_cards(name, type, stage, hp, img, ability) VALUES('Charizard EX', 'Fire','Stage 2', 180, 'https://pocket.pokemongohub.net/pt/card/enusyz58sjlhwhq-charizard-ex', '');
INSERT INTO tb_cards(name, type, stage, hp, img, ability) VALUES('Raikou EX', 'Eletric','Basic', 130, 'https://pocket.pokemongohub.net/pt/card/r940evn122rcw7k-raikou-ex', 'Legendary Pulse');
INSERT INTO tb_cards(name, type, stage, hp, img, ability) VALUES('Mega Pinsir EX', 'Insect','Basic', 170, 'https://pocket.pokemongohub.net/pt/card/j8m3w4pa00490rh-mega-pinsir-ex', '');
INSERT INTO tb_cards(name, type, stage, hp, img, ability) VALUES('Popplio', 'Water','Basic', 60, 'https://pocket.pokemongohub.net/pt/card/9fyeco7mc6f9vcn-popplio', '');

INSERT INTO tb_attacks(name, type, effect, damage) VALUES('Water Gun', 'Water', '', 20);
INSERT INTO tb_attacks(name, type, effect, damage) VALUES('Wave Splash', 'Water', '', 40);
INSERT INTO tb_attacks(name, type, effect, damage) VALUES('Hydro Pump', 'Water', 'If this Pokémon has at least 2 extra [water] Energy attached, this attack does 60 more damage.', 80);
INSERT INTO tb_attacks(name, type, effect, damage) VALUES('Ember', 'Fire', 'Discard a Fire Energy from this Pokémon', 30);
INSERT INTO tb_attacks(name, type, effect, damage) VALUES('Combustion', 'Fire', '', 40);
INSERT INTO tb_attacks(name, type, effect, damage) VALUES('Slash', 'Normal', '', 60);
INSERT INTO tb_attacks(name, type, effect, damage) VALUES('Crimson Storm', 'Fire', 'Discard 2 fire energy from this pokémon', 200);
INSERT INTO tb_attacks(name, type, effect, damage) VALUES('Voltaic Bullet', 'Electric', 'This attack also does 10 damage to 1 of your opponents Benched Pokémon', 60);
INSERT INTO tb_attacks(name, type, effect, damage) VALUES('Critical Scissors', 'Insect', 'Flip a coin. If heads, this attack does 70 more damge', 80);

INSERT INTO tb_card_attack(card_id, attack_id) VALUES(1, 1);
INSERT INTO tb_card_attack(card_id, attack_id) VALUES(2, 2);
INSERT INTO tb_card_attack(card_id, attack_id) VALUES(3, 3);
INSERT INTO tb_card_attack(card_id, attack_id) VALUES(4, 4);
INSERT INTO tb_card_attack(card_id, attack_id) VALUES(5, 5);
INSERT INTO tb_card_attack(card_id, attack_id) VALUES(6, 6);
INSERT INTO tb_card_attack(card_id, attack_id) VALUES(6, 7);
INSERT INTO tb_card_attack(card_id, attack_id) VALUES(7, 8);
INSERT INTO tb_card_attack(card_id, attack_id) VALUES(8, 9);
INSERT INTO tb_card_attack(card_id, attack_id) VALUES(9, 1);

