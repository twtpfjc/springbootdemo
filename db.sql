
CREATE DATABASE `test`;

USE `test`;

DROP TABLE IF EXISTS `user_db`;

CREATE TABLE `user_db` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(36) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert  into `user_db`(`id`,`user_name`,`age`) values (1,'111',233),(2,'asdf',43);
