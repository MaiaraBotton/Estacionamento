/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  05443632051
 * Created: 06/10/2022
 */

CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga (
idVaga  int NOT NULL AUTO_INCREMENT,
numero  int NOT NULL,
rua     varchar(50) NOT NULL,
obliqua boolean NOT NULL,
PRIMARY KEY (idVaga));

CREATE TABLE motorista (
idMotorista  int NOT NULL AUTO_INCREMENT,
cpf  int NOT NULL,
genero  boolean NOT NULL,
rg  int NOT NULL,
celular  int NOT NULL,
email    varchar(100) NOT NULL,
senha     varchar(50) NOT NULL,
PRIMARY KEY (idMotorista));
