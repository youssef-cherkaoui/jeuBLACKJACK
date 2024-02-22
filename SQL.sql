create table Croupier(
	id_croupier SERIAL PRIMARY KEY ,
	valeurTotalLimit INT NOT NULL 
	
);

create table Joueur(
	id_joueur SERIAL PRIMARY KEY,
	valeurTotalLimit INT NOT NULL,
	solde REAL NOT NULL
);

create table PaquetCarte(
	id_PaquetCartes SERIAL PRIMARY KEY,
	taille INT NOT NULL
);

create table Carte(
	id_carte SERIAL PRIMARY KEY,
    type VARCHAR (70) NOT NULL,
	valeur INT NOT NULL,
	valeurnom VARCHAR(70) PRIMARY KEY			   				   
);

create table Main(
	id_Main SERIAL PRIMARY KEY ,
	valeurTotal INT NOT NULL ,
	nbCartes INT NOT NULL ,
	id_joueur INT,
	id_croupier INT,
	FOREIGN KEY (id_croupier) REFERENCES Croupier(id_croupier),
	FOREIGN KEY (id_joueur) REFERENCES Joueur(id_joueur)
);










