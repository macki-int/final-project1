--
-- Table structure for table `community`
--

# DROP TABLE IF EXISTS `community`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
#  SET character_set_client = utf8mb4 ;
# CREATE TABLE `community` (
#   `id` bigint(20) NOT NULL AUTO_INCREMENT,
#   `city` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `email` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `inactive` bit(1) NOT NULL,
#   `name` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `nip` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `number_of_apartment` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `number_of_house` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `phone` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `post_code` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `street` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   PRIMARY KEY (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO `community` VALUES (1,'Zabrze','a@b.c',_binary '\0','Wspólnota1',NULL,'10','10','32 370 07 07','41-800','Wolności'),(2,'Katowice','aaa@bbb.ccc',_binary '\0','Wspólnota2',NULL,'270','1a','32 000 00 00','40-040','Korfantego'),(3,'Katowice','xxx@xxx.xx',_binary '\0','Wspólnota4',NULL,'8','101c','32 000 00 00','40-041','Korfantego'),(4,'Gliwice','yxx@yyy.y',_binary '\0','Wspólnota5',NULL,'32','1','32 000 00 00','44-101','Zwycięstwa'),(5,'Gliwice','yxx@yyy.y',_binary '\0','Wspólnota7',NULL,'2','111','32 111 00 00','44-101','Kopernika');
