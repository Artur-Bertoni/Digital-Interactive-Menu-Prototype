-- --------------------------------------------------------
-- Servidor:                     193.123.108.138
-- Versão do servidor:           5.7.35 - MySQL Community Server (GPL)
-- OS do Servidor:               Linux
-- HeidiSQL Versão:              12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para prob2022_2
CREATE DATABASE IF NOT EXISTS `prob2022_2` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `prob2022_2`;

-- Copiando estrutura para tabela prob2022_2.artur_usuario
CREATE TABLE IF NOT EXISTS `artur_usuario` (
  `nome` varchar(200) DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL,
  `senhaConfirm` varchar(50) DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  `ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.artur_usuario: ~1 rows (aproximadamente)
REPLACE INTO `artur_usuario` (`nome`, `senha`, `senhaConfirm`, `tipo`, `ID`) VALUES
	('Artur', '1234', '1234', 1, 1);

-- Copiando estrutura para tabela prob2022_2.bernardo_pessoa
CREATE TABLE IF NOT EXISTS `bernardo_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `sobrenome` varchar(200) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `estadocivil` varchar(10) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `tipodocumento` varchar(10) DEFAULT NULL,
  `numdocumento` varchar(50) DEFAULT NULL,
  `dianasc` varchar(2) DEFAULT NULL,
  `mesnasc` varchar(2) DEFAULT NULL,
  `anonasc` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.bernardo_pessoa: ~1 rows (aproximadamente)
REPLACE INTO `bernardo_pessoa` (`nome`, `sobrenome`, `sexo`, `estadocivil`, `email`, `telefone`, `tipodocumento`, `numdocumento`, `dianasc`, `mesnasc`, `anonasc`) VALUES
	('bernardo', 'oliveira', 'masculino', 'casado', 'teste@teste.com', '519918941', NULL, NULL, NULL, NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.Douglas_pessoa
CREATE TABLE IF NOT EXISTS `Douglas_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `Cep` varchar(10) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.Douglas_pessoa: ~1 rows (aproximadamente)
REPLACE INTO `Douglas_pessoa` (`nome`, `endereco`, `Cep`, `email`) VALUES
	('Douglas', 'Barbara', '92360431', 'douglasmadruga@22gmail.com');

-- Copiando estrutura para tabela prob2022_2.giovanna_pessoa
CREATE TABLE IF NOT EXISTS `giovanna_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `idade` varchar(200) DEFAULT NULL,
  `endereco` varchar(150) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.giovanna_pessoa: ~0 rows (aproximadamente)
REPLACE INTO `giovanna_pessoa` (`nome`, `idade`, `endereco`, `cep`) VALUES
	('giovanna', '18', 'rua taltaltal', '95555000');

-- Copiando estrutura para tabela prob2022_2.lianderson_pessoa
CREATE TABLE IF NOT EXISTS `lianderson_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela prob2022_2.lianderson_pessoa: ~1 rows (aproximadamente)
REPLACE INTO `lianderson_pessoa` (`nome`, `endereco`, `cep`) VALUES
	('Lianderson Franco Brum', 'Rua blallalaa', '912505588');

-- Copiando estrutura para tabela prob2022_2.LucasGarcia_pessoas
CREATE TABLE IF NOT EXISTS `LucasGarcia_pessoas` (
  `Nome` varchar(200) DEFAULT NULL,
  `Endereco` varchar(200) DEFAULT NULL,
  `Cep` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.LucasGarcia_pessoas: ~1 rows (aproximadamente)
REPLACE INTO `LucasGarcia_pessoas` (`Nome`, `Endereco`, `Cep`) VALUES
	('Lucas Silva Garcia', 'Rua José 401', '111');

-- Copiando estrutura para tabela prob2022_2.Maldonado_Pessoa
IF NOT EXISTS ;

-- Copiando dados para a tabela prob2022_2.Maldonado_Pessoa: ~1 rows (aproximadamente)
-- Copiando estrutura para tabela prob2022_2.MariaFischer_Pessoa
IF NOT EXISTS ;

-- Copiando dados para a tabela prob2022_2.MariaFischer_Pessoa: ~0 rows (aproximadamente)
-- Copiando estrutura para tabela prob2022_2.NataA_Pessoa
IF NOT EXISTS ;

-- Copiando dados para a tabela prob2022_2.NataA_Pessoa: ~1 rows (aproximadamente)
-- Copiando estrutura para tabela prob2022_2.Pedro_Pessoa
CREATE TABLE IF NOT EXISTS `Pedro_Pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `cpf` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefone` varchar(200) DEFAULT NULL,
  `rg` varchar(200) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.Pedro_Pessoa: ~0 rows (aproximadamente)
REPLACE INTO `Pedro_Pessoa` (`nome`, `cpf`, `email`, `telefone`, `rg`, `cep`) VALUES
	('Pedro', NULL, NULL, NULL, NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.RafaelPires_Pessoa
CREATE TABLE IF NOT EXISTS `RafaelPires_Pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.RafaelPires_Pessoa: ~1 rows (aproximadamente)
REPLACE INTO `RafaelPires_Pessoa` (`nome`, `cep`, `email`) VALUES
	('rafael pires', '937478', 'ragdhsfh@hdih.com');

-- Copiando estrutura para tabela prob2022_2.Vinicius_pessoa
IF NOT EXISTS ;

-- Copiando dados para a tabela prob2022_2.Vinicius_pessoa: ~1 rows (aproximadamente)
/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
