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
-- Table structure for table `clerk`
--

DROP TABLE IF EXISTS `clerk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clerk` (
  `Clerk_Name` varchar(30) DEFAULT NULL,
  `Clerk_Age` int DEFAULT NULL,
  `Clerk_Address` varchar(50) DEFAULT NULL,
  `Clerk_Password` varchar(15) DEFAULT NULL,
  `Clerk_Date_of_Joining` varchar(15) DEFAULT NULL,
  `Clerk_Contact_Number` varchar(10) DEFAULT NULL,
  `Clerk_EmailID` varchar(30) DEFAULT NULL,
  `Clerk_ID` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clerk`
--

LOCK TABLES `clerk` WRITE;
/*!40000 ALTER TABLE `clerk` DISABLE KEYS */;
INSERT INTO `clerk` VALUES ('Uchiha Itachi',27,'Kyoto','#POET3543','29-09-1996','7985042516','itachi@aiims.com','C123PQR'),('Hardik Mehta',24,'New Delhi','#POTR4312','04-01-1999','4756379823','mehtaop@gmc.com','C355XYZ'),('Aniket Mishra',32,'Lucknow','#HUE8974','13-11-1990','8318544751','aniket543@gmail.com','J786LOU'),('Yogesh Pandey',23,'Varanasi','#YPW2369','29-09-1996','7408818997','yogeshpandey403@gmail.com','P069YPM'),('Yogesh Pandey',23,'Varanasi','#YPW2369','29-09-1996','7408818997','yogeshpandey403@gmail.com','P069YPM'),('Abhishek Mishra',29,'Pune','#AER4985','08-05-1989','8547892654','abhishek234@gmail.com','U582JIL'),('Rohan Sharma',29,'Mumbai','Rohan@1311','12-03-2014','7408818997','rohan12@outlook.com','C754FGT'),('Mahesh Yadav',31,'Patna','Mahesh@13112000','23-09-2018','9389448673','maheshg32@outlook.com','C2319876');
/*!40000 ALTER TABLE `clerk` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-07 23:17:19
