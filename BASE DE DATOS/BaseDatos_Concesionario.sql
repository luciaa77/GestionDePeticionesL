CREATE DATABASE Concesionario;
USE Concesionario;

-- Tabla CLIENTE
CREATE TABLE CLIENTE (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(15)
);

-- Tabla USUARIO
CREATE TABLE USUARIO (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre_usuario VARCHAR(50) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    contraseña VARCHAR(50) NOT NULL
);

-- Tabla VENDEDOR
CREATE TABLE VENDEDOR (
    id_vendedor INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla GERENTE
CREATE TABLE GERENTE (
    id_gerente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla VEHÍCULO
CREATE TABLE VEHICULO (
    matricula VARCHAR(10) PRIMARY KEY,
    modelo VARCHAR(50) NOT NULL,
    caracteristicas VARCHAR(255),
    citas_pendientes INT DEFAULT 0,
    fecha_cita DATE
);

-- Tabla TALLER
CREATE TABLE TALLER (
    id_taller INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla CITA
CREATE TABLE CITA (
    id_cita INT PRIMARY KEY AUTO_INCREMENT,
    id_cliente INT,
    fecha_hora DATETIME NOT NULL,
    motivo_cita VARCHAR(255),
    FOREIGN KEY (id_cliente) REFERENCES CLIENTE(id_cliente) ON DELETE SET NULL
);

-- Tabla HORARIO
CREATE TABLE HORARIO (
    id_horario INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE NOT NULL,
    imagen BLOB
);

-- Tabla PEDIDO
CREATE TABLE PEDIDO (
    id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE NOT NULL,
    cantidad INT NOT NULL,
    fecha_llegada DATE,
    num_seguimiento VARCHAR(20)
);

-- Tabla PIEZA
CREATE TABLE PIEZA (
    id_pieza INT PRIMARY KEY AUTO_INCREMENT,
    nombre_pieza VARCHAR(100) NOT NULL,
    caracteristicas_pieza VARCHAR(255)
);


