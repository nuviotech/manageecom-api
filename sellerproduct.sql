-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sellerproduct
-- ------------------------------------------------------
-- Server version	5.7.40-log

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
-- Table structure for table `images`
--

DROP TABLE IF EXISTS `images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `images` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alternative_text` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `product_product_reference_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5nvjnoc653v0h5lnbjbqaledl` (`product_product_reference_id`),
  CONSTRAINT `FK5nvjnoc653v0h5lnbjbqaledl` FOREIGN KEY (`product_product_reference_id`) REFERENCES `product` (`product_reference_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
INSERT INTO `images` VALUES (1,NULL,'1.jpg','https://m.media-amazon.com/images/I/81ogWT4liAL._SX679_.jpg','1'),(2,NULL,'2.jpg','https://m.media-amazon.com/images/I/410UOtOGvsL._SX300_SY300_QL70_FMwebp_.jpg','1'),(3,NULL,'3.jpg','https://m.media-amazon.com/images/I/812YsUxpyfL._SX679_.jpg','2'),(4,NULL,'4.jpg','https://m.media-amazon.com/images/I/71Rp7CjAp0L._SX679_.jpg','2'),(5,NULL,'5.jpg','https://m.media-amazon.com/images/I/71gidIbQa7L._SX679_.jpg','1'),(6,NULL,'6.jpg','https://d2xamzlzrdbdbn.cloudfront.net/products/974e92e6-bb3c-4763-a258-08211666bff822221149.jpg','3'),(7,NULL,'7.jpg','https://d2xamzlzrdbdbn.cloudfront.net/products/90485660-2aa6-49e1-9fac-5d072a0cd28f22221149.jpg','3'),(8,NULL,'6.jpg','https://d2xamzlzrdbdbn.cloudfront.net/products/d7b03544-0e88-4b71-8b48-725e652a882722221149.jpg','3'),(9,NULL,'9.jpg','https://d2xamzlzrdbdbn.cloudfront.net/products/b7d3ef13-040a-4d3f-b96e-b04a9aedac6c22291126.jpg','3');
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `product_reference_id` varchar(255) NOT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `depot` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `image_url1` varchar(255) DEFAULT NULL,
  `image_url2` varchar(255) DEFAULT NULL,
  `image_url3` varchar(255) DEFAULT NULL,
  `image_url4` varchar(255) DEFAULT NULL,
  `image_url5` varchar(255) DEFAULT NULL,
  `inventory` int(11) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `is_featured` bit(1) DEFAULT NULL,
  `is_hot` bit(1) DEFAULT NULL,
  `is_out_of_stock` bit(1) NOT NULL,
  `is_sale` bit(1) NOT NULL,
  `material` varchar(255) DEFAULT NULL,
  `mrp` double DEFAULT NULL,
  `review` int(11) NOT NULL,
  `sale_price` double NOT NULL,
  `sku` varchar(255) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `vendor` varchar(255) DEFAULT NULL,
  `store_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_reference_id`),
  KEY `FKro853f48x04ic7qfjxxqiblvv` (`store_id`),
  CONSTRAINT `FKro853f48x04ic7qfjxxqiblvv` FOREIGN KEY (`store_id`) REFERENCES `stores` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('1','Oppo','red',NULL,45,'This is best technogy phone in upcomming 5g phones','url1','ur2','url3','url4','url5',80,_binary '',_binary '',_binary '\0',_binary '\0',_binary '','plastic',15000,4,14000,'123455432112345','phones and technogy','Oppo m-star 2380',NULL,'12','R.k shop',1),('2','Samsung','red',NULL,45,'This is best technogy phone in upcomming 5g phones','url1','ur2','url3','url4','url5',80,_binary '',_binary '',_binary '\0',_binary '\0',_binary '','plastic',15000,4,14000,'123455432112345','phones and technogy','Samsung 2380',NULL,'12','R.k shop',1),('3','Oppo','black',NULL,40,'This is best gaming phone','url1','url2','url3','url4','url5',30,_binary '',_binary '',_binary '\0',_binary '\0',_binary '','plastic',13000,5,12500,'123455432112345','oppo','Oppo K20',NULL,'12','R.k shop',1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales_order`
--

DROP TABLE IF EXISTS `sales_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sales_order` (
  `channel_order_id` varchar(255) NOT NULL,
  `buyer_name` varchar(255) DEFAULT NULL,
  `buyer_phone_number` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `channel_id` int(11) DEFAULT NULL,
  `ship_city` varchar(255) DEFAULT NULL,
  `cod_collectible_amount` varchar(255) DEFAULT NULL,
  `ship_country` varchar(255) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `ship_date` datetime(6) DEFAULT NULL,
  `fulfilled_by` varchar(255) DEFAULT NULL,
  `invoice_number` varchar(255) DEFAULT NULL,
  `payment_method` varchar(255) DEFAULT NULL,
  `ship_postal_code` varchar(255) DEFAULT NULL,
  `recipient_name` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `ship_phone_number` varchar(255) DEFAULT NULL,
  `shipping_address1` varchar(255) DEFAULT NULL,
  `shipping_address2` varchar(255) DEFAULT NULL,
  `shipping_address3` varchar(255) DEFAULT NULL,
  `sold_price` varchar(255) DEFAULT NULL,
  `ship_state` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `warehouse_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`channel_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales_order`
--

LOCK TABLES `sales_order` WRITE;
/*!40000 ALTER TABLE `sales_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `sales_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales_order_item`
--

DROP TABLE IF EXISTS `sales_order_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sales_order_item` (
  `sales_order_item_id` int(11) NOT NULL AUTO_INCREMENT,
  `sales_order_id` int(11) DEFAULT NULL,
  `item_name` varchar(1000) DEFAULT NULL,
  `item_price` varchar(255) DEFAULT NULL,
  `item_tax` varchar(255) DEFAULT NULL,
  `order_item_status` varchar(255) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `shipping_price` varchar(255) DEFAULT NULL,
  `sku` varchar(255) DEFAULT NULL,
  `sold_price` double DEFAULT NULL,
  `tax_amount` double DEFAULT NULL,
  `tax_rate` double DEFAULT NULL,
  `tax_type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`sales_order_item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales_order_item`
--

LOCK TABLES `sales_order_item` WRITE;
/*!40000 ALTER TABLE `sales_order_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `sales_order_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `stock_id` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `sku` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stock_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stores`
--

DROP TABLE IF EXISTS `stores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stores`
--

LOCK TABLES `stores` WRITE;
/*!40000 ALTER TABLE `stores` DISABLE KEYS */;
INSERT INTO `stores` VALUES (1,'At pune m.g road bhabha nagar,234312',NULL,'R.k Shop','3456789078','Electronis and technology',NULL);
/*!40000 ALTER TABLE `stores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-01 11:34:16
