--
-- Table structure for table `estate_manager`
--

# DROP TABLE IF EXISTS `estate_manager`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
#  SET character_set_client = utf8mb4 ;
# CREATE TABLE `estate_manager` (
#   `id` bigint(20) NOT NULL AUTO_INCREMENT,
#   `city` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `email` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `logo` longblob,
#   `name` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `nip` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `number_of_apartment` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `number_of_house` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `phone` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `post_code` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `street` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   PRIMARY KEY (`id`)
# ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estate_manager`
--

LOCK TABLES `estate_manager` WRITE;
/*!40000 ALTER TABLE `estate_manager` DISABLE KEYS */;
/*!40000 ALTER TABLE `estate_manager` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-26 19:49:53
