SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blockchain
-- ----------------------------
DROP TABLE IF EXISTS `blockchain`;
CREATE TABLE `blockchain` (
  `blockchain_id` int(11) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL ,
  `type` varchar(255) NOT NULL ,
  `shortname` varchar(10),
  PRIMARY KEY (`blockchain_id`),
  UNIQUE `idx_name_type`(`name`,`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 auto_increment=1;

INSERT INTO `blockchain` VALUES ('1', 'Bitcoin', 'main', 'BTC');
INSERT INTO `blockchain` VALUES ('2', 'Bitcoin', 'testnet', 'BTCTest');
INSERT INTO `blockchain` VALUES ('3', 'Ethereum', 'main', 'ETH');

