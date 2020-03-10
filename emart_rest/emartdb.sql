-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2020 at 07:28 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emart`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill_details_table`
--

CREATE TABLE `bill_details_table` (
  `bill_details_id` int(30) NOT NULL,
  `bill_id` int(20) NOT NULL,
  `item_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill_details_table`
--

INSERT INTO `bill_details_table` (`bill_details_id`, `bill_id`, `item_id`) VALUES
(1, 1, 1),
(2, 2, 1),
(63, 28, 3),
(64, 28, 5),
(65, 28, 4),
(66, 28, 2),
(67, 28, 1),
(68, 29, 5),
(69, 29, 4);

-- --------------------------------------------------------

--
-- Table structure for table `bill_table`
--

CREATE TABLE `bill_table` (
  `bill_id` int(20) NOT NULL,
  `bill_type` varchar(30) NOT NULL,
  `bill_date` date NOT NULL,
  `bill_remarks` varchar(100) NOT NULL,
  `bill_amount` int(20) NOT NULL,
  `buyer_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill_table`
--

INSERT INTO `bill_table` (`bill_id`, `bill_type`, `bill_date`, `bill_remarks`, `bill_amount`, `buyer_id`) VALUES
(1, 'xyz', '2020-02-03', 'ewdhy', 23000, 1),
(2, 'xyz', '2020-02-03', 'ewdhy', 23000, 1),
(28, 'credit', '2020-03-06', 'paid', 113200, 1),
(29, 'credit', '2020-03-06', 'paid', 51200, 1);

-- --------------------------------------------------------

--
-- Table structure for table `buyer_signup_table`
--

CREATE TABLE `buyer_signup_table` (
  `buyer_username` varchar(30) NOT NULL,
  `buyer_password` varchar(30) NOT NULL,
  `buyer_email` varchar(50) NOT NULL,
  `buyer_mobile` bigint(20) NOT NULL,
  `buyer_date` date NOT NULL,
  `buyer_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buyer_signup_table`
--

INSERT INTO `buyer_signup_table` (`buyer_username`, `buyer_password`, `buyer_email`, `buyer_mobile`, `buyer_date`, `buyer_id`) VALUES
('aksh', 'aksh', 'aksh@gmail.com', 12345678, '2020-02-11', 1),
('sneha', 'sneha', 'sne@gmail.com', 23456, '2020-03-02', 2);

-- --------------------------------------------------------

--
-- Table structure for table `category_table`
--

CREATE TABLE `category_table` (
  `category_id` int(20) NOT NULL,
  `category_name` varchar(20) NOT NULL,
  `category_brief` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category_table`
--

INSERT INTO `category_table` (`category_id`, `category_name`, `category_brief`) VALUES
(1, 'Electronics', 'electronics like tv, mobiles,  gadgets'),
(2, 'Clothes', 'Womens , Mens and kids wear'),
(3, 'shoes', 'sports wear');

-- --------------------------------------------------------

--
-- Table structure for table `item_table`
--

CREATE TABLE `item_table` (
  `item_id` int(20) NOT NULL,
  `item_name` varchar(30) NOT NULL,
  `item_image` varchar(300) NOT NULL,
  `item_price` int(20) NOT NULL,
  `item_stock` int(20) NOT NULL,
  `item_description` varchar(200) NOT NULL,
  `subcategory_id` int(20) NOT NULL,
  `item_remarks` varchar(200) NOT NULL,
  `seller_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `item_table`
--

INSERT INTO `item_table` (`item_id`, `item_name`, `item_image`, `item_price`, `item_stock`, `item_description`, `subcategory_id`, `item_remarks`, `seller_id`) VALUES
(1, 'samsung m30s', 'https://assets.mspimages.in/wp-content/uploads/2019/10/Samsung-Galaxy-M30s-Review-Header-696x464.jpg', 20000, 5, 'Samsung’s Galaxy M Series’ lineup of affordable, budget smartphones', 1, 'Samsung’s Galaxy M Series’ lineup of affordable, budget smartphones', 1),
(2, 'kurthi', 'https://images.shop101.com/i/4986800326.jpeg', 2000, 4, 'Cut Stitched Long Reyon Kurthi with navy blue and pale orange combination', 3, 'Cut Stitched Long Reyon Kurthi with navy blue and pale orange combination', 2),
(3, 'lenovo ideapad', 'https://images-na.ssl-images-amazon.com/images/I/81z5-EY9T3L._SL1500_.jpg', 40000, 3, 'Lenovo Ideapad S145 Intel Core I3 8th Gen 15.6-inch HD Thin and Light Laptop ', 1, 'Lenovo Ideapad S145 Intel Core I3 8th Gen 15.6-inch HD Thin and Light Laptop ', 2),
(4, 'shoes', 'https://images.ctfassets.net/od02wyo8cgm5/vjfq6gVmJQ2arZFM1Mxr7/0c090d6927856fe9d18c46deaf0d5d9f/cloudswift-fw19-rock_slate-m-d.png', 1200, 3, 'Cloudswift-Road shoe for urban Running', 2, 'Cloudswift-Road shoe for urban Running', 1),
(5, 'Watch', 'https://cdn.shopify.com/s/files/1/0253/0672/6484/products/752023749004_500x.png?v=1578779012', 50000, 5, 'Digital black coloured Wrist Watch, International', 1, 'Digital black coloured Wrist Watch, International', 2),
(6, 'iphone x', 'https://cf.shopee.ph/file/abaabf21cee77f24e37ffd5af42d6445', 50000, 4, '\r\nShopee\r\niPhone X Dark Screen Non-Working Fake Dummy Display Model', 1, '\r\nShopee\r\niPhone X Dark Screen Non-Working Fake Dummy Display Model', 1);

-- --------------------------------------------------------

--
-- Table structure for table `seller_signup_table`
--

CREATE TABLE `seller_signup_table` (
  `seller_id` int(20) NOT NULL,
  `seller_username` varchar(30) NOT NULL,
  `seller_password` varchar(30) NOT NULL,
  `seller_company` varchar(50) NOT NULL,
  `seller_brief` varchar(50) NOT NULL,
  `seller_gst` int(20) NOT NULL,
  `seller_address` varchar(40) NOT NULL,
  `seller_email` varchar(30) NOT NULL,
  `seller_contact` bigint(20) NOT NULL,
  `seller_website` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seller_signup_table`
--

INSERT INTO `seller_signup_table` (`seller_id`, `seller_username`, `seller_password`, `seller_company`, `seller_brief`, `seller_gst`, `seller_address`, `seller_email`, `seller_contact`, `seller_website`) VALUES
(1, 'akshara', 'akshara', 'akshu', 'good', 4, 'hyderabad', 'aksh@gmail.com', 9396217409, 'abc'),
(2, 'sneha', 'sneha', 'sne', 'good', 2, 'hyderabad', 'aksh', 6301837709, 'xyz');

-- --------------------------------------------------------

--
-- Table structure for table `sub_category_table`
--

CREATE TABLE `sub_category_table` (
  `subcategory_id` int(20) NOT NULL,
  `subcategory_name` varchar(20) NOT NULL,
  `category_id` int(20) NOT NULL,
  `subcategory_brief` varchar(50) NOT NULL,
  `subcategory_gst` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sub_category_table`
--

INSERT INTO `sub_category_table` (`subcategory_id`, `subcategory_name`, `category_id`, `subcategory_brief`, `subcategory_gst`) VALUES
(1, 'Phones', 1, 'smart phones, tabs etc', 5),
(2, 'nike shoes', 3, 'formal shoes', 5),
(3, 'Dresses', 2, 'Formal and party women wear', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill_details_table`
--
ALTER TABLE `bill_details_table`
  ADD PRIMARY KEY (`bill_details_id`),
  ADD KEY `bill_details_table_ibfk_1` (`bill_id`),
  ADD KEY `bill_details_table_ibfk_2` (`item_id`);

--
-- Indexes for table `bill_table`
--
ALTER TABLE `bill_table`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `buyer_id` (`buyer_id`);

--
-- Indexes for table `buyer_signup_table`
--
ALTER TABLE `buyer_signup_table`
  ADD PRIMARY KEY (`buyer_id`);

--
-- Indexes for table `category_table`
--
ALTER TABLE `category_table`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `item_table`
--
ALTER TABLE `item_table`
  ADD PRIMARY KEY (`item_id`),
  ADD KEY `item_table_ibfk_1` (`subcategory_id`),
  ADD KEY `item_table_ibfk_2` (`seller_id`);

--
-- Indexes for table `seller_signup_table`
--
ALTER TABLE `seller_signup_table`
  ADD PRIMARY KEY (`seller_id`);

--
-- Indexes for table `sub_category_table`
--
ALTER TABLE `sub_category_table`
  ADD PRIMARY KEY (`subcategory_id`),
  ADD KEY `sub_category_table_ibfk_1` (`category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill_details_table`
--
ALTER TABLE `bill_details_table`
  MODIFY `bill_details_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT for table `bill_table`
--
ALTER TABLE `bill_table`
  MODIFY `bill_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `buyer_signup_table`
--
ALTER TABLE `buyer_signup_table`
  MODIFY `buyer_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `category_table`
--
ALTER TABLE `category_table`
  MODIFY `category_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `item_table`
--
ALTER TABLE `item_table`
  MODIFY `item_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `seller_signup_table`
--
ALTER TABLE `seller_signup_table`
  MODIFY `seller_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `sub_category_table`
--
ALTER TABLE `sub_category_table`
  MODIFY `subcategory_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bill_details_table`
--
ALTER TABLE `bill_details_table`
  ADD CONSTRAINT `bill_details_table_ibfk_1` FOREIGN KEY (`bill_id`) REFERENCES `bill_table` (`bill_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bill_details_table_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `item_table` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `bill_table`
--
ALTER TABLE `bill_table`
  ADD CONSTRAINT `bill_table_ibfk_1` FOREIGN KEY (`buyer_id`) REFERENCES `buyer_signup_table` (`buyer_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `item_table`
--
ALTER TABLE `item_table`
  ADD CONSTRAINT `item_table_ibfk_1` FOREIGN KEY (`subcategory_id`) REFERENCES `sub_category_table` (`subcategory_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `item_table_ibfk_2` FOREIGN KEY (`seller_id`) REFERENCES `seller_signup_table` (`seller_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sub_category_table`
--
ALTER TABLE `sub_category_table`
  ADD CONSTRAINT `sub_category_table_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category_table` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
