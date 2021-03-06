CREATE DATABASE  IF NOT EXISTS `tvplayer` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `tvplayer`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: tvplayer
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `conf_menu`
--

DROP TABLE IF EXISTS `conf_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conf_menu` (
  `cd_empresa` varchar(6) NOT NULL,
  `cd_menu` varchar(6) NOT NULL,
  `nm_menu` varchar(50) NOT NULL,
  `de_menu` varchar(50) DEFAULT NULL,
  `cd_menu_pai` varchar(6) DEFAULT NULL,
  `de_tipo` varchar(20) DEFAULT NULL,
  `de_url` varchar(50) DEFAULT NULL,
  `cd_nivel` smallint(1) NOT NULL DEFAULT '0',
  `de_icone` varchar(20) DEFAULT NULL,
  `cd_usuario_atualizacao` varchar(20) DEFAULT NULL,
  `dt_atualizacao` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`cd_empresa`,`cd_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conf_menu`
--

LOCK TABLES `conf_menu` WRITE;
/*!40000 ALTER TABLE `conf_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `conf_menu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-03 23:36:03
