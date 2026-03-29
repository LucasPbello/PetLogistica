                                -- Criando o banco de dados
DROP DATABASE IF EXISTS petlogistica;
CREATE DATABASE petlogistica;
USE petlogistica;




-- Tabela Cliente --
CREATE TABLE Cliente (
idCliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(100) NOT NULL,
 cpf VARCHAR(20) NOT NULL UNIQUE,
 email VARCHAR(100) NOT NULL UNIQUE,
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
clienteTotal DECIMAL(8,2) NOT NULL,
clienteSinal DECIMAL(6,2) NOT NULL,
gastoEmpresa DECIMAL(15,2) NOT NULL,
pagamentoFuncionarios DECIMAL(8,2) NOT NULL,
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
 companhiaAerea VARCHAR(100) NOT NULL
 );
 

 
 -- Tabela Animal --
CREATE TABLE Animal (
 idAnimal INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(100) NOT NULL,
 raca VARCHAR(30) NOT NULL,
 cor VARCHAR(30) NOT NULL,
 peso DECIMAL (5,2) NOT NULL,
 tamanho DECIMAL (5,2) NOT NULL,
 caixaTransporte INT NOT NULL,
 dataNascimento DATE NOT NULL,
 microchip VARCHAR(100) NOT NULL,
 carteirinha MEDIUMBLOB,
 documentos MEDIUMBLOB,
 imagens MEDIUMBLOB,
 idCliente INT NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
    ON DELETE CASCADE
ON UPDATE CASCADE,
 idOrigemDestino INT NOT NULL,
    FOREIGN KEY (idOrigemDestino) REFERENCES OrigemDestino(idOrigemDestino)
    ON DELETE CASCADE
ON UPDATE CASCADE
    );
    
    -- Normalização de dados da Tabela Cliente --
   
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
    
    

-- Normalização de dados da Tabela Animal  --

-- CRIAÇÃO DA TABELA VACINAS --
CREATE TABLE Vacina (
 idVacina INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
 vacinaNome VARCHAR(100) ,
 vacinaMarca VARCHAR(100) ,
 vacinaAplicacao DATE ,
 vacinaValidade DATE ,
 idAnimal INT NOT NULL,
 FOREIGN KEY (idAnimal) REFERENCES Animal(idAnimal)
 ON DELETE CASCADE
ON UPDATE CASCADE
    );
    
  

