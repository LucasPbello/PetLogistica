                                -- Criando o banco de dados
DROP DATABASE IF EXISTS petlogistica;
CREATE DATABASE petlogistica;
USE petlogistica;




-- Tabela Cliente --
CREATE TABLE Cliente (
idCliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(100) NOT NULL,
 cpf VARCHAR(20) NOT NULL UNIQUE,
 email VARCHAR(100) NOT NULL,
 telefone VARCHAR(30) NOT NULL
    );
    
-- Tabela Taxi --
CREATE TABLE Taxi (
    idTaxi INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    enderecoColeta VARCHAR(200),
    enderecoEntrega VARCHAR(200),
    idCliente INT,
FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
ON DELETE CASCADE
ON UPDATE CASCADE
    );
    
    -- Tabela Financeiro --
CREATE TABLE Financeiro (
idFinanceiro INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
clienteTotal DECIMAL(10,2) NOT NULL,
clienteSinal DECIMAL(10,2) NOT NULL,
gastoEmpresa DECIMAL(15,2) NOT NULL,
pagamentoFuncionarios DECIMAL(8,2) NOT NULL,
lucroTotal DECIMAL(20,2) GENERATED ALWAYS AS 
(clienteTotal - gastoEmpresa - pagamentoFuncionarios) STORED,
idCliente INT NOT NULL,
FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
ON DELETE CASCADE
ON UPDATE CASCADE
);
 

 
 -- Tabela Animal --
CREATE TABLE Animal (
 idAnimal INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(100) NOT NULL,
 especie VARCHAR(50) NOT NULL,
 raca VARCHAR(30) NOT NULL,
 sexo VARCHAR(30) NOT NULL,
 cor VARCHAR(30) NOT NULL,
 peso DECIMAL (10,2) NOT NULL,
 tamanho DECIMAL (10,2) NOT NULL,
 caixaTransporte INT NOT NULL,
 dataNascimento DATE NOT NULL,
 documentos MEDIUMBLOB NULL,
 imagens MEDIUMBLOB NULL,
 idCliente INT NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
    ON DELETE CASCADE
ON UPDATE CASCADE
    );
    
        -- Tabela Origem e Destino --
CREATE TABLE OrigemDestino (
 idOrigemDestino INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 paisOrigem VARCHAR(45) NOT NULL,
 paisDestino VARCHAR(45) NOT NULL,
 enderecoPaisOrigem VARCHAR(200) NOT NULL,
 enderecoPaisDestino VARCHAR(200) NOT NULL,
 companhiaAerea VARCHAR(100) NOT NULL,
 idAnimal INT NOT NULL,
    FOREIGN KEY (idAnimal) REFERENCES Animal(idAnimal)
    ON DELETE CASCADE
    ON UPDATE CASCADE
 );
 
   
   
   -- CRIAÇÃO DA TABELA ENDEREÇO --
   
   CREATE TABLE Endereco (
	idEndereco INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    rua VARCHAR(255) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(200) NOT NULL,
    cep VARCHAR (50) NOT NULL,
    cidade VARCHAR (100) NOT NULL,
    estado VARCHAR (100) NOT NULL,
    idCliente INT NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
    ON DELETE CASCADE
ON UPDATE CASCADE
    );
    
    

-- CRIAÇÃO DA TABELA VACINAS --
CREATE TABLE Vacina (
 idVacina INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
 microchip VARCHAR(100) ,
 microchipAplicacao DATE ,
 vacinaNome VARCHAR(100) ,
 lote VARCHAR(100) ,
 vacinaMarca VARCHAR(100) ,
 vacinaAplicacao DATE ,
 vacinaValidade DATE ,
 carteirinha MEDIUMBLOB NULL,
 idAnimal INT NOT NULL,
 FOREIGN KEY (idAnimal) REFERENCES Animal(idAnimal)
 ON DELETE CASCADE
ON UPDATE CASCADE
    );
    
    CREATE TABLE Usuario (
    idUsuario INT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(50) NOT NULL,
    tipo VARCHAR(20) NOT NULL
);



       -- Inserindo dados nas tabelas--

    -- Inserindo dados na tabela Cliente --
 
 INSERT INTO Cliente (nome, CPF, email, telefone) VALUES
('Carlos Silva', '466.546.244-72', 'carlos.silva@gmail.com', '(11) 98765-4321'),
('Ana Costa', '234.543.478-88', 'ana.costa@gmail.com', '(21) 91234-5678'),
('Marcos Dias', '767.321.672-92', 'marcos.dias@gmail.com', '(51) 93456-7890'),
('Luciana Lima', '112.235.345-23', 'luciana.lima@gmail.com', '(51) 92321-2367'),
('João Pedro', '098.967.542-21', 'joao.pedro@gmail.com', '(81) 99876-5432');

    
-- Inserindo dados na tabela Endereço --

INSERT INTO Endereco (Rua, numero, Bairro, CEP, Cidade, Estado, idCliente) VALUES 
('Rua 2', 121, 'Teresópolis', '85294-785', 'Porto Alegre', 'Porto Alegre', 1),
('Lot 5', 130, 'Leblon', '25875-111', 'Rio de Janeiro', 'Rio de Janeiro', 2),
('Res 785',	2000, 'Costinha', '74152-554', 'São Paulo', 'São Paulo', 3),
('71 Cherry Court', 3000, 'Londres', 'SW1 1AA', 'Londres', 'Inglaterra', 4),
('Panasu', 525, 'Capim Fino', '20128-231', 'Jau', 'São Paulo', 5);





-- Inserindo dados na tabela Taxi--

INSERT INTO Taxi (EnderecoColeta, EnderecoEntrega, idCliente) VALUES 
('Pet Hotel - São Bernardo do campo', 'Aeroporto de Garulhos', 1),
('Pet Hotel - São Bernardo do campo', 'Aeroporto de Garulhos', 2),
('Res 785 - Costinha - 74152-554 - São Paulo', 'Aeroporto de Garulhos', 3),
('Aeroporto de Garulhos', 'Pet Hotel - São Bernardo do campo', 4),
('Pet Hotel - São Bernardo do campo', 'Aeroporto de Garulhos', 5);

-- Inserindo dados na tabela Financeiro -

INSERT INTO Financeiro (ClienteTotal, ClienteSinal, GastoEmpresa, PagamentoFuncionarios, idCliente) VALUES 
(12000.00, 1200.00, 7000.00, 4000.00,  1),
(8000.00, 800.00, 5000.00, 2000.00,  2),
(5100.50, 510.25, 2350.50, 1750.00,  3 ),
(16200.00, 1620.00, 10000.00, 4000.00,  4),
(3000.00, 300.00, 1000.00, 500.00,  5);

-- Inserindo dados na tabela Animal--


INSERT INTO Animal (nome, Especie, Raca, Sexo, Cor, Peso, Tamanho, CaixaTransporte, DataNascimento, Documentos, Imagens, idCliente) VALUES
('Anastacia', 'Canina', 'SRD', 'Fêmea', 'Preta e Marrom', 12.5, 32.5, '500', '2020-07-31', 'C:\Documentos','C:\Fotos', 1),
('Alecrim', 'Canina', 'SRD', 'Macho', 'Branco e Preto', 10.05, 25.5, '400', '2022-03-12', 'C:\Documentos','C:\Fotos', 1),
('Brutus', 'Canina', 'Buldogue Francês', 'Macho', 'Preto', 11.00, 12.0, '300', '2018-05-23', 'C:\Documentos','C:\Fotos', 2),
('Beyonce', 'Felina', 'SRD', 'Fêmea', 'Preta e Branca', 7.5, 8.2, '200', '2022-04-22', 'C:\Documentos','C:\Fotos', 3),
('Samuel', 'Felina', 'Siamês', 'Macho', 'Bege', 8.5, 8.0, '300', '2018-12-25', 'C:\Documentos','C:\Fotos', 4),
('Thor', 'Canina', 'Pit bull', 'Macho', 'Marrom e branco', 35.5, 42.05, '700', '2023-01-31', 'C:\Documentos','C:\Fotos', 5);


INSERT INTO OrigemDestino (PaisOrigem, PaisDestino, CompanhiaAerea, enderecoPaisOrigem, enderecoPaisDestino, idAnimal) VALUES 
('Brasil', 'Alemanha', 'Lufthansa', 'Porto Alegre', 'Frankfurt', 1),
('Brasil', 'Canada', 'Air Canada', 'Rio de Janeiro', 'Toronto', 1),
('Brasil', 'Estados Unidos', 'Latam', 'São Paulo', 'Chicago', 2),
('Inglaterra', 'Brasil', 'Lufthansa', 'Londres', 'São Paulo', 3),
('Brasil', 'Emirados Árabes', 'Emirates', 'São Paulo', 'Dubai', 4);

-- Inserindo dados na tabela Vacinas-

INSERT INTO Vacina (Microchip, Microchipaplicacao, VacinaNome, Lote, VacinaMarca, VacinaAplicacao, VacinaValidade, Carteirinha, idAnimal) VALUES
('963.003.001.547.332', '2024-03-05', 'Drontal Plus', '005/24', 'Elanco', '2024-03-05', '2025-05-03', 'Foto', 1),
('963.003.001.547.333', '2024-03-05', 'Drontal Plus', '005/24', 'Elanco', '2024-03-05', '2025-03-05', 'Foto', 2),
('956.006.005.234.212', '2023-03-01','Canigen® R', '003/23', 'Virbac', '2023-03-01', '2023-03-01', 'Foto', 3),
('923.002.004.677.155', '2022-10-20', 'Canigen® R', '010/22', 'Virbac', '2022-12-22', '2023-03-05', 'Foto', 4),
('963.003.001.547.453', '2024-04-10', 'Rabsin®-i', '004/24', 'Boehringer', '2024-04-10', '2025-04-10', 'Foto', 5),
('963.003.001.558.777', '2025-02-08', 'Rabsin®-i', '008/25', 'Boehringer', '2025-02-09', '2026-02-09', 'Foto', 6);

INSERT INTO Usuario (login, senha, tipo) VALUES 
('gerente', '123', 'Gerente'),
('atendente', '123', 'Atendente'),
('financeiro', '123', 'Financeiro'),
('transportador', '123', 'Transportador');

    
  

