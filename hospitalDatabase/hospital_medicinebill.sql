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
-- Table structure for table `medicinebill`
--

DROP TABLE IF EXISTS `medicinebill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicinebill` (
  `patient_id` varchar(20) NOT NULL,
  `doctor_name` varchar(45) DEFAULT NULL,
  `consultation_date` varchar(15) DEFAULT NULL,
  `prescription_number` varchar(20) DEFAULT NULL,
  `doctor_id` varchar(10) DEFAULT NULL,
  `prescription_date` varchar(15) DEFAULT NULL,
  `medicine_id` varchar(20) DEFAULT NULL,
  `patient_number` varchar(10) DEFAULT NULL,
  `consumption_qty` int DEFAULT NULL,
  `consultation_fee` int DEFAULT NULL,
  `medicine_cost` int DEFAULT NULL,
  `total_cost` int DEFAULT NULL,
  `payment_mode` varchar(20) DEFAULT NULL,
  `cc_number` varchar(30) DEFAULT NULL,
  `bill_payment_status` varchar(1) DEFAULT NULL,
  `next_consultation_date` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicinebill`
--

LOCK TABLES `medicinebill` WRITE;
/*!40000 ALTER TABLE `medicinebill` DISABLE KEYS */;
INSERT INTO `medicinebill` VALUES ('P3682','Namikaze Minato','11-11-2020','29847','D8412','12-11-2020','M7409','P9502',7,600,3100,3700,'cheque','1879','n','03-12-20210'),('P5739','Dr. Raman Singh','12-02-2019','58710','D4801','12-02-2019','MS7826','P7120',3,700,1500,3500,'Cash','7896','Y','21-02-2019'),('P9876','Killua Zoldyck','05-09-2018','23452','D45637','05-09-2018','M7865','P78978',4,500,900,1400,'cash','1564','y','16-09-2018');
/*!40000 ALTER TABLE `medicinebill` ENABLE KEYS */;
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
