






INSERT INTO category(`category_name`, `category_image`)  VALUES('electronic','no image');
INSERT INTO category(`category_name`, `category_image`)  VALUES('cosmetic','no image');
INSERT INTO category(`category_name`, `category_image`)  
VALUES('hardware','no image');
INSERT INTO category(`category_name`, `category_image`)  
VALUES('Fashion','no image');
INSERT INTO category(`category_name`, `category_image`)  
VALUES('Toys','no image');
INSERT INTO category(category_name, category_image)  
VALUES('Clothings','no image');
INSERT INTO category(category_name, category_image)  
VALUES('Beauty & Personal Care','no image');


UPDATE category(cat_id, category_name, category_image)  
VALUES(7, 'Beauty & Personal Care','A 倚天屠龙记 Q');




INSERT INTO products( name,cat_id,description,price, sellprice,color,size,product_status, quantity,date,plimit ) 
VALUES ('Head phone',1,'BlueTooth head phone with gesture control', 15, 13, 'Pink', '11',DEFAULT,25,DEFAULT,DEFAULT) ;


INSERT INTO products(name,cat_id,description,price, sellprice ,color,size,product_status, quantity,date,plimit)
 VALUES ('Cellphone',1,'Google Pixel 4 XL 64  GB', 950, 900, 'Pink','6mm', DEFAULT, 200, DEFAULT,DEFAULT) ;


INSERT INTO products( name,cat_id,description,price, sellprice,color,size,product_status, quantity,date,plimit ) 
VALUES ('Head phone',1,'BlueTooth head phone with gesture control', 15, 13, 'Pink', '11',DEFAULT,25,DEFAULT,DEFAULT) ;


INSERT INTO faq( title,description ) 
VALUES ('Payment Methods','Paying with a Credit, Debit, or Gift Card') ;

CREATE TABLE IF NOT EXISTS `products2` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `cat_id` INT NOT NULL,
  `description` varchar(300) NOT NULL,
  FOREIGN KEY(cat_id) REFERENCES category( cat_id )
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
  
  +--------+------------------------+--------------------+
| cat_id | category_name          | category_image     |
+--------+------------------------+--------------------+
|      1 | electronic             | no image           |
|      2 | cosmetic               | Cosmetic jpg image |
|      3 | hardware               | no image           |
|      4 | Fashion                | no image           |
|      5 | Toys                   | no image           |
|      6 | Clothings              | no image           |
|      7 | Beauty & Personal Care | no image           |
+--------+------------------------+--------------------+


mysql> describe users;
+---------------+--------------+------+-----+-------------------+-----------------------------------------------+
| Field         | Type         | Null | Key | Default           | Extra                                         |
+---------------+--------------+------+-----+-------------------+-----------------------------------------------+
| id            | int(11)      | NO   | PRI | NULL              | auto_increment                                |
| login_name    | varchar(255) | NO   |     | NULL              |                                               |
| email         | varchar(255) | NO   |     | NULL              |                                               |
| password      | varchar(255) | NO   |     | NULL              |                                               |
| com_code      | varchar(255) | NO   |     | NULL              |                                               |
| status        | varchar(20)  | YES  |     | INACTIVE          |                                               |
| forgot        | varchar(20)  | YES  |     | NULL              |                                               |
| logintype     | varchar(20)  | NO   |     | email             |                                               |
| creation_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| modified_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |
+---------------+--------------+------+-----+-------------------+-----------------------------------------------+


INSERT INTO users (login_name,email,password, com_code, status ,forgot, logintype)
VALUES('JohnDoe','johndoe@gmail.com','password$.','Nothing','active','password$.','mobile') ;


mysql> select * from users;
+----+-------------+-----------------------+------------+---------------+-------
-+------------+-----------+---------------------+---------------------+
| id | login_name  | email                 | password   | com_code      | status
 | forgot     | logintype | creation_date       | modified_date       |
+----+-------------+-----------------------+------------+---------------+-------
-+------------+-----------+---------------------+---------------------+
|  1 | JohnDoe     | johndoe@gmail.com     | password$. | Nothing2      | active
 | password$. | mobile    | 2019-04-21 15:10:53 | 2019-04-21 15:49:24 |
|  2 | JaneDoe     | janedoe@gmail.com     | password$. | NothingJane   | active
 | password$. | mobile    | 2019-04-21 15:50:53 | 2019-04-21 15:50:53 |
|  3 | NancyPelocy | nancypelocy@gmail.com | password$. | NothingPelocy | active
 | password$. | mobile    | 2019-04-21 15:52:44 | 2019-04-21 15:52:44 |
+----+-------------+-----------------------+------------+---------------+-------
-+------------+-----------+---------------------+---------------------+
3 rows in set (0.01 sec)

select

INSERT INTO users_profile (`user_id` , `first_name`,`last_name`,`gender`  )
VALUES(1, 'John','Doe', 'M') ;

INSERT INTO users_profile (`user_id` , `first_name`,`last_name`,`gender`  )
VALUES(2, 'Jane','Doe', 'F') ;

INSERT INTO users_profile (`user_id` , `first_name`,`last_name`,`gender`  )
VALUES(3, 'Nancy','Pelocy', 'F') ;

INSERT INTO users_profile (`user_id` , `first_name`,`last_name`,`gender`  )
VALUES(1, 'Babak','Obama', 'M') ;

 SELECT * FROM users u LEFT JOIN users_profile p ON u.id=p.user_id;
 

倚天屠龙记


mysql> show character set ;
+----------+---------------------------------+---------------------+--------+
| Charset  | Description                     | Default collation   | Maxlen |
+----------+---------------------------------+---------------------+--------+
| armscii8 | ARMSCII-8 Armenian              | armscii8_general_ci |      1 |
| ascii    | US ASCII                        | ascii_general_ci    |      1 |
| big5     | Big5 Traditional Chinese        | big5_chinese_ci     |      2 |
| binary   | Binary pseudo charset           | binary              |      1 |
| cp1250   | Windows Central European        | cp1250_general_ci   |      1 |
| cp1251   | Windows Cyrillic                | cp1251_general_ci   |      1 |
| cp1256   | Windows Arabic                  | cp1256_general_ci   |      1 |
| cp1257   | Windows Baltic                  | cp1257_general_ci   |      1 |
| cp850    | DOS West European               | cp850_general_ci    |      1 |
| cp852    | DOS Central European            | cp852_general_ci    |      1 |
| cp866    | DOS Russian                     | cp866_general_ci    |      1 |
| cp932    | SJIS for Windows Japanese       | cp932_japanese_ci   |      2 |
| dec8     | DEC West European               | dec8_swedish_ci     |      1 |
| eucjpms  | UJIS for Windows Japanese       | eucjpms_japanese_ci |      3 |
| euckr    | EUC-KR Korean                   | euckr_korean_ci     |      2 |
| gb18030  | China National Standard GB18030 | gb18030_chinese_ci  |      4 |
| gb2312   | GB2312 Simplified Chinese       | gb2312_chinese_ci   |      2 |
| gbk      | GBK Simplified Chinese          | gbk_chinese_ci      |      2 |
| geostd8  | GEOSTD8 Georgian                | geostd8_general_ci  |      1 |
| greek    | ISO 8859-7 Greek                | greek_general_ci    |      1 |
| hebrew   | ISO 8859-8 Hebrew               | hebrew_general_ci   |      1 |
| hp8      | HP West European                | hp8_english_ci      |      1 |
| keybcs2  | DOS Kamenicky Czech-Slovak      | keybcs2_general_ci  |      1 |
| koi8r    | KOI8-R Relcom Russian           | koi8r_general_ci    |      1 |
| koi8u    | KOI8-U Ukrainian                | koi8u_general_ci    |      1 |
| latin1   | cp1252 West European            | latin1_swedish_ci   |      1 |
| latin2   | ISO 8859-2 Central European     | latin2_general_ci   |      1 |
| latin5   | ISO 8859-9 Turkish              | latin5_turkish_ci   |      1 |
| latin7   | ISO 8859-13 Baltic              | latin7_general_ci   |      1 |
| macce    | Mac Central European            | macce_general_ci    |      1 |
| macroman | Mac West European               | macroman_general_ci |      1 |
| sjis     | Shift-JIS Japanese              | sjis_japanese_ci    |      2 |
| swe7     | 7bit Swedish                    | swe7_swedish_ci     |      1 |
| tis620   | TIS620 Thai                     | tis620_thai_ci      |      1 |
| ucs2     | UCS-2 Unicode                   | ucs2_general_ci     |      2 |
| ujis     | EUC-JP Japanese                 | ujis_japanese_ci    |      3 |
| utf16    | UTF-16 Unicode                  | utf16_general_ci    |      4 |
| utf16le  | UTF-16LE Unicode                | utf16le_general_ci  |      4 |
| utf32    | UTF-32 Unicode                  | utf32_general_ci    |      4 |
| utf8     | UTF-8 Unicode                   | utf8_general_ci     |      3 |
| utf8mb4  | UTF-8 Unicode                   | utf8mb4_0900_ai_ci  |      4 |
+----------+---------------------------------+---------------------+--------+



INSERT INTO users_wallets ( `user_id`,`status`, )
VALUES(1, 'Babak','Obama', 'M') ;
P1ngfff


=== May 16,2019 =====
==== Test =======

CREATE TABLE IF NOT EXISTS `a2_relationship` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `cusip` varchar(255) NOT NULL,
  
  `driver_cusip` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('037833100','037833100') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('17275R102','17275R102') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('38259P508','38259P508') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('594918104','594918104') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('68389X105','68389X105') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('00752H102 ','00752H102') ;

INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('00211Y100','037833100') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('00762W107','17275R102') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('011659109','38259P508') ;


INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('02079K107','594918104') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('931142103','68389X105') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('83114AB03','00752H102') ;
INSERT INTO a2_relationship ( `cusip`,`driver_cusip` )
VALUES('411CDA103','037833100') ;

==== Result are empty ====
SELECT *  FROM a2_relationship WHERE cusip IN ('037833100','17275R102','38259P508' )
AND cusip in (SELECT cusip FROM a2_relationship WHERE cusip = driver_cusip 
AND cusip NOT IN ( select driver_cusip from a2_relationship where  cusip != driver_cusip ) ) ;

=== resuls are ====
+----+------------+--------------+
| id | cusip      | driver_cusip |
+----+------------+--------------+
|  4 | 594918104  | 594918104    |
|  5 | 68389X105  | 68389X105    |
|  6 | 00752H102  | 00752H102    |
+----+------------+--------------+
SELECT *  FROM a2_relationship WHERE cusip IN ('594918104','68389X105','00752H102' )
AND cusip in (SELECT cusip FROM a2_relationship WHERE cusip = driver_cusip 
AND cusip NOT IN ( select driver_cusip from a2_relationship where  cusip != driver_cusip ) ) ;


=== resuls are 
+------------+
| cusip      |
+------------+
| 594918104  |
| 68389X105  |
| 00752H102  |
+------------+

SELECT cusip FROM a2_relationship WHERE cusip = driver_cusip 
AND cusip NOT IN ( select driver_cusip from a2_relationship where  cusip != driver_cusip ) ;




