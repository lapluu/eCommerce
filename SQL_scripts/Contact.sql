USE DATABASE lapEcommerce ;


CREATE TABLE `lapEcommerce`.`contact` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NULL,
  `email` VARCHAR(255) NULL,
  `phone` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;;

  ALTER TABLE `lapEcommerce`.`contact`
  CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ,
  ADD UNIQUE INDEX `id_UNIQUE` (`id` ASC);
  
  
  INSERT INTO `contact` (`name`,`email`,`phone`  ) VALUES ('Barack Obama','baarackobama@yahoo.com','7032234567') ;
  INSERT INTO `contact` (`name`,`email`,`phone`  ) VALUES ('Michelle Obama','michelleobama@yahoo.com','7036232967') ;
  INSERT INTO `contact` (`name`,`email`,`phone`  ) VALUES ('Donald Trump','donaldtrump@gmail.com','2132234267') ;
  INSERT INTO `contact` (`name`,`email`,`phone`  ) VALUES ('George Bush','georgeWBush@hotmail.com','75462233567') ;
  INSERT INTO `contact` (`name`,`email`,`phone`  ) VALUES ('Ivanka Trump','ivanka@gmail.com','3062232561') ;
