DROP TABLE IF EXISTS sale;
DROP TABLE IF EXISTS client;
DROP TABLE IF EXISTS seller;
DROP TABLE IF EXISTS item;

CREATE TABLE client (
  idclient INTEGER PRIMARY KEY,
  cedula INTEGER NOT NULL,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  age VARCHAR(250) NOT NULL,
  CONSTRAINT PK_Client PRIMARY KEY (idclient)
);

CREATE TABLE seller(
    idseller INTEGER PRIMARY KEY,
    codvende INTEGER NOT NULL,
    firstname VARCHAR (250) NOT NULL,
    lastname VARCHAR (250) NOT NULL,
    age VARCHAR(250) NOT NULL,
    CONSTRAINT PK_Seller PRIMARY KEY (idseller)
 );

CREATE TABLE item(
    iditem INTEGER PRIMARY KEY,
    nombre VARCHAR(250) NOT NULL,
    cantidad INTEGER NOT NULL,
    codigo VARCHAR(250) NOT NULL,
    precio DOUBLE NOT NULL,
    CONSTRAINT PK_Item PRIMARY KEY (iditem)
);

CREATE TABLE sale(
    idsale INTEGER PRIMARY KEY,
    fecha VARCHAR(250) NOT NULL,
    iditem VARCHAR(250) NOT NULL,
    idclient VARCHAR(250) NOT NULL,
    idseller VARCHAR(250) NOT NULL,
    totalventa DOUBLE NOT NULL,
    CONSTRAINT PK_Sale PRIMARY KEY (idsale),
    FOREIGN KEY (iditem) REFERENCES item(iditem),
    FOREIGN KEY (idclient) REFERENCES client(idclient),
    FOREIGN KEY (idseller) REFERENCES seller(idseller)
)