-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versi server:                 10.2.6-MariaDB - mariadb.org binary distribution
-- OS Server:                    Win64
-- HeidiSQL Versi:               9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Membuang struktur basisdata untuk root
DROP DATABASE IF EXISTS `root`;
CREATE DATABASE IF NOT EXISTS `root` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `root`;

-- membuang struktur untuk table root.barang
DROP TABLE IF EXISTS `barang`;
CREATE TABLE IF NOT EXISTS `barang` (
  `kode` varchar(25) NOT NULL,
  `nm` varchar(50) NOT NULL,
  `satuan` varchar(15) NOT NULL,
  `hrg` bigint(20) NOT NULL,
  `stok` float NOT NULL,
  `deleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Membuang data untuk tabel root.barang: ~37 rows (lebih kurang)
/*!40000 ALTER TABLE `barang` DISABLE KEYS */;
INSERT INTO `barang` (`kode`, `nm`, `satuan`, `hrg`, `stok`, `deleted`) VALUES
	('Asb', 'Asbes Harvlex 150 x 80 x 0.35', 'Lembar', 25000, 15, 0),
	('Asb10', 'Asbes Harvlex 240 x 105 x 0.4', 'Lembur', 68500, 15, 0),
	('Asb11', 'Asbes Harvlex 270 x 105x 0.4', 'Lembur', 74000, 15, 0),
	('Asb12', 'Asbes Harvlex 300 x 105 x 0.4', 'Lembar', 82000, 15, 0),
	('Asb2', 'Asbes Harvlex 180 x 80 x 0.35', 'Lembar', 33500, 15, 0),
	('Asb3', 'Asbes Harvlex 210 x 80 x 0.35', 'Lembar', 37500, 15, 0),
	('Asb4', 'Asbes Harvlex 240 x 80 x 0.35', 'Lembar', 42500, 15, 0),
	('Asb5', 'Asbes Harvlex 270 x 80 x 0.35', 'Lembar', 49500, 15, 0),
	('Asb6', 'Asbes Harvlex 300 x 80 x 0.35', 'Lembar', 55500, 15, 0),
	('Asb7', 'Asbes Harvlex 150 x 105 x 0.4', 'Lembar', 44500, 15, 0),
	('Asb8', 'Asbes Harvlex 180 x 105 x 0.4', 'Lembar', 49000, 15, 0),
	('Asb9', 'Asbes Harvlex 210 x 105 x 0.4', 'Lembar', 56500, 15, 0),
	('BW', 'Benang Woll', 'buah', 2000, 50, 0),
	('CalO', 'Calsium Onyacarb', 'Sak', 30000, 20, 0),
	('Ckl', 'Cangkul', 'buah', 75000, 15, 0),
	('Eng', 'Engsel Pintu', 'buah', 5000, 100, 0),
	('GerG', 'Gergaji', 'buah', 55000, 15, 0),
	('Kbl', 'Kabel Merah Hitam', 'Meter', 3000, 150, 0),
	('Kbl Pth Bs', 'Kabel Putih Besar', 'Meter', 8000, 150, 0),
	('Kr', 'Keran', 'buah', 5000, 20, 0),
	('Mt', 'Meteran', 'Buah', 25000, 15, 0),
	('Pl', 'Palu', 'buah', 30000, 15, 0),
	('Psr', 'Pasir', 'Kg', 3000, 500, 0),
	('Scp', 'Scop', 'buah', 85000, 15, 0),
	('SealT', 'Sealtape', 'buah', 5000, 50, 0),
	('Sel', 'Selang', 'Meter', 5000, 50, 0),
	('Seng', 'Seng 0.20 mm x 1,8 m x 80 cm', 'Lembar', 48000, 15, 0),
	('Seng2', 'Seng 0,25 mm x 180 cm', 'Lembar', 60500, 15, 0),
	('Seng3', 'Seng 0,25 mm x 210 cm', 'Lembur', 69500, 15, 0),
	('Seng4', 'Seng 0,25 mm x 240 cm', 'Lembur', 80000, 15, 0),
	('Seng5', 'Seng 0,25 mm x 300 cm', 'Lembur', 100000, 15, 0),
	('Seng6', 'Seng 0,3 mm x 180 cm', 'Lembur', 68000, 15, 0),
	('Seng7', 'Seng 0,3 mm x 210 cm', 'Lembar', 80000, 15, 0),
	('Seng8', 'Seng 0,3 mm x 240 cm', 'Lembar', 90000, 15, 0),
	('Seng9', 'Seng 0,3 mm x 300 cm', 'Lembar', 113000, 15, 0),
	('SG', 'Semen Gresik', 'Sak', 50000, 30, 0),
	('SG ec', 'Semen Gresik Eceran', 'KG', 12000, 20, 0),
	('SH', 'Semen Holcim', 'Sak', 45000, 30, 0),
	('SIndo', 'Indocement', 'Sak', 40000, 20, 0),
	('SPTR', 'Semen Putih Tiga Roda', 'Sak', 35000, 20, 0),
	('SPTR ec', 'Semen TG Putih Eceran', 'KG', 10000, 20, 0),
	('Tmp', 'Tampar', 'Meter', 2000, 50, 0);
/*!40000 ALTER TABLE `barang` ENABLE KEYS */;

-- membuang struktur untuk table root.detjual
DROP TABLE IF EXISTS `detjual`;
CREATE TABLE IF NOT EXISTS `detjual` (
  `nota` varchar(37) NOT NULL,
  `brg` varchar(25) NOT NULL,
  `jum` float NOT NULL,
  `byr` text NOT NULL,
  KEY `nota` (`nota`),
  KEY `brg` (`brg`),
  CONSTRAINT `detjual_ibfk_1` FOREIGN KEY (`nota`) REFERENCES `jual` (`nota`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detjual_ibfk_2` FOREIGN KEY (`brg`) REFERENCES `barang` (`kode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Membuang data untuk tabel root.detjual: ~0 rows (lebih kurang)
/*!40000 ALTER TABLE `detjual` DISABLE KEYS */;
/*!40000 ALTER TABLE `detjual` ENABLE KEYS */;

-- membuang struktur untuk table root.jual
DROP TABLE IF EXISTS `jual`;
CREATE TABLE IF NOT EXISTS `jual` (
  `nota` varchar(37) NOT NULL,
  `pel` varchar(25) NOT NULL,
  `tgl` date NOT NULL,
  `total` text NOT NULL,
  `kembali` text NOT NULL,
  `byr` text NOT NULL,
  `deleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`nota`),
  KEY `pel` (`pel`),
  CONSTRAINT `jual_ibfk_1` FOREIGN KEY (`pel`) REFERENCES `pelanggan` (`kode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Membuang data untuk tabel root.jual: ~0 rows (lebih kurang)
/*!40000 ALTER TABLE `jual` DISABLE KEYS */;
/*!40000 ALTER TABLE `jual` ENABLE KEYS */;

-- membuang struktur untuk table root.memasok
DROP TABLE IF EXISTS `memasok`;
CREATE TABLE IF NOT EXISTS `memasok` (
  `brg` varchar(25) NOT NULL,
  `sup` varchar(20) NOT NULL,
  `sat` bigint(20) NOT NULL,
  `jum` float NOT NULL,
  `tgl` date NOT NULL,
  KEY `brg` (`brg`),
  KEY `sup` (`sup`),
  CONSTRAINT `memasok_ibfk_1` FOREIGN KEY (`brg`) REFERENCES `barang` (`kode`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `memasok_ibfk_2` FOREIGN KEY (`sup`) REFERENCES `suplier` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Membuang data untuk tabel root.memasok: ~49 rows (lebih kurang)
/*!40000 ALTER TABLE `memasok` DISABLE KEYS */;
INSERT INTO `memasok` (`brg`, `sup`, `sat`, `jum`, `tgl`) VALUES
	('SG', '001', 40000, 10, '2018-05-28'),
	('SH', '001', 35000, 10, '2018-05-28'),
	('Asb', '001', 15000, 15, '2018-07-25'),
	('Asb10', '001', 48500, 15, '2018-07-25'),
	('Asb11', '001', 54000, 15, '2018-07-25'),
	('Asb12', '001', 62000, 15, '2018-07-25'),
	('Asb2', '001', 13500, 15, '2018-07-25'),
	('Asb3', '001', 17500, 15, '2018-07-25'),
	('Asb4', '001', 22500, 15, '2018-07-25'),
	('Asb5', '001', 29500, 15, '2018-07-25'),
	('Asb6', '001', 35500, 15, '2018-07-25'),
	('Asb7', '001', 24500, 15, '2018-07-25'),
	('Asb8', '001', 29000, 15, '2018-07-25'),
	('Asb9', '001', 36500, 15, '2018-07-25'),
	('BW', '001', 1000, 50, '2018-07-25'),
	('CalO', '001', 20000, 20, '2018-07-25'),
	('Ckl', '001', 65500, 15, '2018-07-25'),
	('Eng', '001', 4000, 100, '2018-07-25'),
	('GerG', '001', 50000, 15, '2018-07-25'),
	('Kbl', '001', 2000, 150, '2018-07-25'),
	('Kbl Pth Bs', '001', 5000, 150, '2018-07-25'),
	('Kr', '001', 3500, 20, '2018-07-25'),
	('Mt', '001', 20000, 15, '2018-07-25'),
	('Pl', '001', 25000, 15, '2018-07-25'),
	('Psr', '001', 2000, 1, '2018-07-25'),
	('Psr', '001', 2000, 1, '2018-07-25'),
	('Psr', '001', 2000, 20, '2018-07-25'),
	('Psr', '001', 2000, 100, '2018-07-25'),
	('Psr', '001', 2000, 78, '2018-07-25'),
	('Psr', '001', 2000, 300, '2018-07-25'),
	('Scp', '001', 75000, 15, '2018-07-25'),
	('SealT', '001', 4000, 50, '2018-07-25'),
	('Sel', '001', 4000, 50, '2018-07-25'),
	('Seng', '001', 38000, 15, '2018-07-25'),
	('Seng2', '001', 50500, 15, '2018-07-25'),
	('Seng3', '001', 59500, 15, '2018-07-25'),
	('Seng4', '001', 65000, 15, '2018-07-25'),
	('Seng5', '001', 80000, 15, '2018-07-25'),
	('Seng6', '001', 58000, 15, '2018-07-25'),
	('Seng7', '001', 65000, 15, '2018-07-25'),
	('Seng8', '001', 70000, 15, '2018-07-25'),
	('Seng9', '001', 93000, 15, '2018-07-25'),
	('SG ec', '001', 10000, 20, '2018-07-25'),
	('SIndo', '001', 35000, 20, '2018-07-25'),
	('SH', '001', 35000, 20, '2018-07-25'),
	('SG', '001', 40000, 20, '2018-07-25'),
	('SPTR', '001', 25000, 20, '2018-07-25'),
	('SPTR ec', '001', 8000, 20, '2018-07-25'),
	('Tmp', '001', 1000, 50, '2018-07-25');
/*!40000 ALTER TABLE `memasok` ENABLE KEYS */;

-- membuang struktur untuk table root.pelanggan
DROP TABLE IF EXISTS `pelanggan`;
CREATE TABLE IF NOT EXISTS `pelanggan` (
  `kode` varchar(25) NOT NULL,
  `nm` varchar(20) NOT NULL,
  `almt` text NOT NULL,
  `tlp` char(15) NOT NULL,
  `deleted` tinyint(1) NOT NULL,
  `blocked` tinyint(1) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Membuang data untuk tabel root.pelanggan: ~0 rows (lebih kurang)
/*!40000 ALTER TABLE `pelanggan` DISABLE KEYS */;
INSERT INTO `pelanggan` (`kode`, `nm`, `almt`, `tlp`, `deleted`, `blocked`) VALUES
	('anonym', 'Tak dikenal', '-', '-', 0, 0);
/*!40000 ALTER TABLE `pelanggan` ENABLE KEYS */;

-- membuang struktur untuk table root.suplier
DROP TABLE IF EXISTS `suplier`;
CREATE TABLE IF NOT EXISTS `suplier` (
  `id` varchar(20) NOT NULL,
  `nm` varchar(40) NOT NULL,
  `almt` text NOT NULL,
  `jns` varchar(10) NOT NULL,
  `tlp` char(15) NOT NULL,
  `deleted` tinyint(1) NOT NULL,
  `blocked` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Membuang data untuk tabel root.suplier: ~0 rows (lebih kurang)
/*!40000 ALTER TABLE `suplier` DISABLE KEYS */;
INSERT INTO `suplier` (`id`, `nm`, `almt`, `jns`, `tlp`, `deleted`, `blocked`) VALUES
	('001', 'Agung Sentosa', 'Jl Basuki Rachmat', 'Semen', '081212121212', 0, 0);
/*!40000 ALTER TABLE `suplier` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
