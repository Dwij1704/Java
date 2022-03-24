-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 24, 2022 at 05:23 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `to_do`
--

-- --------------------------------------------------------

--
-- Table structure for table `l2`
--

DROP TABLE IF EXISTS `l2`;
CREATE TABLE IF NOT EXISTS `l2` (
  `sr_no` int(11) NOT NULL AUTO_INCREMENT,
  `done` varchar(100) NOT NULL,
  `id` int(50) NOT NULL,
  PRIMARY KEY (`sr_no`),
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=56 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `l2`
--

INSERT INTO `l2` (`sr_no`, `done`, `id`) VALUES
(55, 'ok  22:44:54  24/03/2022 ', 1);

-- --------------------------------------------------------

--
-- Table structure for table `list`
--

DROP TABLE IF EXISTS `list`;
CREATE TABLE IF NOT EXISTS `list` (
  `sr_no` int(11) NOT NULL AUTO_INCREMENT,
  `task` varchar(50) DEFAULT NULL,
  `id` int(50) NOT NULL,
  PRIMARY KEY (`sr_no`),
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=82 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `list`
--

INSERT INTO `list` (`sr_no`, `task`, `id`) VALUES
(78, 'Wake Up', 1),
(79, 'Dont Wake Up', 2),
(80, 'Unghva jaaa', 13);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'Dwij1704', 'jodd1234'),
(2, 'Vraj', 'jodd1234'),
(3, 'Vasu', 'jodd1234'),
(4, 'Shivraj', 'jodd1234'),
(5, 'Jenish', 'jodd1234'),
(6, 'Preet', 'jodd1234'),
(7, 'Raj', 'jodd1234'),
(8, 'Priyanshu', 'noob1234'),
(10, 'Gitanjali', 'noob1234'),
(11, 'Hardik', 'jodd1234'),
(12, 'Hardik2', 'jodd1234'),
(13, 'Jay', 'jodd1234');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
