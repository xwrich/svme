/*
 Navicat Premium Data Transfer

 Source Server         : mysql80
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3307
 Source Schema         : fruit

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 19/07/2021 14:22:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fruit
-- ----------------------------
DROP TABLE IF EXISTS `fruit`;
CREATE TABLE `fruit`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sale` int(11) NULL DEFAULT NULL,
  `icon` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fruit
-- ----------------------------
INSERT INTO `fruit` VALUES (1, '小小柠檬', 102, 'https://img.lanrentuku.com/img/allimg/1602/14565371942789.jpg');
INSERT INTO `fruit` VALUES (2, '青桔', 304, 'https://img.lanrentuku.com/img/allimg/1603/1458782439107.jpg');
INSERT INTO `fruit` VALUES (3, '草莓', 210, 'https://img.lanrentuku.com/img/allimg/1601/14525710732236.jpg');
INSERT INTO `fruit` VALUES (6, '猕猴桃', 501, 'https://img.lanrentuku.com/img/allimg/1503/14265952953401.jpg');
INSERT INTO `fruit` VALUES (16, '西瓜', 59, 'https://scpic.chinaz.net/files/pic/pic9/201908/bpic13253.jpg');

SET FOREIGN_KEY_CHECKS = 1;
