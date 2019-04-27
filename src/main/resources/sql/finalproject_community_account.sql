--
-- Table structure for table `community_account`
--

# DROP TABLE IF EXISTS `community_account`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
#  SET character_set_client = utf8mb4 ;
# CREATE TABLE `community_account` (
#   `lg` bigint(20) NOT NULL AUTO_INCREMENT,
#   `bank_name` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `inactive` bit(1) NOT NULL,
#   `number` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `community_id` bigint(20) DEFAULT NULL,
#   PRIMARY KEY (`lg`),
#   KEY `FK_COMMUNITY_ID` (`community_id`),
#   CONSTRAINT `FK_COMMUNITY_ID` FOREIGN KEY (`community_id`) REFERENCES `community` (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO `community_account` VALUES (1,'ING Bank SA',_binary '\0','10 1000 1000 1000',1),(2,'PKO BP SA',_binary '\0','11 1111 1111 1111',2);
