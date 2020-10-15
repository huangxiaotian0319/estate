CREATE DATABASE IF NOT EXISTS `estate_manage_sys` default charset utf8 COLLATE utf8_general_ci;

USE `estate_manage_sys`;
drop TABLE if EXISTS `admin_info`;
CREATE TABLE IF NOT EXISTS `admin_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `name` varchar(255) DEFAULT NULL COMMENT '登录名',
 `pass_word` varchar(255) DEFAULT NULL COMMENT '登录密码',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='管理员';


drop TABLE if EXISTS `user_info`;
CREATE TABLE IF NOT EXISTS `user_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `name` varchar(255) DEFAULT NULL COMMENT '登录名',
 `pass_word` varchar(255) DEFAULT NULL COMMENT '登录密码',
 `real_name` varchar(255) DEFAULT NULL COMMENT '姓名',
 `cel_phone` varchar(255) DEFAULT NULL COMMENT '手机号',
 `wy_fee` double(10,2) DEFAULT NULL COMMENT '每月物业费',
 `car_fee` double(10,2) DEFAULT NULL COMMENT '车位费',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户';


drop TABLE if EXISTS `car_point_info`;
CREATE TABLE IF NOT EXISTS `car_point_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `car_no` varchar(255) DEFAULT NULL COMMENT '车位编号',
 `car_img` varchar(200) DEFAULT NULL COMMENT '车位图',
 `address` varchar(255) DEFAULT NULL COMMENT '车位地址',
 `is_used` int(11) DEFAULT NULL COMMENT '使用状态',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='车位';


drop TABLE if EXISTS `news_info`;
CREATE TABLE IF NOT EXISTS `news_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `title` varchar(255) DEFAULT NULL COMMENT '标题',
 `content` text  COLLATE utf8_bin DEFAULT NULL COMMENT '新闻内容',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='新闻';


drop TABLE if EXISTS `notice_info`;
CREATE TABLE IF NOT EXISTS `notice_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `title` varchar(255) DEFAULT NULL COMMENT '标题',
 `content` varchar(1000) DEFAULT NULL COMMENT '公告内容',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='公告';


drop TABLE if EXISTS `complain_info`;
CREATE TABLE IF NOT EXISTS `complain_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `complain_content` varchar(1000) DEFAULT NULL COMMENT '投诉内容',
 `reply_content` varchar(1000) DEFAULT NULL COMMENT '回复内容',
 `is_deal` int(11) DEFAULT NULL COMMENT '是否已处理',
 `user_id` int(11) DEFAULT NULL COMMENT '投诉用户',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='投诉';


drop TABLE if EXISTS `car_user_info`;
CREATE TABLE IF NOT EXISTS `car_user_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `user_id` int(11) DEFAULT NULL COMMENT '使用用户',
 `car_id` int(11) DEFAULT NULL COMMENT '车位id',
 `used_status` int(11) DEFAULT NULL COMMENT '使用状态',
 `month_fee` double(10,2) DEFAULT NULL COMMENT '每月费用',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='车位分配';


drop TABLE if EXISTS `fee_log`;
CREATE TABLE IF NOT EXISTS `fee_log` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `user_id` int(11) DEFAULT NULL COMMENT '用户id',
 `wy_fee` double(10,2) DEFAULT NULL COMMENT '物业费',
 `car_fee` double(10,2) DEFAULT NULL COMMENT '车位费',
 `is_jf` int(11) DEFAULT NULL COMMENT '是否已缴费',
 `log_date` varchar(30) DEFAULT NULL COMMENT '记录日期',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='每月费用';



INSERT INTO `estate_manage_sys`.`admin_info` (`id`,`name`,`pass_word`,`create_time`)  VALUES('1','admin','123','2020-03-10 02:10:48');
INSERT INTO `estate_manage_sys`.`admin_info` (`id`,`name`,`pass_word`,`create_time`)  VALUES('2','admin1','123','2020-03-21 23:10:48');
INSERT INTO `estate_manage_sys`.`admin_info` (`id`,`name`,`pass_word`,`create_time`)  VALUES('3','admin2','123','2020-03-22 11:10:48');
INSERT INTO `estate_manage_sys`.`admin_info` (`id`,`name`,`pass_word`,`create_time`)  VALUES('4','admin3','123','2020-03-13 19:10:48');
INSERT INTO `estate_manage_sys`.`admin_info` (`id`,`name`,`pass_word`,`create_time`)  VALUES('5','admin4','123','2020-03-20 22:10:48');
INSERT INTO `estate_manage_sys`.`user_info` (`id`,`name`,`pass_word`,`real_name`,`cel_phone`,`wy_fee`,`car_fee`,`create_time`)  VALUES('1','user','123','姓名0','手机号0','73.2','0.0','2020-03-18 10:10:48');
INSERT INTO `estate_manage_sys`.`user_info` (`id`,`name`,`pass_word`,`real_name`,`cel_phone`,`wy_fee`,`car_fee`,`create_time`)  VALUES('2','user1','123','姓名1','手机号1','35.1','0.0','2020-03-27 07:10:48');
INSERT INTO `estate_manage_sys`.`user_info` (`id`,`name`,`pass_word`,`real_name`,`cel_phone`,`wy_fee`,`car_fee`,`create_time`)  VALUES('3','user2','123','姓名2','手机号2','49.0','0.0','2020-03-26 04:10:48');
INSERT INTO `estate_manage_sys`.`user_info` (`id`,`name`,`pass_word`,`real_name`,`cel_phone`,`wy_fee`,`car_fee`,`create_time`)  VALUES('4','user3','123','姓名3','手机号3','33.1','0.0','2020-03-29 18:10:48');
INSERT INTO `estate_manage_sys`.`user_info` (`id`,`name`,`pass_word`,`real_name`,`cel_phone`,`wy_fee`,`car_fee`,`create_time`)  VALUES('5','user4','123','姓名4','手机号4','27.6','0.0','2020-03-27 07:10:48');
INSERT INTO `estate_manage_sys`.`car_point_info` (`id`,`car_no`,`car_img`,`address`,`is_used`,`create_time`)  VALUES('1','车位编号0','http://122.51.88.71/example_img/example8.jpg','车位地址0','1','2020-03-13 05:10:48');
INSERT INTO `estate_manage_sys`.`car_point_info` (`id`,`car_no`,`car_img`,`address`,`is_used`,`create_time`)  VALUES('2','车位编号1','http://122.51.88.71/example_img/example6.jpg','车位地址1','1','2020-03-31 21:10:48');
INSERT INTO `estate_manage_sys`.`car_point_info` (`id`,`car_no`,`car_img`,`address`,`is_used`,`create_time`)  VALUES('3','车位编号2','http://122.51.88.71/example_img/example4.jpg','车位地址2','1','2020-03-22 12:10:48');
INSERT INTO `estate_manage_sys`.`car_point_info` (`id`,`car_no`,`car_img`,`address`,`is_used`,`create_time`)  VALUES('4','车位编号3','http://122.51.88.71/example_img/example2.jpg','车位地址3','2','2020-04-01 04:10:48');
INSERT INTO `estate_manage_sys`.`car_point_info` (`id`,`car_no`,`car_img`,`address`,`is_used`,`create_time`)  VALUES('5','车位编号4','http://122.51.88.71/example_img/example5.jpg','车位地址4','2','2020-03-10 12:10:48');
INSERT INTO `estate_manage_sys`.`news_info` (`id`,`title`,`content`,`create_time`)  VALUES('1','标题0','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2020-03-28 04:10:48');
INSERT INTO `estate_manage_sys`.`news_info` (`id`,`title`,`content`,`create_time`)  VALUES('2','标题1','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2020-03-07 10:10:48');
INSERT INTO `estate_manage_sys`.`news_info` (`id`,`title`,`content`,`create_time`)  VALUES('3','标题2','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2020-03-29 04:10:48');
INSERT INTO `estate_manage_sys`.`news_info` (`id`,`title`,`content`,`create_time`)  VALUES('4','标题3','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2020-03-30 04:10:48');
INSERT INTO `estate_manage_sys`.`news_info` (`id`,`title`,`content`,`create_time`)  VALUES('5','标题4','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2020-03-30 13:10:48');
INSERT INTO `estate_manage_sys`.`notice_info` (`id`,`title`,`content`,`create_time`)  VALUES('1','标题0','公告内容0','2020-03-16 17:10:48');
INSERT INTO `estate_manage_sys`.`notice_info` (`id`,`title`,`content`,`create_time`)  VALUES('2','标题1','公告内容1','2020-03-23 18:10:48');
INSERT INTO `estate_manage_sys`.`notice_info` (`id`,`title`,`content`,`create_time`)  VALUES('3','标题2','公告内容2','2020-03-22 11:10:48');
INSERT INTO `estate_manage_sys`.`notice_info` (`id`,`title`,`content`,`create_time`)  VALUES('4','标题3','公告内容3','2020-03-08 01:10:48');
INSERT INTO `estate_manage_sys`.`notice_info` (`id`,`title`,`content`,`create_time`)  VALUES('5','标题4','公告内容4','2020-03-05 14:10:48');
INSERT INTO `estate_manage_sys`.`complain_info` (`id`,`complain_content`,`reply_content`,`is_deal`,`user_id`,`create_time`)  VALUES('1','投诉内容0','回复内容0','1','2','2020-03-28 15:10:48');
INSERT INTO `estate_manage_sys`.`complain_info` (`id`,`complain_content`,`reply_content`,`is_deal`,`user_id`,`create_time`)  VALUES('2','投诉内容1','回复内容1','1','2','2020-03-27 03:10:48');
INSERT INTO `estate_manage_sys`.`complain_info` (`id`,`complain_content`,`reply_content`,`is_deal`,`user_id`,`create_time`)  VALUES('3','投诉内容2','回复内容2','2','3','2020-03-23 03:10:48');
INSERT INTO `estate_manage_sys`.`complain_info` (`id`,`complain_content`,`reply_content`,`is_deal`,`user_id`,`create_time`)  VALUES('4','投诉内容3','回复内容3','2','4','2020-03-18 20:10:48');
INSERT INTO `estate_manage_sys`.`complain_info` (`id`,`complain_content`,`reply_content`,`is_deal`,`user_id`,`create_time`)  VALUES('5','投诉内容4','回复内容4','1','4','2020-03-13 18:10:48');
