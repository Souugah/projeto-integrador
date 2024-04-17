Create database ClinicaveterinariaBD;

-- Criar tabela clientes
CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    endereco VARCHAR(255),
    cpf VARCHAR(14) NOT NULL,
    bairro VARCHAR(255),
    estado VARCHAR(255),
    telefone VARCHAR(20)
);

-- Criar tabela pets
CREATE TABLE pet (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    raca VARCHAR(255),
    especie VARCHAR(255),
    data_nascimento DATE,
    sexo VARCHAR(10),
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id)  ON DELETE CASCADE
);

ALTER TABLE pet MODIFY data_nascimento VARCHAR(30);

-- Criar tabela veterinarios
CREATE TABLE veterinario (
	id INT AUTO_INCREMENT PRIMARY KEY,
    crmv VARCHAR(15) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    telefone VARCHAR(20)
);

-- Inserir dados de exemplo
-- Dados para tabela clientes
INSERT INTO cliente (nome, cpf, telefone) VALUES 
    ('Cliente1', '123.456.789-01', '123-456-7890'),
    ('Cliente2', '987.654.321-09', '987-654-3210'),
    ('Cliente3', '111.222.333-44', '111-222-3333');

-- Dados para tabela pets
INSERT INTO pet (nome, especie, id_cliente) VALUES 
    ('Pet1', 'Cachorro', 1),
    ('Pet2', 'Gato', 2),
    ('Pet3', 'Pássaro', 3);

-- Dados para tabela veterinarios
INSERT INTO veterinario (crmv, nome, cpf, telefone) VALUES 
    ('CRMV123', 'Veterinario1', '111.222.333-44', '555-555-5555'),
    ('CRMV456', 'Veterinario2', '222.333.444-55', '666-666-6666'),
    ('CRMV789', 'Veterinario3', '333.444.555-66', '777-777-7777');
    
  
Select * from pet;
Select * from cliente;
select * from veterinario;
