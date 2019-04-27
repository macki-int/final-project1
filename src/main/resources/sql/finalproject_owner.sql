--
-- Table structure for table `owner`
--

# DROP TABLE IF EXISTS `owner`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
#  SET character_set_client = utf8mb4 ;
# CREATE TABLE `owner` (
#   `id` bigint(20) NOT NULL AUTO_INCREMENT,
#   `city` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `email` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `first_name` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `last_name` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `number_of_apartment` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `number_of_house` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `phone` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `post_code` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   PRIMARY KEY (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO `owner` VALUES (1,'Gliwice','test@com.com','Adam','Kowalski','10','3a','32 370 06 06','44-100'),(2,'Zabrze','xxx@yyy.y','Zenon','Laskowik','124','1111',NULL,'41-800'),(3,'Katowice',NULL,'Jan','Nowak','10','12',NULL,'40-040');

