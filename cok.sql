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
CREATE DATABASE IF NOT EXISTS `root` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `root`;

-- membuang struktur untuk table root.barang
CREATE TABLE IF NOT EXISTS `barang` (
  `kode` varchar(25) NOT NULL,
  `nm` varchar(50) NOT NULL,
  `satuan` varchar(15) NOT NULL,
  `hrg` bigint(20) NOT NULL,
  `stok` float NOT NULL,
  `deleted` tinyint(1) NOT NULL,
  `biji` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Membuang data untuk tabel root.barang: ~44 rows (lebih kurang)
/*!40000 ALTER TABLE `barang` DISABLE KEYS */;
INSERT INTO `barang` (`kode`, `nm`, `satuan`, `hrg`, `stok`, `deleted`, `biji`) VALUES
	('Asb', 'Asbes Harvlex 150 x 80 x 0.35', 'Lembar', 25000, 15, 0, 1),
	('Asb10', 'Asbes Harvlex 240 x 105 x 0.4', 'Lembur', 68500, 5, 0, 1),
	('Asb11', 'Asbes Harvlex 270 x 105x 0.4', 'Lembur', 74000, 15, 0, 1),
	('Asb12', 'Asbes Harvlex 300 x 105 x 0.4', 'Lembar', 82000, 15, 0, 1),
	('Asb2', 'Asbes Harvlex 180 x 80 x 0.35', 'Lembar', 33500, 12, 0, 1),
	('Asb3', 'Asbes Harvlex 210 x 80 x 0.35', 'Lembar', 37500, 15, 0, 1),
	('Asb4', 'Asbes Harvlex 240 x 80 x 0.35', 'Lembar', 42500, 15, 0, 1),
	('Asb5', 'Asbes Harvlex 270 x 80 x 0.35', 'Lembar', 49500, 15, 0, 1),
	('Asb6', 'Asbes Harvlex 300 x 80 x 0.35', 'Lembar', 55500, 15, 0, 1),
	('Asb7', 'Asbes Harvlex 150 x 105 x 0.4', 'Lembar', 44500, 15, 0, 1),
	('Asb8', 'Asbes Harvlex 180 x 105 x 0.4', 'Lembar', 49000, 15, 0, 1),
	('Asb9', 'Asbes Harvlex 210 x 105 x 0.4', 'Lembar', 56500, 15, 0, 1),
	('BW', 'Benang Woll', 'buah', 2000, 41, 0, 0),
	('CalO', 'Calsium Onyacarb', 'Sak', 30000, 17, 0, 1),
	('Ckl', 'Cangkul', 'buah', 75000, 15, 0, 1),
	('Eng', 'Engsel Pintu', 'buah', 5000, 100, 0, 1),
	('GerG', 'Gergaji', 'buah', 55000, 14, 0, 1),
	('Kbl', 'Kabel Merah Hitam', 'Meter', 3000, 155, 0, 0),
	('kbl hj', 'kabel hijau', 'meter', 5000, 0, 0, 0),
	('Kbl Pth Bs', 'Kabel Putih Besar', 'Meter', 8000, 150, 0, 0),
	('Kr', 'Keran', 'buah', 5000, 17, 0, 1),
	('Mt', 'Meteran', 'Buah', 25000, 14, 0, 1),
	('Pku', 'Paku 1cm', 'Kg', 5000, 10, 0, 0),
	('Pl', 'Palu', 'buah', 30000, 15, 0, 1),
	('Psr', 'Pasir', 'Kg', 3000, 500, 0, 1),
	('Scp', 'Scop', 'buah', 85000, 14, 0, 1),
	('SealT', 'Sealtape', 'buah', 5000, 50, 0, 1),
	('Sel', 'Selang', 'Meter', 5000, 50, 0, 0),
	('Seng', 'Seng 0.20 mm x 1,8 m x 80 cm', 'Lembar', 48000, 13, 0, 1),
	('Seng2', 'Seng 0,25 mm x 180 cm', 'Lembar', 60500, 15, 0, 1),
	('Seng3', 'Seng 0,25 mm x 210 cm', 'Lembur', 69500, 15, 0, 1),
	('Seng4', 'Seng 0,25 mm x 240 cm', 'Lembur', 80000, 15, 0, 1),
	('Seng5', 'Seng 0,25 mm x 300 cm', 'Lembur', 100000, 15, 0, 1),
	('Seng6', 'Seng 0,3 mm x 180 cm', 'Lembur', 68000, 15, 0, 1),
	('Seng7', 'Seng 0,3 mm x 210 cm', 'Lembar', 80000, 15, 0, 1),
	('Seng8', 'Seng 0,3 mm x 240 cm', 'Lembar', 90000, 15, 0, 1),
	('Seng9', 'Seng 0,3 mm x 300 cm', 'Lembar', 113000, 15, 0, 1),
	('SG', 'Semen Gresik', 'Sak', 50000, 30, 0, 1),
	('SG ec', 'Semen Gresik Eceran', 'KG', 12000, 20, 0, 0),
	('SH', 'Semen Holcim', 'Sak', 45000, 30, 0, 1),
	('SIndo', 'Indocement', 'Sak', 40000, 16, 0, 1),
	('SPTR', 'Semen Putih Tiga Roda', 'Sak', 35000, 1, 0, 1),
	('SPTR ec', 'Semen TG Putih Eceran', 'KG', 10000, 13, 0, 0),
	('Tmp', 'Tampar', 'Meter', 2000, 50, 0, 0);
/*!40000 ALTER TABLE `barang` ENABLE KEYS */;

-- membuang struktur untuk table root.detjual
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

-- Membuang data untuk tabel root.detjual: ~17 rows (lebih kurang)
/*!40000 ALTER TABLE `detjual` DISABLE KEYS */;
INSERT INTO `detjual` (`nota`, `brg`, `jum`, `byr`) VALUES
	('wijaya1186251anonym', 'CalO', 1, 'IDR 30000.00'),
	('wijaya1186251anonym', 'Asb2', 1, 'IDR 33500.00'),
	('wijaya1186251anonym', 'SPTR', 1, 'IDR 35000.00'),
	('wijaya1186251anonym', 'CalO', 1, 'IDR 30000.00'),
	('wijaya1186251anonym', 'Asb2', 1, 'IDR 33500.00'),
	('wijaya1186251anonym', 'SPTR', 1, 'IDR 35000.00'),
	('wijaya11862521', 'Scp', 1, 'IDR 85000.00'),
	('wijaya11862521', 'Seng', 2, 'IDR 48000.00'),
	('wijaya11862521', 'Mt', 1, 'IDR 25000.00'),
	('wijaya11862521', 'GerG', 1, 'IDR 55000.00'),
	('wijaya11862521', 'Kr', 3, 'IDR 5000.00'),
	('wijaya1186271anonym', 'SIndo', 4, 'IDR 40000.00'),
	('wijaya1186271anonym', 'Asb10', 2, 'IDR 68500.00'),
	('wijaya11862721', 'Asb10', 9, 'IDR 68500.00'),
	('wijaya11862731', 'Asb10', 9, 'IDR 68500.00'),
	('wijaya11862741', 'SPTR', 9, 'IDR 35000.00'),
	('wijaya11862741', 'BW', 9, 'IDR 2000.00'),
	('wijaya11862751', 'SPTR', 9, 'IDR 35000.00'),
	('wijaya1184211', 'SPTR ec', 5, 'IDR 10000.00'),
	('wijaya118422anonym', 'SPTR ec', 2, 'IDR 10000.00');
/*!40000 ALTER TABLE `detjual` ENABLE KEYS */;

-- membuang struktur untuk table root.jual
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

-- Membuang data untuk tabel root.jual: ~9 rows (lebih kurang)
/*!40000 ALTER TABLE `jual` DISABLE KEYS */;
INSERT INTO `jual` (`nota`, `pel`, `tgl`, `total`, `kembali`, `byr`, `deleted`) VALUES
	('wijaya1184211', '1', '2018-05-02', 'IDR 50000.00', 'IDR 50000.00', 'IDR 100000.00', 0),
	('wijaya118422anonym', 'anonym', '2018-05-02', 'IDR 20000.00', 'IDR 10000.00', 'IDR 30000.00', 0),
	('wijaya1186251anonym', 'anonym', '2018-07-25', 'IDR 98500.00', 'IDR 1500.00', 'IDR 100000.00', 0),
	('wijaya11862521', '1', '2018-07-25', 'IDR 276000.00', 'IDR 24000.00', 'IDR 300000.00', 0),
	('wijaya1186271anonym', 'anonym', '2018-07-27', 'IDR 297000.00', 'IDR 3000.00', 'IDR 300000.00', 0),
	('wijaya11862721', '1', '2018-07-27', 'IDR 616500.00', 'IDR 83500.00', 'IDR 700000.00', 0),
	('wijaya11862731', '1', '2018-07-27', 'IDR 616500.00', 'IDR 83500.00', 'IDR 700000.00', 0),
	('wijaya11862741', '1', '2018-07-27', 'IDR 333000.00', 'IDR 67000.00', 'IDR 400000.00', 0),
	('wijaya11862751', '1', '2018-07-27', 'IDR 315000.00', 'IDR 35000.00', 'IDR 350000.00', 0);
/*!40000 ALTER TABLE `jual` ENABLE KEYS */;

-- membuang struktur untuk table root.memasok
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

-- Membuang data untuk tabel root.memasok: ~45 rows (lebih kurang)
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
	('Tmp', '001', 1000, 50, '2018-07-25'),
	('Pku', '001', 3000, 10, '2018-07-27'),
	('Kbl', '001', 2000, 5, '2018-07-27');
/*!40000 ALTER TABLE `memasok` ENABLE KEYS */;

-- membuang struktur untuk table root.pelanggan
CREATE TABLE IF NOT EXISTS `pelanggan` (
  `kode` varchar(25) NOT NULL,
  `nm` varchar(20) NOT NULL,
  `almt` text NOT NULL,
  `tlp` char(15) NOT NULL,
  `deleted` tinyint(1) NOT NULL,
  `blocked` tinyint(1) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Membuang data untuk tabel root.pelanggan: ~3 rows (lebih kurang)
/*!40000 ALTER TABLE `pelanggan` DISABLE KEYS */;
INSERT INTO `pelanggan` (`kode`, `nm`, `almt`, `tlp`, `deleted`, `blocked`) VALUES
	('1', 'M Bil Haqiqi', 'JL Letda Sucipto NO 156, Tuban, Tuban, Jawa Timur', '082230276346', 0, 0),
	('2', 'M Solikin', 'Ds Klampok, Bejagung, Semanding, Tuban, Jawa Timur', '085733650451', 0, 0),
	('3', 'Setyana Purwindari', 'Jl Pahlawan no 69 Tuban, Semanding , Tuban, Jawa Timur', '089669866352', 0, 0),
	('anonym', 'Tak dikenal', '-', '-', 0, 0);
/*!40000 ALTER TABLE `pelanggan` ENABLE KEYS */;

-- membuang struktur untuk table root.suplier
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
