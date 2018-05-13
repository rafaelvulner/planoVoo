# Host: localhost  (Version 5.5.5-10.1.16-MariaDB)
# Date: 2017-12-06 14:34:28
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "aviao"
#

DROP TABLE IF EXISTS `aviao`;
CREATE TABLE `aviao` (
  `modelo` varchar(255) NOT NULL,
  `serie` int(11) NOT NULL,
  PRIMARY KEY (`modelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "aviao"
#

INSERT INTO `aviao` VALUES ('E-JET',1),('E2',1),('Phenom',1);

#
# Structure for table "piloto"
#

DROP TABLE IF EXISTS `piloto`;
CREATE TABLE `piloto` (
  `registro` bigint(20) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`registro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "piloto"
#

INSERT INTO `piloto` VALUES (1,'Cabeleira'),(2,'Rafael'),(3,'Lucas'),(45,'Marcos'),(70,'Gabigol');

#
# Structure for table "voo"
#

DROP TABLE IF EXISTS `voo`;
CREATE TABLE `voo` (
  `cod` bigint(20) NOT NULL,
  `cidade_destino` varchar(255) DEFAULT NULL,
  `cidade_origem` varchar(255) DEFAULT NULL,
  `hora_chegada` varchar(255) DEFAULT NULL,
  `hora_partida` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `aviao` varchar(255) DEFAULT NULL,
  `piloto` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`cod`),
  KEY `FKbhxtp29096haroyhio5lju2va` (`aviao`),
  KEY `FKkvffrrmpxje4uw49reiwmtyl6` (`piloto`),
  CONSTRAINT `FKbhxtp29096haroyhio5lju2va` FOREIGN KEY (`aviao`) REFERENCES `aviao` (`modelo`),
  CONSTRAINT `FKkvffrrmpxje4uw49reiwmtyl6` FOREIGN KEY (`piloto`) REFERENCES `piloto` (`registro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "voo"
#

INSERT INTO `voo` VALUES (1,'Rio de Janeiro','Campinas','10:37:42','10:29:38',1,'Phenom',2),(3,'Rio de Janeiro','Campinas','10:36:23','10:35:55',1,'Phenom',2),(15,'EUA','Distrito federal','12:05:37','12:05:05',1,'E-JET',70),(20,'Rio de Janeiro','Amapá','11:39:28','11:39:09',1,'E2',3),(21,'Rio de Janeiro','Amapá','11:52:33','11:52:08',1,'E2',45),(330,'Rio de Janeiro','Amapá','11:33:34','10:40:56',1,'E2',3);
