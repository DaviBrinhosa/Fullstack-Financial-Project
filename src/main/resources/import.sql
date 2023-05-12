--First Database Import

--Insert the Master access
INSERT INTO main_login (login_id, fullname, birthdate, email, genre, password, username, user_privilege, status, inactive_date) VALUES ('0', 'White Code Paladin', '1998-03-31', 'whitecodepaladin@gmail.com', 'none', 'thisisthepassword@2023', 'whitecodepaladin', 'Master', 'Active', null);

--Insert some values for test
INSERT INTO main_balance (balance_id, user_id, description, transition_date, transition_value, observation) VALUES ('1', '0', 'Cartão Lauro', '2023-06-01', '264.58', null);
INSERT INTO main_balance (balance_id, user_id, description, transition_date, transition_value, observation) VALUES ('2', '0', 'Cartão Elisabete', '2023-06-01', '375.99', null);
INSERT INTO main_balance (balance_id, user_id, description, transition_date, transition_value, observation) VALUES ('3', '0', 'Cartão Itaú Click', '2023-06-01', '620.78', null);
INSERT INTO main_balance (balance_id, user_id, description, transition_date, transition_value, observation) VALUES ('4', '0', 'Cartão Itaú Azul Platinum', '2023-06-01', '1308.23', null);
INSERT INTO main_balance (balance_id, user_id, description, transition_date, transition_value, observation) VALUES ('5', '0', 'Itaú - Empréstimo', '2023-06-01', '0', null);
INSERT INTO main_balance (balance_id, user_id, description, transition_date, transition_value, observation) VALUES ('6', '0', 'Nubank - Cartão', '2023-06-01', '74.47', null);
INSERT INTO main_balance (balance_id, user_id, description, transition_date, transition_value, observation) VALUES ('7', '0', 'Nubank - Empréstimo', '2023-06-01', '0', null);