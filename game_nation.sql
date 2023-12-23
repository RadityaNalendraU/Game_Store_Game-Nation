-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2023 at 01:53 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `game_nation`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_data`
--

CREATE TABLE `admin_data` (
  `username` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_data`
--

INSERT INTO `admin_data` (`username`, `email`, `password`) VALUES
('gabriel', 'gabu@admin.com', 'gbu1234'),
('naqib', 'naqib@admin.com', 'nqb1234'),
('slmn', 'slmn@admin.com', 'slmn1234');

-- --------------------------------------------------------

--
-- Table structure for table `gabriel1@usermail.com`
--

CREATE TABLE `gabriel1@usermail.com` (
  `ID` varchar(10) NOT NULL,
  `NamaGame` varchar(50) NOT NULL,
  `Developer` varchar(50) NOT NULL,
  `Genre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `gabriel1@usermail.com`
--

INSERT INTO `gabriel1@usermail.com` (`ID`, `NamaGame`, `Developer`, `Genre`) VALUES
('001', 'Code Vein', 'Bandai Namco', 'RPG');

-- --------------------------------------------------------

--
-- Table structure for table `game`
--

CREATE TABLE `game` (
  `ID` varchar(10) NOT NULL,
  `Nama` varchar(50) DEFAULT NULL,
  `Developer` varchar(50) DEFAULT NULL,
  `Genre` varchar(30) DEFAULT NULL,
  `Harga` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `game`
--

INSERT INTO `game` (`ID`, `Nama`, `Developer`, `Genre`, `Harga`) VALUES
('001', 'Code Vein', 'Bandai Namco', 'RPG', 499000),
('002', 'Brawlhalla', 'Ubisoft', 'Fighting', 40000),
('003', 'Mortal Combat X', 'Warner Bros', 'Fighting', 136000),
('004', 'NieR:Automata', 'Square Enix', 'RPG', 579000),
('005', 'Elden Ring', 'Bandai Namco', 'RPG', 599000),
('006', 'For Honor', 'Ubisoft', 'Fighting', 150000),
('007', 'Devil May Cry 5', 'CAPCOM', 'RPG', 424000),
('008', 'Final Fantasy XV', 'Square Enix', 'RPG', 695000),
('009', 'The King of Fighters XIV', 'SNK Corporation', 'Fighting', 380000),
('010', 'Tekken 7', 'Bandai Namco', 'Fighting', 400000),
('011', 'Fortnite ', 'Epic Game ', 'Battle Royale ', 0);

-- --------------------------------------------------------

--
-- Table structure for table `rnu@usermail.com`
--

CREATE TABLE `rnu@usermail.com` (
  `ID` varchar(10) NOT NULL,
  `NamaGame` varchar(50) NOT NULL,
  `Developer` varchar(50) NOT NULL,
  `Genre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rnu@usermail.com`
--

INSERT INTO `rnu@usermail.com` (`ID`, `NamaGame`, `Developer`, `Genre`) VALUES
('001', 'Code Vein', 'Bandai Namco', 'RPG'),
('004', 'NieR:Automata', 'Square Enix', 'RPG'),
('005', 'Elden Ring', 'Bandai Namco', 'RPG'),
('008', 'Final Fantasy XV', 'Square Enix', 'RPG');

-- --------------------------------------------------------

--
-- Table structure for table `salman1@usermail.com`
--

CREATE TABLE `salman1@usermail.com` (
  `ID` varchar(10) NOT NULL,
  `NamaGame` varchar(50) NOT NULL,
  `Developer` varchar(50) NOT NULL,
  `Genre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `ID` varchar(10) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Genre` varchar(30) NOT NULL,
  `Harga` int(20) NOT NULL,
  `Waktu` datetime NOT NULL,
  `Developer` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`ID`, `Nama`, `Genre`, `Harga`, `Waktu`, `Developer`) VALUES
('001', ' Code Vein ', ' RPG ', 499000, '2023-07-22 22:30:32', ' Bandai Namco '),
('002', ' Brawlhalla ', ' Fighting ', 40000, '2023-07-22 22:30:36', ' Ubisoft '),
('003', ' Mortal Combat X ', ' Fighting ', 136000, '2023-07-22 22:30:40', ' Warner Bros '),
('004', ' NieR:Automata ', ' RPG ', 579000, '2023-07-22 22:30:43', ' Square Enix '),
('011', ' Fortnite  ', ' Battle Royale  ', 0, '2023-07-22 22:53:34', ' Epic Game  '),
('005', ' Elden Ring ', ' RPG ', 599000, '2023-07-23 20:21:32', ' Bandai Namco '),
('011', ' Fortnite  ', ' Battle Royale  ', 0, '2023-07-23 20:26:18', ' Epic Game  '),
('009', ' The King of Fighters XIV ', ' Fighting ', 380000, '2023-07-23 20:26:54', ' SNK Corporation '),
('011', ' Fortnite  ', ' Battle Royale  ', 0, '2023-07-23 21:19:22', ' Epic Game  '),
('011', ' Fortnite  ', ' Battle Royale  ', 0, '2023-07-23 21:20:45', ' Epic Game  '),
('011', ' Fortnite  ', ' Battle Royale  ', 0, '2023-07-23 21:21:43', ' Epic Game  '),
('011', ' Fortnite  ', ' Battle Royale  ', 0, '2023-07-23 21:22:37', ' Epic Game  '),
('005', ' Elden Ring ', ' RPG ', 599000, '2023-07-23 23:17:20', ' Bandai Namco '),
('008', ' Final Fantasy XV ', ' RPG ', 695000, '2023-07-24 16:50:38', ' Square Enix '),
('010', ' Tekken 7 ', ' Fighting ', 400000, '2023-07-25 13:24:59', ' Bandai Namco '),
('007', ' Devil May Cry 5 ', ' RPG ', 424000, '2023-07-25 13:33:46', ' CAPCOM '),
('006', ' For Honor ', ' Fighting ', 150000, '2023-07-25 13:33:54', ' Ubisoft '),
('004', ' NieR:Automata ', ' RPG ', 579000, '2023-07-27 18:31:43', ' Square Enix ');

-- --------------------------------------------------------

--
-- Table structure for table `user_data`
--

CREATE TABLE `user_data` (
  `username` varchar(20) NOT NULL,
  `email` varchar(22) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_data`
--

INSERT INTO `user_data` (`username`, `email`, `password`) VALUES
('gabriel', 'gabriel1@usermail.com', 'gbrl1234'),
('rnu', 'rnu@usermail.com', 'rnu12345'),
('salman', 'salman1@usermail.com', 'slmn1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_data`
--
ALTER TABLE `admin_data`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `gabriel1@usermail.com`
--
ALTER TABLE `gabriel1@usermail.com`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `rnu@usermail.com`
--
ALTER TABLE `rnu@usermail.com`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `salman1@usermail.com`
--
ALTER TABLE `salman1@usermail.com`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `user_data`
--
ALTER TABLE `user_data`
  ADD PRIMARY KEY (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
