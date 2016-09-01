-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 01, 2016 at 05:52 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `registration_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_userinfo`
--

CREATE TABLE `tbl_userinfo` (
  `user_id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(250) NOT NULL,
  `confirm_password` varchar(250) NOT NULL,
  `haskey` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_userinfo`
--

INSERT INTO `tbl_userinfo` (`user_id`, `username`, `email`, `password`, `confirm_password`, `haskey`) VALUES
(1, 'mohitpaudel', 'mohit.paudel1996@outlook.com', '19b3446c81f9ed72bb1ea8469fc1861c', '19b3446c81f9ed72bb1ea8469fc1861c', 'mohitpaudel1065'),
(3, 'mohitlal', 'mohit.paudel1996@gmail.com', '19b3446c81f9ed72bb1ea8469fc1861c', '19b3446c81f9ed72bb1ea8469fc1861c', 'mohitlal2314'),
(5, 'mohitpa', 'mohit.paudel1996@yahoo.com', 'b5c0b187fe309af0f4d35982fd961d7e', 'b5c0b187fe309af0f4d35982fd961d7e', 'mohitpa718'),
(7, 'h', 'a@b.com', '88698b6a4506539f5c5588da47a10171', '88698b6a4506539f5c5588da47a10171', 'h222'),
(9, 'mohitpaudel09', 'kusunti@gmail.com', '19e2adc1d3d62258a2e756cc95311b79', '19e2adc1d3d62258a2e756cc95311b79', 'mohitpaudel091730'),
(10, 'mohit', 'mohit@gmail.co', '19e2adc1d3d62258a2e756cc95311b79', '19e2adc1d3d62258a2e756cc95311b79', 'mohit2170'),
(12, 'mohitpaudel1121', 'mohit.paudel199612@gmail.com', '19e2adc1d3d62258a2e756cc95311b79', '19e2adc1d3d62258a2e756cc95311b79', 'mohitpaudel1121615'),
(13, 'mo', 'm@gmail.co', '27c9d5187cd283f8d160ec1ed2b5ac89', '27c9d5187cd283f8d160ec1ed2b5ac89', 'mo115'),
(14, 'new', 'registry@ss.com', '19e2adc1d3d62258a2e756cc95311b79', '19e2adc1d3d62258a2e756cc95311b79', 'new2312');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_userinfo`
--
ALTER TABLE `tbl_userinfo`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `hashkey` (`haskey`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_userinfo`
--
ALTER TABLE `tbl_userinfo`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
