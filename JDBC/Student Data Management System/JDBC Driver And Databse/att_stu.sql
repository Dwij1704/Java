-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 06, 2022 at 08:47 AM
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
-- Database: `att_stu`
--

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
CREATE TABLE IF NOT EXISTS `faculty` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`id`, `username`, `password`) VALUES
(1, 'Diya', 'jodd1234');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `roll` varchar(50) NOT NULL,
  `Student` varchar(100) NOT NULL,
  `Standard` varchar(50) NOT NULL,
  `Division` varchar(50) NOT NULL,
  `City` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `DOB` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `roll`, `Student`, `Standard`, `Division`, `City`, `Phone`, `DOB`) VALUES
(1, '1', 'Dwij Patel', '5th', 'A1', 'Ahemdabad', '8849259341', '17/04/2004'),
(2, '2', 'Diya Jadia', '5th', 'A1', 'Nadiad', '9601098063', 'N/A'),
(3, '3', 'Vraj Shah', '5th', 'A1', 'Nadiad', '8738290056', '2/11/2004'),
(4, '4', 'Vasu Bhorania', '5th', 'A1', 'Karachi', '9238401889', '03/12/2004'),
(5, '5', 'Vasundhara Rana', '5th', 'A1', 'Vapi', '9823764598', '29/08/2003'),
(6, '6', 'Het Khatsuria', '5th', 'A1', 'Surendranagar', '9834765098', '31/12/2002'),
(7, '7', 'Anjali Shah', '5th', 'A1', 'Ahmedabad ', '8947297549', '11/06/2004'),
(8, '8', 'Parth Lathiya', '5th', 'A1', 'Bhavnagar', '8160330433', '06/12/2004'),
(9, '9', 'Sakshi Patel', '5th', 'A1', 'Anand', '9834765092', '02/02/2003'),
(10, '10', 'Khushi Patel', '5th', 'A1', 'Baroda', '7823654923', '03/12/2004'),
(11, '1', 'Ramesh Shah', '5th', 'A2', 'Nadiad', '8738290056', '2/11/2004'),
(12, '2', 'Suresh Bhorania', '5th', 'A2', 'Karachi', '9238401889', '03/12/2004'),
(13, '3', 'Kamlesh Rana', '5th', 'A2', 'Vapi', '9823764598', '29/08/2003'),
(14, '4', 'Furesh Khatsuria', '5th', 'A2', 'Surendranagar', '9834765098', '31/12/2002'),
(15, '5', 'Himesh Shah', '5th', 'A2', 'Ahmedabad ', '8947297549', '11/06/2004'),
(16, '6', 'Khatshesh Lathiya', '5th', 'A2', 'Bhavnagar', '8160330433', '06/12/2004'),
(17, '7', 'Rakshesh Patel', '5th', 'A2', 'Anand', '9834765092', '02/02/2003'),
(18, '8', 'Hiresh Patel', '5th', 'A2', 'Baroda', '7823654923', '03/12/2004'),
(19, '1', 'KInjal Shah', '6th', 'A2', 'Nadiad', '8738290056', '2/11/2004'),
(20, '2', 'Mujal Bhorania', '6th', 'A2', 'Karachi', '9238401889', '03/12/2004'),
(21, '3', 'Karan Rana', '6th', 'A2', 'Vapi', '9823764598', '29/08/2003'),
(22, '4', 'Hitesh Khatsuria', '6th', 'A2', 'Surendranagar', '9834765098', '31/12/2002'),
(23, '5', 'Amit Shah', '6th', 'A2', 'Ahmedabad ', '8947297549', '11/06/2004'),
(24, '6', 'Ashit Lathiya', '6th', 'A2', 'Bhavnagar', '8160330433', '06/12/2004'),
(25, '7', 'Rami Patel', '6th', 'A2', 'Anand', '9834765092', '02/02/2003'),
(26, '8', 'Nimesh Patel', '6th', 'A2', 'Baroda', '7823654923', '03/12/2004'),
(27, '1', 'Carol Shah', '6th', 'A1', 'Nadiad', '8738290056', '2/11/2004'),
(28, '2', 'Candice Bhorania', '6th', 'A1', 'Karachi', '9238401889', '03/12/2004'),
(29, '3', 'Stacy Rana', '6th', 'A1', 'Vapi', '9823764598', '29/08/2003'),
(30, '4', 'Dom Khatsuria', '6th', 'A1', 'Surendranagar', '9834765098', '31/12/2002'),
(31, '5', 'Jon Shah', '6th', 'A1', 'Ahmedabad ', '8947297549', '11/06/2004'),
(32, '6', 'Michael Lathiya', '6th', 'A1', 'Bhavnagar', '8160330433', '06/12/2004'),
(33, '7', 'Thomas Patel', '6th', 'A1', 'Anand', '9834765092', '02/02/2003'),
(34, '8', 'Auther Patel', '6th', 'A1', 'Baroda', '7823654923', '03/12/2004'),
(35, '9', 'Dwij Patel', '6th', 'A1', 'Nadiad', '8738290056', '2/11/2004'),
(36, '11', 'Maitree Patel', '5th', 'A1', 'Welling', '7477797819', '12/01/2004'),
(37, '12', 'Aska Patel', '5th', 'A1', 'Nadiad', '7923764982', '03/02/2003'),
(39, '9', 'Gaurav Patel', '6th', 'A2', 'Nadiad', '8749035861', '03/09/2002'),
(40, '10', 'Dom Torreto', '6th', 'A1', 'Nadiad', '3458734567', '05/04/1002');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
