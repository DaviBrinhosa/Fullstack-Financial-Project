--First Database Import

--Insert the Master access
INSERT INTO main_login (login_id, fullname, birthdate, email, genre, password, username, user_privilege, status, inactive_date) VALUES ('0', 'White Code Paladin', '1500-01-01', 'whitecodepaladin@gmail.com', 'none', 'thisisthepassword@2023', 'whitecodepaladin', 'Master', 'Active', null);
INSERT INTO main_login (login_id, fullname, birthdate, email, genre, password, username, user_privilege, status, inactive_date) VALUES ('1', 'Davi Brinhosa', '1998-03-31', 'davibrinhosa@gmail.com', 'Male', 'thisisthepassword@2023', 'davibrinhosa', 'Pro', 'Active', null);

--Insert some values for test
INSERT INTO main_balance (balance_id, user_id, bank_account, description, transition_date, transition_value, observation) VALUES ('1', '1', 'Itaú', 'Empréstimo', '2023-06-01', '0', null);
INSERT INTO main_balance (balance_id, user_id, bank_account, description, transition_date, transition_value, observation) VALUES ('2', '1', 'Nubank', 'Empréstimo', '2023-06-01', '0', null);
INSERT INTO main_balance (balance_id, user_id, bank_account, description, transition_date, transition_value, observation) VALUES ('3', '1', 'Itaú', 'Cartão Click', '2023-06-01', '620.78', null);
INSERT INTO main_balance (balance_id, user_id, bank_account, description, transition_date, transition_value, observation) VALUES ('4', '1', 'Itaú', 'Cartão Azul Platinum', '2023-06-01', '1308.23', null);
INSERT INTO main_balance (balance_id, user_id, bank_account, description, transition_date, transition_value, observation) VALUES ('5', '1', 'Nubank', 'Cartão Platinum', '2023-06-01', '74.47', null);
INSERT INTO main_balance (balance_id, user_id, bank_account, description, transition_date, transition_value, observation) VALUES ('6', '1', 'Outros', 'Cartão Avô', '2023-06-01', '264.58', null);
INSERT INTO main_balance (balance_id, user_id, bank_account, description, transition_date, transition_value, observation) VALUES ('7', '1', 'Outros', 'Cartão Avó', '2023-06-01', '375.99', null);

--Insert the relation between the login and the users data
INSERT INTO user_balance (login_id, user_id, balance_id) VALUES ('0', '1', '1')
INSERT INTO user_balance (login_id, user_id, balance_id) VALUES ('0', '1', '2')
INSERT INTO user_balance (login_id, user_id, balance_id) VALUES ('0', '1', '3')
INSERT INTO user_balance (login_id, user_id, balance_id) VALUES ('0', '1', '4')
INSERT INTO user_balance (login_id, user_id, balance_id) VALUES ('0', '1', '5')
INSERT INTO user_balance (login_id, user_id, balance_id) VALUES ('0', '1', '6')
INSERT INTO user_balance (login_id, user_id, balance_id) VALUES ('0', '1', '7')