-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:48:51
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gran_hotel_91`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

DROP TABLE IF EXISTS `huesped`;
CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `DNI` int(8) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Domicilio` varchar(50) NOT NULL,
  `Correo` varchar(100) NOT NULL,
  `Celular` int(15) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `DNI`, `Apellido`, `Nombres`, `Domicilio`, `Correo`, `Celular`, `Estado`) VALUES
(1, 12345, 'Cordoba', 'Julian', 'avellaneda 223', 'aCor@gmail.com', 123123, 1),
(4, 123456789, 'Mendoza', 'Maria', 'Libertador 253', 'abMen@gmail.com', 394258155, 1),
(5, 987654321, 'Caba', 'Josefa', '9 de julio 253', 'asd@gmail.com', 911542254, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
