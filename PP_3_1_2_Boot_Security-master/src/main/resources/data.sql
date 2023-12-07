INSERT INTO role (role)
VALUES ('ROLE_USER'),
       ('ROLE_ADMIN');

REPLACE INTO user (password, name, surname, age, email)
VALUES ('$2a$10$dZzTpOh3/QYVoJdN8fqqkuObXVOinWLM64euIYNPdXJnzs85iNLOG', 'admin','adminSurname', '1', 'admin@admin');

REPLACE INTO user (password, name, surname, age, email)
VALUES ('$2a$10$lRp28zdWdIDerCIS4kQ6KeMIuKUL78qNAu.i5ic1VTg03ARpKiCii', 'user','userSurname', '2', 'user@user.com');

INSERT INTO user_roles (user_id, roles_id) VALUES (1, 1),(1, 2);

INSERT INTO user_roles (user_id, roles_id) VALUES (2, 1);