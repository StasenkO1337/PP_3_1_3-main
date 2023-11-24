INSERT INTO role (role)
VALUES ('ROLE_USER'),
       ('ROLE_ADMIN');

REPLACE INTO user (password, name, surname, age, email,login)
VALUES ('$2a$10$dZzTpOh3/QYVoJdN8fqqkuObXVOinWLM64euIYNPdXJnzs85iNLOG', 'admin','adminSurname', '1', 'admin@admin','admin');

REPLACE INTO user (password, name, surname, age, email,login)
VALUES ('$2a$10$dADXUt/Z6DgP7uMCrFXKoOQpH1E5huEssDkBJtf/1FcP/crx5rCdO', 'user','userSurname', '1', 'user@user.com','user');

INSERT INTO user_roles (user_id, roles_id) VALUES (1, 1),(1, 2);

INSERT INTO user_roles (user_id, roles_id) VALUES (2, 1);