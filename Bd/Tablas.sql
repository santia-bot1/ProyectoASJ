create schema cajero;
use cajero;
CREATE TABLE productos(
	idproducto int(11) not null primary key,
    nombre varchar(100) not null,
    vunitario int(11) not null,
    iva int(11) not null
);
create table cajero(
	documento int(11) primary key not null,
    nombres varchar(40) not null,
    apellidos varchar(40) not null 
)

