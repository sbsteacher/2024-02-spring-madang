

-- madang_spring 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `madang_spring` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `madang_spring`;

-- 테이블 madang_spring.book 구조 내보내기
CREATE TABLE IF NOT EXISTS `book` (
    `bookid` int(11) NOT NULL AUTO_INCREMENT,
    `bookname` varchar(40) NOT NULL,
    `publisher` varchar(40) NOT NULL,
    `price` int(11) NOT NULL,
    PRIMARY KEY (`bookid`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 내보낼 데이터가 선택되어 있지 않습니다.

-- 테이블 madang_spring.customer 구조 내보내기
CREATE TABLE IF NOT EXISTS `customer` (
    `custid` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(40) NOT NULL,
    `address` varchar(50) NOT NULL,
    `phone` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`custid`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 내보낼 데이터가 선택되어 있지 않습니다.

-- 테이블 madang_spring.orders 구조 내보내기
CREATE TABLE IF NOT EXISTS `orders` (
    `orderid` int(11) NOT NULL AUTO_INCREMENT,
    `custid` int(11) NOT NULL,
    `bookid` int(11) NOT NULL,
    `saleprice` int(11) NOT NULL,
    `orderdate` date NOT NULL,
    PRIMARY KEY (`orderid`),
    KEY `custid` (`custid`),
    KEY `bookid` (`bookid`),
    CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`custid`) REFERENCES `customer` (`custid`),
    CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`bookid`) REFERENCES `book` (`bookid`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
