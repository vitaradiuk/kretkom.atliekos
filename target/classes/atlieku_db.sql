CREATE TABLE `street`(
`id` int(10) NOT NULL AUTO_INCREMENT,
`street_name` varchar(50) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `waste`(
`id` int(10) NOT NULL AUTO_INCREMENT,
`waste_name` varchar(50) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `wastecollection`(
`id` int(10) NOT NULL AUTO_INCREMENT,
`street_id` int(10) NOT NULL,
`waste_id` int(10) NOT NULL,
`wasteCollect_date` varchar(19) NOT NULL,
PRIMARY KEY (`id`), FOREIGN KEY (`street_id`) REFERENCES `street` (`id`), FOREIGN KEY (`waste_id`) REFERENCES `waste` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
