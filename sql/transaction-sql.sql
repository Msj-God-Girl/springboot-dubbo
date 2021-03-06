CREATE TABLE `TCC_TRANSACTION_TEST_A` (
  `TRANSACTION_ID` INT(11) NOT NULL AUTO_INCREMENT,
  `DOMAIN` VARCHAR(100) DEFAULT NULL,
  `GLOBAL_TX_ID` VARBINARY(32) NOT NULL,
  `BRANCH_QUALIFIER` VARBINARY(32) NOT NULL,
  `CONTENT` VARBINARY(8000) DEFAULT NULL,
  `STATUS` INT(11) DEFAULT NULL,
  `TRANSACTION_TYPE` INT(11) DEFAULT NULL,
  `RETRIED_COUNT` INT(11) DEFAULT NULL,
  `CREATE_TIME` DATETIME DEFAULT NULL,
  `LAST_UPDATE_TIME` DATETIME DEFAULT NULL,
  `VERSION` INT(11) DEFAULT NULL,
  IS_DELETE TINYINT(1) DEFAULT 0 NOT NULL,
  PRIMARY KEY (`TRANSACTION_ID`),
  UNIQUE KEY `UX_TX_BQ` (`GLOBAL_TX_ID`,`BRANCH_QUALIFIER`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;