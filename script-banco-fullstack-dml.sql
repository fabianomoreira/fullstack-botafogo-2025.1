-- COMANDOS DE MANIPULAÇÃO DE DADOS (DML)

SELECT * FROM pessoa;
SELECT nome FROM pessoa;
SELECT nome FROM pessoa ORDER BY nome DESC;

INSERT INTO pessoa(nome, cidade) VALUES('Almir José', 'Rio de Janeiro');
INSERT INTO pessoa(nome, cidade) VALUES('Clementino Paz', 'São Paulo');
INSERT INTO pessoa(nome, cidade) VALUES('Valdomiro José', 'Rio Grande');

UPDATE pessoa SET cidade = 'Rio Grande do Sul' WHERE id = 4;

DELETE FROM pessoa WHERE id = 2;
DELETE FROM pessoa WHERE id > 6;

SELECT * FROM pessoa WHERE nome LIKE 'Luc%';