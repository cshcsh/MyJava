/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50149
Source Host           : localhost:3306
Source Database       : db_bank

Target Server Type    : MYSQL
Target Server Version : 50149
File Encoding         : 65001

Date: 2018-06-21 10:20:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `password` varchar(32) NOT NULL,
  `age` int(11) unsigned NOT NULL,
  `sex` varchar(2) NOT NULL DEFAULT '男',
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('7', 'csh', '123456', '22', '男', '2018-06-20');
INSERT INTO `t_user` VALUES ('9', 'csh', '123456', '22', '男', '2018-06-01');
INSERT INTO `t_user` VALUES ('10', '测试', '测试', '22', '女', '2018-05-31');
INSERT INTO `t_user` VALUES ('11', 'lyy', '888888', '18', '女', '1998-08-08');
INSERT INTO `t_user` VALUES ('12', 'lyy', '888888', '18', '女', '1998-08-08');
INSERT INTO `t_user` VALUES ('13', 'lyy', '888888', '18', '女', '1998-08-08');
