--
-- Table structure for table `invoice`
--

# DROP TABLE IF EXISTS `invoice`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
#  SET character_set_client = utf8mb4 ;
# CREATE TABLE `invoice` (
#   `id` bigint(20) NOT NULL AUTO_INCREMENT,
#   `amount` decimal(19,2) DEFAULT NULL,
#   `description` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `invoice_date` datetime(6) DEFAULT NULL,
#   `number` varchar(255) COLLATE utf8_polish_ci DEFAULT NULL,
#   `payment_date` datetime(6) DEFAULT NULL,
#   `id_apartment` bigint(20) DEFAULT NULL,
#   `id_owner` bigint(20) DEFAULT NULL,
#   PRIMARY KEY (`id`),
#   KEY `FKcj026ltnhk0i52u3qs5ier1w9` (`id_apartment`),
#   KEY `FKell7s72nwk7eclu3x6ydh6bb5` (`id_owner`),
#   CONSTRAINT `FKcj026ltnhk0i52u3qs5ier1w9` FOREIGN KEY (`id_apartment`) REFERENCES `apartment` (`id`),
#   CONSTRAINT `FKell7s72nwk7eclu3x6ydh6bb5` FOREIGN KEY (`id_owner`) REFERENCES `owner` (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO `invoice` VALUES (1,150.00,'Faktura','2019-10-10 00:00:00.000000','2154/FA',NULL,1,2),(2,100.00,'FAktura','2019-01-02 00:00:00.000000','3215/FA','2019-01-30 00:00:00.000000',3,3);
