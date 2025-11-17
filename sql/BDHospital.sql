drop database if exists bdhospital;
create database bdhospital;
use bdhospital;

-- ==============================
-- TABLA: HistorialMedico
-- ==============================
CREATE TABLE HistorialMedico (
    historialMedicoID INT AUTO_INCREMENT PRIMARY KEY,
    alergias VARCHAR(1000),
    medicamentos VARCHAR(1000),
    enfermedades VARCHAR(1000),
    vacunas VARCHAR(1000)
);

-- ==============================
-- TABLA: Hospital
-- ==============================
CREATE TABLE Hospital (
    hospitalID INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    pais   VARCHAR(100),
    numCamas INT
);

-- ==============================
-- TABLA: Habitacion
-- ==============================
CREATE TABLE Habitacion (
    habitacionID INT AUTO_INCREMENT PRIMARY KEY,
    hospitalID INT NOT NULL,
    numero VARCHAR(10) NOT NULL,
    disponible BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (hospitalID) REFERENCES Hospital(hospitalID)
        ON DELETE CASCADE ON UPDATE CASCADE,
    UNIQUE (hospitalID, numero) 
);

-- ==============================
-- TABLA: Paciente
-- ==============================
CREATE TABLE Paciente (
    pacienteID INT AUTO_INCREMENT PRIMARY KEY,
    nombre  VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    historialMedicoID INT UNIQUE,        
    habitacionID INT NULL,               
    FOREIGN KEY (historialMedicoID) REFERENCES HistorialMedico(historialMedicoID)
        ON DELETE SET NULL ON UPDATE CASCADE,
    FOREIGN KEY (habitacionID) REFERENCES Habitacion(habitacionID)
        ON DELETE SET NULL ON UPDATE CASCADE
);

-- ==============================
-- TABLA: LicenciaProfesional
-- ==============================
CREATE TABLE LicenciaProfesional (
    licenciaProfesionalID INT AUTO_INCREMENT PRIMARY KEY,
    numero_licencia VARCHAR(50) NOT NULL,
    organismo VARCHAR(100),
    fecha_emision DATE,
    fecha_expiracion DATE,
    UNIQUE (numero_licencia) 
);

-- ==============================
-- TABLA: Doctor
-- ==============================
CREATE TABLE Doctor (
    doctorID INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    hospitalID INT NOT NULL,
    licenciaProfesionalID INT UNIQUE, 
    FOREIGN KEY (hospitalID) REFERENCES Hospital(hospitalID)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (licenciaProfesionalID) REFERENCES LicenciaProfesional(licenciaProfesionalID)
        ON DELETE SET NULL ON UPDATE CASCADE
);

-- ==============================
-- TABLA PUENTE: Atiende 
-- ==============================
CREATE TABLE Atiende (
    pacienteID INT NOT NULL,
    doctorID   INT NOT NULL,
    nota VARCHAR(1000),                 
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (pacienteID, doctorID, fecha),
    FOREIGN KEY (pacienteID) REFERENCES Paciente(pacienteID)
        ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (doctorID)   REFERENCES Doctor(doctorID)
        ON DELETE CASCADE ON UPDATE CASCADE
);
