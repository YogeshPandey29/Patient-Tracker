-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hospital
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS `prescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prescription` (
  `prescription_date` varchar(15) NOT NULL,
  `doctor_id` varchar(10) DEFAULT NULL,
  `patient_number` varchar(10) DEFAULT NULL,
  `problem_description` mediumtext,
  `prescribed_med_name` varchar(50) DEFAULT NULL,
  `alternate_med_name` varchar(50) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `dosage` int DEFAULT NULL,
  `additional_notes` mediumtext,
  `next_consultation_date` varchar(15) DEFAULT NULL,
  `consultation_id` varchar(20) DEFAULT NULL,
  `prescription_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`prescription_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescription`
--

LOCK TABLES `prescription` WRITE;
/*!40000 ALTER TABLE `prescription` DISABLE KEYS */;
INSERT INTO `prescription` VALUES ('12-07-2020','D4576','P9013','Acute case of malaria with sinus swelling','CalpolMX','Levodoc',10,2,'NA','20-07-2020','CL8927','PR67981'),('13-11-2000','D7656','P9453','Mild cough with acute cold and nausea','Zupar MX','Calpol 200mg',10,2,'Regular blood test report and blood pressure','19-11-2000','C23452','PR45912'),('29-09-2016','D2391','P8902','Snake bite in the left earlobe, along with first stage gangrene','CroFab','FabAV',26,3,'Sudden steep rise in blood pressure, along with lung contraction','08-10-2016','C2098','PR38901');
/*!40000 ALTER TABLE `prescription` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-07 23:17:20
