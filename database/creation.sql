DROP DATABASE vac_db;
CREATE DATABASE vac_db;
USE vac_db;

CREATE TABLE Vaccin(
vac_id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
vac_serie INT UNSIGNED NOT NULL,
vac_dose INT UNSIGNED NOT NULL,
vac_brand VARCHAR(30) NOT NULL
)ENGINE = InnoDB;

CREATE TABLE Salle(
salle_id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
salle_nom VARCHAR(30) NOT NULL
)ENGINE = InnoDB;

CREATE TABLE Personne(
id INT UNSIGNED NOT NULL  PRIMARY KEY AUTO_INCREMENT,
cin VARCHAR(15) NOT NULL,
password VARCHAR(20) NOT NULL,
nom VARCHAR(30) NOT NULL,
prenom VARCHAR(30) NOT NULL,
adress VARCHAR(60) NOT NULL,
email VARCHAR(30) NOT NULL,
phone VARCHAR(20) NOT NULL, 
Profession VARCHAR(30) NOT NULL,
Age INT UNSIGNED NOT NULL
)ENGINE = InnoDB;


 
CREATE TABLE Rendezvous(
rdv_id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
rdv_date  DATE,
rdv_heure TIME,
rdv_bool BOOLEAN DEFAULT FALSE,
id INT UNSIGNED NOT NULL,
vac_id INT UNSIGNED NOT NULL DEFAULT 1,
salle_id INT UNSIGNED NOT NULL,
FOREIGN KEY (id) REFERENCES Personne(id),
FOREIGN KEY (vac_id) REFERENCES Vaccin(vac_id),
FOREIGN KEY (salle_id) REFERENCES Salle(salle_id)
 )ENGINE = InnoDB;
 
CREATE TABLE feedback(
fb_id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
fb_date DATETIME DEFAULT CURRENT_TIMESTAMP, 
fb_description TEXT NOT NULL,
id INT UNSIGNED NOT NULL,
FOREIGN KEY (id) REFERENCES Personne(id)
)ENGINE = InnoDB;

INSERT INTO Vaccin VALUES
	(1, 0, 0, 'none'),
	(2, 1234, 1, 'Sinopharm'),
	(3, 1234, 2, 'Astrazenica');

INSERT INTO Personne VALUES 
	(1,'C000000R','fostinos','FOS','Fostinos','01 Rue G-D Le roi','fostinos@gmail.com','00212000000000','Etudiant', 20),
	(2,'C111111R','ander','ANDER','Anderson','9 Rue G-D La fontaine','anderson@gmail.com','00212111111111','Etudiant', 21),
	(3,'C222222R','sky','SKY','Skywalker','101 Boulevard Royal','sky@gmail.com','00212222222222','Etudiant', 19),
	(4,'C333333R','pliss','PLISS','Plissken','33 Rue de Zinzibar','plissken@gmail.com','00212333333333','Etudiant', 20),
	(5,'C444444R','ripl','RIPL','Ripley','6 Rue de Paris','ripley@gmail.com','00212444444444','Etudiant', 18);
	
INSERT INTO Salle VALUES 
	(1,'B110'),
	(2,'B112'),
	(3,'B114'),
	(4,'B206'),
	(5,'B210');
	
INSERT INTO Rendezvous VALUES 
	(1,'2021-02-19', '09:31', true, 1, 2, 1),
	(2,'2021-02-16', '09:31', true, 2, 1, 2),
	(3,'2021-02-16', '09:30', false, 3, 1, 3);
    
INSERT INTO Feedback VALUES 
	(1,'2021-02-20 09:30', "Depuis hier soir, je me sens de plus en plus fatigué à cause du vaccin.", 1),
	(2,'2021-02-21 10:30', "Je tiens à signaler que le vaccin n'a aucun effet secondaire chez moi jusqu'à maintenant.",  2);
