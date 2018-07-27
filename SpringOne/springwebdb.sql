-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 27, 2018 at 09:45 AM
-- Server version: 5.7.22-0ubuntu18.04.1
-- PHP Version: 7.2.5-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springwebdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(10) UNSIGNED NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `email` varchar(255) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `last_login_date` datetime DEFAULT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1',
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_name`, `email`, `first_name`, `last_name`, `image_url`, `image_path`, `last_login_date`, `status`, `create_date`, `update_date`) VALUES
(3, 'test', 'test@test.com', 'Test', 'User', NULL, NULL, NULL, 1, '2013-06-03 20:22:29', '2013-06-03 20:22:29'),
(4, 'user1', 'user1@test.com', 'User', 'One', NULL, NULL, NULL, 1, '2013-08-08 11:07:14', '2013-08-08 11:07:14'),
(5, 'user2', 'user2@test.com', 'User', 'Two', NULL, NULL, NULL, 1, '2013-08-08 11:07:39', '2013-08-08 11:07:39'),
(6, 'user3', 'user3@test.com', 'User', 'Three', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(7, 'user4', 'user4@test.com', 'User', 'Four', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(8, 'user5', 'user5@test.com', 'User', 'Five', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(9, 'user6', 'user6@test.com', 'User', 'Six', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(10, 'user7', 'user7@test.com', 'User', 'Seven', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(11, 'user8', 'user8@test.com', 'User', 'Eight', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(12, 'user9', 'user9@test.com', 'User', 'Nine', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(13, 'user10', 'user10@test.com', 'User', 'Ten', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(14, 'user11', 'user11@test.com', 'User', 'Eleven', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(15, 'user12', 'user12@test.com', 'User', 'Twelve', NULL, NULL, NULL, 1, '2013-08-08 13:35:39', '2013-08-08 13:35:39'),
(16, 'user13', 'user13@test.com', 'User', 'Thirteen', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(17, 'user14', 'user14@test.com', 'User', 'Fourteen', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(18, 'user15', 'user15@test.com', 'User', 'Fifteen', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(19, 'user16', 'user16@test.com', 'User', 'Sixteen', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(20, 'user17', 'user17@test.com', 'User', 'Seventeen', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(21, 'user18', 'user18@test.com', 'User', 'Eighteen', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(22, 'user19', 'user19@test.com', 'User', 'Nineteen', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(23, 'user20', 'user20@test.com', 'User', 'Twenty', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(24, 'user21', 'user21@test.com', 'User', 'Twenty-One', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(25, 'user22', 'user22@test.com', 'User', 'Twenty-Two', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(26, 'user23', 'user23@test.com', 'User', 'Twenty-Three', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(27, 'user24', 'user24@test.com', 'User', 'Twenty-Four', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(28, 'user25', 'user25@test.com', 'User', 'Twenty-Five', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(29, 'user26', 'user26@test.com', 'User', 'Twenty-Six', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(30, 'user27', 'user27@test.com', 'User', 'Twenty-Seven', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(31, 'user28', 'user28@test.com', 'User', 'Twenty-Eight', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(32, 'user29', 'user29@test.com', 'User', 'Twenty-Nine', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(33, 'user30', 'user30@test.com', 'User', 'Thirty', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(34, 'user31', 'user31@test.com', 'User', 'Thirty-One', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(35, 'user32', 'user32@test.com', 'User', 'Thirty-Two', NULL, NULL, NULL, 1, '2013-08-08 13:35:40', '2013-08-08 13:35:40'),
(36, 'user33', 'user33@test.com', 'User', 'Thirty-Three', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(37, 'user34', 'user34@test.com', 'User', 'Thirty-Four', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(38, 'user35', 'user35@test.com', 'User', 'Thirty-Five', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(39, 'user36', 'user36@test.com', 'User', 'Thirty-Six', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(40, 'user37', 'user37@test.com', 'User', 'Thirty-Seven', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(41, 'user38', 'user38@test.com', 'User', 'Thirty-Eight', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(42, 'user39', 'user39@test.com', 'User', 'Thirty-Nine', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(43, 'user40', 'user40@test.com', 'User', 'Forty', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(44, 'user41', 'user41@test.com', 'User', 'Forty-One', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(45, 'user42', 'user42@test.com', 'User', 'Forty-Two', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(46, 'user43', 'user43@test.com', 'User', 'Forty-Three', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(47, 'user44', 'user44@test.com', 'User', 'Forty-Four', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(48, 'user45', 'user45@test.com', 'User', 'Forty-Five', NULL, NULL, NULL, 1, '2013-08-08 13:35:41', '2013-08-08 13:35:41'),
(50, 'test2', 'test2@test.com', 'Test', 'Two', NULL, NULL, NULL, 1, '2013-08-08 17:52:40', '2013-08-08 17:52:40'),
(51, 'josephjohn', 'tojosephjohn@yahoo.com', 'Joseph', 'John', NULL, NULL, NULL, 1, '2018-07-26 18:45:53', '2018-07-26 18:45:53');

-- --------------------------------------------------------

--
-- Table structure for table `user_role`
--

CREATE TABLE `user_role` (
  `user_id` int(10) UNSIGNED NOT NULL,
  `role` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user_sns`
--

CREATE TABLE `user_sns` (
  `sns_id` varchar(255) NOT NULL,
  `sns_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '1->email\n2->facebook\n3->twitter\n4->mixi\n5->linkedin',
  `user_id` int(10) UNSIGNED NOT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `sns_token` varchar(255) DEFAULT NULL,
  `sns_secret` varchar(255) DEFAULT NULL COMMENT 'incase of email, password stored here',
  `image_url` varchar(255) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_sns`
--

INSERT INTO `user_sns` (`sns_id`, `sns_type`, `user_id`, `user_name`, `sns_token`, `sns_secret`, `image_url`, `create_date`, `update_date`, `status`) VALUES
('test2@test.com', 1, 50, 'test2', NULL, '3831b8d7923e4b1fc03befdfb257efb835e68a29676008bb058aa5e03bb4f4b49ddcfeec51236cbd', NULL, '2013-08-08 17:52:40', '2013-08-08 17:52:40', 1),
('test@test.com', 1, 3, 'test', NULL, '5321b8a69655ab6217e753f3af671cc0d475254e7c9d307e2cac0cf23aa01e92c9e7a5a789ee0372', NULL, '2013-06-03 20:22:29', '2013-06-03 20:22:29', 1),
('tojosephjohn@yahoo.com', 1, 51, 'josephjohn', NULL, 'b90a0c67aad259a0ebc977a2ac33b2309df59a1e012b8e20da3da47b5945059c0e55ab44691f6913', NULL, '2018-07-26 18:45:53', '2018-07-26 18:45:53', 1),
('user10@test.com', 1, 13, 'user10', NULL, '072e9e937800289f8d7effc5190eb3993e537526965b3a1ec265f91006984cade24928065d8031db', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1),
('user11@test.com', 1, 14, 'user11', NULL, '04ffdc95396647f977a2016b2aa434d845598fa0f617a58cfeb48897bde462969621ab0363a4f4b3', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1),
('user12@test.com', 1, 15, 'user12', NULL, '8b793acb8458095d69495eccc799db47cde05650b8c43254db84b7bf9d9654941819eaf2ea370f18', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1),
('user13@test.com', 1, 16, 'user13', NULL, '7972d4ee9c4cce14145bb464c3523d68b4b14de1a3fbb63c53688108196026835839887b2f61ebf6', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user14@test.com', 1, 17, 'user14', NULL, 'b3123961672420325226910e1d5bef119dcf71d01a8f3611fde2357f69a493df5de6a1c417c65f50', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user15@test.com', 1, 18, 'user15', NULL, '6122aed77d743d70955ad78a12f425bf52bce69de8f0236e9174bb177148a3ff511deb1821aa069e', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user16@test.com', 1, 19, 'user16', NULL, '71a3c0afe96529e53f57952c914a89494f9e835ea6d6041b17b2fb34d1f6069337ebe8967ce1287e', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user17@test.com', 1, 20, 'user17', NULL, '70bdf42e68c036f97d33718069a5d8ba87a7705fbf39696da5ce75ca222e4dab10d865a50c4ff0ec', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user18@test.com', 1, 21, 'user18', NULL, '5877d5314bad1c265e12707b529b74ae0f3aebc5f7abba287b8eb737ebdeee6be224836fe6374fa5', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user19@test.com', 1, 22, 'user19', NULL, '9346198194b5a97d1c1ce85fe43b1e3c61f3d9c98fba04f2e0f4dcdf2cb4a4a11a41a1815cbc9997', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user1@test.com', 1, 4, 'user1', NULL, 'bd447516ca1de911bfe8d79a31c605bc80d1bb73fd5621114c0eaf97cc237d237fc5183ebbe5fe7c', NULL, '2013-08-08 11:07:14', '2013-08-08 11:07:14', 1),
('user20@test.com', 1, 23, 'user20', NULL, '1fff7f1874500f1838b73ed4628864d8e3d6a608d8a6fb85b001cc2552ceda83f026f1a18e58cb4e', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user21@test.com', 1, 24, 'user21', NULL, '3d5cc5516d4102e0106a3461447ee3b348d2b36304589e6d953210477f68390541ba17c0d3264854', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user22@test.com', 1, 25, 'user22', NULL, '4701651f6b07631633ebf805988d78a72d9e40ac52ee646dfcd521fce63796faea42af75bd0369b1', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user23@test.com', 1, 26, 'user23', NULL, 'e535420b9a195577d7476e06c2ce04da570f5deb9e1a3690cec38d24feb21c9c931399c35fe210b2', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user24@test.com', 1, 27, 'user24', NULL, '00bfb3e2e53cc572be67dd428dd0a955f2a3ba44ce35285d830939b272b63f86e366f0869ed81973', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user25@test.com', 1, 28, 'user25', NULL, 'f3cee0b0d5b237343293cee0772f91662a5ea047680b2e7a3814ae4ff9e95b2db830bb750fcc1641', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user26@test.com', 1, 29, 'user26', NULL, '5c36734ed88248fa7f17f7953945e918e76343cbb546203cbb6122c924e8e044e6fb9fb1f39fc34f', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user27@test.com', 1, 30, 'user27', NULL, 'f1266372b2b6e74be90f46a4bfaa9042fabc40c830ef3a73efcac15f4ed46b2e74a2d6de9098b4a7', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user28@test.com', 1, 31, 'user28', NULL, '5142e1c53d74b2919c8d1954dd5cf63fdb092b131180fb33782aa32b480547345c375de4e6f37be9', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user29@test.com', 1, 32, 'user29', NULL, 'ac616a9c51bc0339ff1c31af2ecdf91339f06d8510a43c37aaa4313d9ffb657633e31a0499103344', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user2@test.com', 1, 5, 'user2', NULL, '96d26bd5277fb80de604a015beb30fc5b81f994cc813c9dc8f0d1bce7e5861a8ef3c346d345f2d46', NULL, '2013-08-08 11:07:39', '2013-08-08 11:07:39', 1),
('user30@test.com', 1, 33, 'user30', NULL, 'f0432eab8e9b83807a670fb1d6cd6557ea8c8081714bca32f56cac02e17242ed28f4d51e39764f37', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user31@test.com', 1, 34, 'user31', NULL, '78cc4d6fe50d40feb345a27377c3128d772b8facb8d67cb98aef9b524427811abdaa6e997138130d', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user32@test.com', 1, 35, 'user32', NULL, '12e1cb3ba18cc745d6ebf8c2d674f17f358f00993ca891889138f819a1af051948b61bdc62ab9878', NULL, '2013-08-08 13:35:40', '2013-08-08 13:35:40', 1),
('user33@test.com', 1, 36, 'user33', NULL, 'b362189e7b79aa3af3a9f1bc532804c05a38f8c16b966066cfda562ffc16548fd6490d07d9b2abd8', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user34@test.com', 1, 37, 'user34', NULL, '5f5659c2e93347412f35bfcd67d27fe0478e661ca58bb1dc3172f169d48921a0c9eb8bed92fd600c', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user35@test.com', 1, 38, 'user35', NULL, 'e1671d296a4937d5bdad7bb8a5b8c9e4eece361298c170ae6fc11b3c7e5dd79baeb302e89e956f05', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user36@test.com', 1, 39, 'user36', NULL, 'b15f8220a3bf91789bfd9e6f99eadcfd1d7c8c774ebaed90c821b79bd1c25f82372987a43dae3db4', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user37@test.com', 1, 40, 'user37', NULL, '416f42a57a6882c6514cb2362d605c65a12ca4d5c749797c5a980e13bbd1f59584b76991b3817fb6', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user38@test.com', 1, 41, 'user38', NULL, 'e27765fc6f993fb1904817ac3b1ee6a2fd624cdcb9e8c1739f90a36c33a90bbcfcd7a8e57cf32109', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user39@test.com', 1, 42, 'user39', NULL, '7f85a5b965ee3f2e61342058374ffca039254bcf8cf9597a91264e881e17bf2ee79e2fb30cc18a1e', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user3@test.com', 1, 6, 'user3', NULL, 'b8c8ef89e68714e09bb520a360c40f9c5934da8283961f97900d22a25748a137aa4585c0f0330ba2', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1),
('user40@test.com', 1, 43, 'user40', NULL, '430b606fc87a57d98117623f487e5abebed8e99c7135243d8d7e4ca47ffc9797855b278d35e55268', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user41@test.com', 1, 44, 'user41', NULL, '792eeeafd103aa3d8e3bcafc1c5f8161ea93b3f66048f7e4a7d9d4e307cf22ee53d7ee99fd8bb96a', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user42@test.com', 1, 45, 'user42', NULL, '0670d9ae262de5233bf43e3c465d96d4484368fdef303f786e92eb2ebce8d0c077fdff4ffbbfd1ed', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user43@test.com', 1, 46, 'user43', NULL, 'bf08388e2b3ca3cf1f2c6ec3b29fe2f0729e235690f54c9c40938a856c37a282474d87b0dc791adb', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user44@test.com', 1, 47, 'user44', NULL, 'c58603758fd616519c97cebcc56886b87aafb2c4f1f527ce55d29fd9d56437a0422145606baa32e6', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user45@test.com', 1, 48, 'user45', NULL, '3322e7facbc61f500d0c151b7d4b4d4d23aa2db3f91a9d5aaef939555fef5d642e894b18949f0b0a', NULL, '2013-08-08 13:35:41', '2013-08-08 13:35:41', 1),
('user4@test.com', 1, 7, 'user4', NULL, '4a46c1ea12c177955f0769cba39ac1cf8a8a6fda7ae42f9cd83574083890dfd7c0d5e71b60ec2f91', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1),
('user5@test.com', 1, 8, 'user5', NULL, '36985324edcc624effda6f9227ab5f51bc57ac96589c61a358fa8c611a3e59aa3b44b321d75d7848', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1),
('user6@test.com', 1, 9, 'user6', NULL, 'a143daad5cde5b96d3548922311d0880d4d2c680ea0fd7b3b46a647f81580972f9c20dbca9572151', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1),
('user7@test.com', 1, 10, 'user7', NULL, '89cac84ba5289ffd47b22d15004d30eadfa51952af3337ae903590fbb260a5df52798811a7d507a7', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1),
('user8@test.com', 1, 11, 'user8', NULL, 'c53351cb51c8a4e357166cf8f9ac3616552deac30a2e7c41a7e7fdcea1c8d9a5af37b19fc81f3bfd', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1),
('user9@test.com', 1, 12, 'user9', NULL, '93fa816ba645d1fd90e22bf5f55f39216292f2b970dd04a2012cdd1193ab8f686b33ee7b57d74ef3', NULL, '2013-08-08 13:35:39', '2013-08-08 13:35:39', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `UNIQUE_USER_USER_NAME` (`user_name`),
  ADD UNIQUE KEY `UNIQUE_USER_EMAIL` (`email`);

--
-- Indexes for table `user_role`
--
ALTER TABLE `user_role`
  ADD PRIMARY KEY (`user_id`,`role`),
  ADD KEY `fk_user_role_ref_user_by_user_id` (`user_id`);

--
-- Indexes for table `user_sns`
--
ALTER TABLE `user_sns`
  ADD PRIMARY KEY (`sns_id`,`sns_type`),
  ADD KEY `fk_user_sns_ref_user_by_user_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `user_role`
--
ALTER TABLE `user_role`
  ADD CONSTRAINT `fk_user_role_ref_user_by_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `user_sns`
--
ALTER TABLE `user_sns`
  ADD CONSTRAINT `fk_user_sns_ref_user_by_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
