-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2023 a las 23:11:21
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
CREATE DATABASE IF NOT EXISTS `gran_hotel_91` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `gran_hotel_91`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(4) NOT NULL,
  `idTipo` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `mantenimiento` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `idTipo`, `estado`, `mantenimiento`) VALUES
(1, 1, 1, 1),
(4, 2, 1, 1),
(5, 1, 1, 1),
(6, 3, 1, 1),
(7, 4, 1, 1),
(8, 3, 1, 1),
(9, 3, 1, 1),
(10, 2, 1, 0),
(11, 2, 0, 0),
(12, 2, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

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
(1, 12345, 'Cordoba', 'Julian', 'avellaneda 223', 'aCor@gmail.com', 123123, 0),
(2, 3036555, 'Cordoba', 'Marcelo', 'avellaneda 253', 'aCor@gmail.com', 1564563, 0),
(3, 31059505, 'Leon ', ' marcos', ' CalleA', ' leon.@gmail', 5645, 0),
(4, 25646578, 'Leon ', 'victor', ' Calle B', ' leon.@gmail', 987456, 1),
(5, 303654, ' Caceres', ' ali', ' calle C', ' caceres@gmail', 98765456, 1),
(6, 9876546, ' moreno', ' pablo', ' calle z', ' moreno@gmail', 11454849, 0),
(7, 1234567, 'carrixo', '6546', 'calle r', 'carrixo@gmail', 12345689, 1),
(8, 5654, '45', '54', '554', '45', 5, 0),
(9, 2, 'rey', 'rodrigo', 'calle d', 'rey@gmail', 98756, 1),
(10, 987654321, 'Caba', 'Josefa', '9 de julio 253', 'asd@gmail.com', 911542254, 1),
(12, 31059506, 'cordoba', 'ali', 'calle p', 'ali@.com', 1235654, 1),
(14, 9654321, 'Caba', 'Josefa', '9 de julio 253', 'asd@gmail.com', 911542254, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `fechaIn` date NOT NULL,
  `fechaOut` date NOT NULL,
  `precioTotal` double NOT NULL,
  `cantPersonas` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `idHuesped`, `idHabitacion`, `fechaIn`, `fechaOut`, `precioTotal`, `cantPersonas`, `estado`) VALUES
(1, 1, 1, '2023-10-02', '2023-10-18', 60000, 4, 1),
(7, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(8, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(9, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(10, 2, 7, '2020-03-25', '2021-03-25', 40000, 4, 1),
(11, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(12, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(13, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(14, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(15, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(16, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(17, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(18, 2, 1, '2020-03-25', '2021-03-25', 40000, 4, 1),
(19, 2, 4, '2020-03-25', '2021-03-25', 40000, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodehabitacion`
--

CREATE TABLE `tipodehabitacion` (
  `idTipo` int(11) NOT NULL,
  `cantPers` int(11) NOT NULL,
  `cantCamas` int(11) NOT NULL,
  `tipoDeCamas` varchar(20) NOT NULL,
  `tipoDeHabitacion` varchar(50) NOT NULL,
  `precio` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipodehabitacion`
--

INSERT INTO `tipodehabitacion` (`idTipo`, `cantPers`, `cantCamas`, `tipoDeCamas`, `tipoDeHabitacion`, `precio`, `estado`) VALUES
(1, 4, 4, 'king', 'simple', 20000, 1),
(2, 3, 4, 'doble', 'suite', 63000, 1),
(3, 2, 2, 'Queen', 'triple', 8000, 1),
(4, 4, 4, 'king size', 'doble', 10000, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `idTipo` (`idTipo`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHuesped` (`idHuesped`),
  ADD KEY `idHabitacion` (`idHabitacion`);

--
-- Indices de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  ADD PRIMARY KEY (`idTipo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  MODIFY `idTipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idTipo`) REFERENCES `tipodehabitacion` (`idTipo`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
