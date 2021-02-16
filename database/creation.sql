DROP DATABASE vac_db;
CREATE DATABASE vac_db;
USE vac_db;

CREATE TABLE Vaccin(
vac_id INT UNSIGNED NOT NULL PRIMARY KEY,
brand VARCHAR(30) NOT NULL,
num_serie INT UNSIGNED NOT NULL
)ENGINE = InnoDB;

CREATE TABLE centre(
centre_id INT UNSIGNED NOT NULL PRIMARY KEY,
nom VARCHAR(30) NOT NULL,
adress VARCHAR(30) NOT NULL,
ville VARCHAR(50) NOT NULL
)ENGINE = InnoDB;

CREATE TABLE Personne(
pers_id INT UNSIGNED NOT NULL  PRIMARY KEY,
cin VARCHAR(15) NOT NULL,
password VARCHAR(20) NOT NULL,
nom VARCHAR(30) NOT NULL,
prenom VARCHAR(30) NOT NULL,
adress VARCHAR(30) NOT NULL,
email VARCHAR(30) NOT NULL,
phone VARCHAR(20) NOT NULL, 
ville VARCHAR(30) NOT NULL,
region VARCHAR(30) NOT NULL,
municipalite VARCHAR(30) NOT NULL,
vac_id INT UNSIGNED NOT NULL DEFAULT 0,
 FOREIGN KEY (vac_id) REFERENCES Vaccin(vac_id)
 )ENGINE = InnoDB;


 
CREATE TABLE Rendezvous(
centre_id INT UNSIGNED NOT NULL,
pers_id INT UNSIGNED NOT NULL,
rdv_date  DATE,
houre time,
rd_id INT UNSIGNED NOT NULL PRIMARY KEY,
num_dose INT UNSIGNED DEFAULT NULL,
 FOREIGN KEY (pers_id) REFERENCES Personne(pers_id),
 FOREIGN KEY (centre_id) REFERENCES centre(centre_id)
 )ENGINE = InnoDB;
 
CREATE TABLE feedback(
date_of_feedback DATE, 
description VARCHAR(100) NOT NULL,
pers_id INT UNSIGNED NOT NULL,
feedb_id INT UNSIGNED NOT NULL  PRIMARY KEY,
 FOREIGN KEY (pers_id) REFERENCES Personne(pers_id)
)ENGINE = InnoDB;

INSERT INTO Vaccin VALUES 
	(0, 'DEFAULT', 0000);

INSERT INTO Personne VALUES 
	(1,'C000000R','fostinos','FOS','Fostinos','01 Rue G-D Le roi','fostinos@gmail.com','00212000000000','Rabat','Madinat', 'Al Irfane',0),
	(2,'C111111R','ander','ANDER','Anderson','9 Rue G-D La fontaine','anderson@gmail.com','0021211111111','Meknes','REG1', 'MIN1',0),
	(3,'C222222R','sky','SKY','Skywalker','101 Boulevard Royal','sky@gmail.com','00212222222222','Tanger','REG2', 'MIN2',0),
	(4,'C333333R','pliss','PLISS','Plissken','33 Rue de Zinzibar','plissken@gmail.com','0021233333333','Casablanca','REG3', 'MIN3',0),
	(5,'C444444R','ripl','RIPL','Ripley','6 Rue de Paris','ripley@gmail.com','00212444444444','Fes','REG4', 'MIN4',0);
	
INSERT INTO Centre VALUES 
	(1,'CENTER1','01 Rue Mohamed','Rabat'),
	(2,'CENTER2','01 Rue Prince','Meknes'),
	(3,'CENTER3','01 Rue Sidi','Tanger'),
	(4,'CENTER4','01 Rue Lissasfa','Casablanca'),
	(5,'CENTER5','01 Rue Karama','FES');
	

