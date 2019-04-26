
--
-- Table structure for table `apartment`
--

# DROP TABLE IF EXISTS `apartment`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
#  SET character_set_client = utf8mb4 ;
# CREATE TABLE `apartment` (
#   `id` bigint(20) NOT NULL AUTO_INCREMENT,
#   `city` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `inactive` bit(1) NOT NULL,
#   `number_of_apartment` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `number_of_house` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `post_code` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `street` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `community_id` bigint(20) DEFAULT NULL,
#   `owner_id` bigint(20) DEFAULT NULL,
#   PRIMARY KEY (`id`),
#   KEY `FKmcmqrbn11lc3d91b4wa7p4ih7` (`community_id`),
#   KEY `FK7t1un6qju29sa9xgcoytdedhi` (`owner_id`),
#   CONSTRAINT `FK7t1un6qju29sa9xgcoytdedhi` FOREIGN KEY (`owner_id`) REFERENCES `owner` (`id`),
#   CONSTRAINT `FKmcmqrbn11lc3d91b4wa7p4ih7` FOREIGN KEY (`community_id`) REFERENCES `owner` (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO `apartment` VALUES (1,'Zabrze',_binary '\0','10','11a','41-800','Nowaka',1,2),(2,'Zabrze',_binary '\0','31','1','41-800','Kowalska',1,1),(3,'Zabrze',_binary '\0','2','11a','41-800','Nowaka',1,3);
