-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 28 déc. 2021 à 14:36
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `hospitaldb`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin_info`
--

CREATE TABLE `admin_info` (
  `username` varchar(15) CHARACTER SET latin1 NOT NULL,
  `password` varchar(15) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `admin_info`
--

INSERT INTO `admin_info` (`username`, `password`) VALUES
('Sajeeb', 'Sajeeb'),
('admin', 'admin'),
('Shafayat', 'Shafayat'),
('Mansur', 'Mansur');

-- --------------------------------------------------------

--
-- Structure de la table `appointment_info`
--

CREATE TABLE `appointment_info` (
  `dName` varchar(20) CHARACTER SET latin1 NOT NULL,
  `pName` varchar(15) CHARACTER SET latin1 NOT NULL,
  `room` int(11) NOT NULL,
  `a_date` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `appointment_info`
--

INSERT INTO `appointment_info` (`dName`, `pName`, `room`, `a_date`) VALUES
('Sajeeb', 'Shafayat Jamil', 987, ''),
('Sifat', 'Sajeeb Shahriar', 806, '');

-- --------------------------------------------------------

--
-- Structure de la table `doctor_info`
--

CREATE TABLE `doctor_info` (
  `id` varchar(10) CHARACTER SET latin1 NOT NULL,
  `name` varchar(30) CHARACTER SET latin1 NOT NULL,
  `gender` varchar(8) CHARACTER SET latin1 NOT NULL,
  `address` varchar(20) CHARACTER SET latin1 NOT NULL,
  `dept` varchar(20) CHARACTER SET latin1 NOT NULL,
  `phone` varchar(15) CHARACTER SET latin1 NOT NULL,
  `username` varchar(20) CHARACTER SET latin1 NOT NULL,
  `password` varchar(30) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `doctor_info`
--

INSERT INTO `doctor_info` (`id`, `name`, `gender`, `address`, `dept`, `phone`, `username`, `password`) VALUES
('sjb0HMSd1', 'Sifat Islam', 'Male', 'Faridpur', 'Medecine', '+8801757009622', 'Sifat', 'Sifat'),
('sjb0HMSd2', 'Mansorol Islam', 'Male', 'Gazipur', 'Dental', '+8801665546776', 'Mansu', 'Mansu'),
('sjb0HMSd3', 'Nafees Khan', 'Male', 'Patuakhali', 'Neurology', '+8801734253425', 'Nafees', 'Nafees'),
('sjb0HMSd4', 'Shafayat Jamil', 'Male', 'Bogra', 'Nutrition', '+8801754323454', 'Shafayat', 'Shafayat'),
('sjb0HMSd4', 'Nusrat Jaman', 'Female', 'Rajshahi', 'Gynaecology', '+8801765432187', 'Nusrat', 'Nusrat'),
('sjb0HMSd6', 'Fahad Ali', 'Male', 'Kustia', 'Cardiology', '+8801754321678', 'Fahad', 'Fahad'),
('sjb0HMSd7', 'Sanjida Sultana', 'Female', 'Natore', 'Haematology', '+8801765432134', 'Sanjida', 'Sanjida'),
('sjb0HMSd8', 'Fazle Rabby', 'Male', 'Brahmanbaria', 'Microbiology', '+8801745321376', 'Rabby', 'Rabby'),
('sjb0HMSd9', 'Marina Naznin', 'Female', 'Tangail', 'Gynaecology', '+8801756789006', 'Marina', 'Marina'),
('sjb0HMSd9', 'Sajeeb Shahriar', 'Male', 'Rajshahi', 'Microbiology', '+8801756432156', 'Sajeeb', 'Sajeeb');

-- --------------------------------------------------------

--
-- Structure de la table `patient_info`
--

CREATE TABLE `patient_info` (
  `date` varchar(10) CHARACTER SET latin1 NOT NULL,
  `id` varchar(20) CHARACTER SET latin1 NOT NULL,
  `name` varchar(20) CHARACTER SET latin1 NOT NULL,
  `age` int(5) NOT NULL,
  `gender` varchar(10) CHARACTER SET latin1 NOT NULL,
  `address` varchar(20) CHARACTER SET latin1 NOT NULL,
  `phone` varchar(20) CHARACTER SET latin1 NOT NULL,
  `disease` varchar(20) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `patient_info`
--

INSERT INTO `patient_info` (`date`, `id`, `name`, `age`, `gender`, `address`, `phone`, `disease`) VALUES
('08-03-2018', 'sjb0HMS2', 'Sajeeb Shahriar', 20, 'Male', 'Naldanga, Natore', '+8801757009622', 'Feaver'),
('09-06-2018', 'sjb0HMS3', 'Joy Bhowmik', 21, 'Male', 'Vola', '+8801876543237', 'Dengue'),
('03-05-2017', 'sjb0HMS4', 'Fahad Mondol', 78, 'Male', 'Kustia', '+8801889765426', 'Jondish'),
('09-03-2016', 'sjb0HMS5', 'Fazle Rabby', 24, 'Male', 'Brahmanbariya', '+8801765432124', 'Malaria'),
('22-12-2017', 'sjb0HMS6', 'Shafayat Jamil', 27, 'Male', 'Bogra', '+8801722456657', 'Tyfoyed'),
('22-12-2017', 'sjb0HMS7', 'Nazmus Sakib', 22, 'Male', 'Chadpur', '+8801754678907', 'Feaver');

-- --------------------------------------------------------

--
-- Structure de la table `receptionist_info`
--

CREATE TABLE `receptionist_info` (
  `id` varchar(15) CHARACTER SET latin1 NOT NULL,
  `name` varchar(30) CHARACTER SET latin1 NOT NULL,
  `email` varchar(40) CHARACTER SET latin1 NOT NULL,
  `username` varchar(20) CHARACTER SET latin1 NOT NULL,
  `password` varchar(30) CHARACTER SET latin1 NOT NULL,
  `age` int(5) NOT NULL,
  `gender` varchar(10) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `receptionist_info`
--

INSERT INTO `receptionist_info` (`id`, `name`, `email`, `username`, `password`, `age`, `gender`) VALUES
('sjb0HMSd3', 'Sajeeb Shahriar', 'sajeeb3g@gmail.com', 'Sajeeb', 'Sajeeb', 21, 'Male'),
('sjb0HMSr3', 'Mansorol Islam', 'mansu@gmail.com', 'Mansu', 'Mansu', 24, 'Male'),
('sjb0HMSr4', 'Nafees Khan', 'nafees@gmail.com', 'Nafees', 'Nafees', 24, 'Male'),
('sjb0HMSr7', 'Sifat Khan', 'sifat@gmail.com', 'Sifat', 'Sifat', 34, 'Male'),
('sjb0HMSr9', 'Shafayat Jamil', 'shafayat@gmail.com', 'Shafayat', 'Shafayat', 44, 'Male');

-- --------------------------------------------------------

--
-- Structure de la table `test`
--

CREATE TABLE `test` (
  `a` varchar(11) NOT NULL,
  `b` varchar(11) NOT NULL,
  `c` varchar(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `test`
--

INSERT INTO `test` (`a`, `b`, `c`) VALUES
('5', '6', '6'),
('1', '2', '4'),
('gfhf', 'fv', 'hf');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
