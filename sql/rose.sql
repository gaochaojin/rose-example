/*
Navicat MySQL Data Transfer

Source Server         : gaocahojin
Source Server Version : 50623
Source Host           : localhost:3306
Source Database       : rose

Target Server Type    : MYSQL
Target Server Version : 50623
File Encoding         : 65001

Date: 2019-03-08 11:08:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
