--
-- Table structure for table `user`
--

# DROP TABLE IF EXISTS `user`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
#  SET character_set_client = utf8mb4 ;
# CREATE TABLE `user` (
#   `id` bigint(20) NOT NULL AUTO_INCREMENT,
#   `password` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `role` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `username` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `owner_id` bigint(20) DEFAULT NULL,
#   PRIMARY KEY (`id`),
#   KEY `FKsh3pcsylmhgc8oq5hpjlaulnj` (`owner_id`),
#   CONSTRAINT `FKsh3pcsylmhgc8oq5hpjlaulnj` FOREIGN KEY (`owner_id`) REFERENCES `owner` (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;



INSERT INTO `user` VALUES (1,'password1','USER','user1',NULL),(2,'admin','ADMIN','admin',NULL),(3,'password2','WORKER','user2',NULL);
