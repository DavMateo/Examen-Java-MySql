# Definiendo la creación y uso de la base de datos
DROP DATABASE IF EXISTS sgpzf;
CREATE DATABASE IF NOT EXISTS sgpzf;
USE sgpzf;



# Creando la tabla "gender"
CREATE TABLE IF NOT EXISTS gender(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    CONSTRAINT pk_id_gender PRIMARY KEY(id)
);

# Creando la tabla "country"
CREATE TABLE IF NOT EXISTS country(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    CONSTRAINT pk_id_country PRIMARY KEY(id)
);

# Creando la tabla "region"
CREATE TABLE IF NOT EXISTS region(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    idcountry INT UNSIGNED NOT NULL,
    CONSTRAINT pk_id_region PRIMARY KEY(id, idcountry),
    CONSTRAINT fk_idcountry_region FOREIGN KEY(idcountry) REFERENCES country(id)
);

# Creando la tabla "city"
CREATE TABLE IF NOT EXISTS city(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    idregion INT UNSIGNED NOT NULL,
    CONSTRAINT pk_id_city PRIMARY KEY(id, idregion),
    CONSTRAINT fk_idregion_city FOREIGN KEY(idregion) REFERENCES region(id)
);

# Creando la tabla "persons"
CREATE TABLE IF NOT EXISTS persons(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    idcity INT UNSIGNED NOT NULL,
    address VARCHAR(50) NOT NULL,
    age INT UNSIGNED NOT NULL,
    email VARCHAR(100) NOT NULL,
    idgender INT UNSIGNED NOT NULL,
    CONSTRAINT pk_persons PRIMARY KEY(id, idcity, idgender),
    CONSTRAINT fk_idcity_persons FOREIGN KEY(idcity) REFERENCES city(id),
    CONSTRAINT fk_idgender_persons FOREIGN KEY(idgender) REFERENCES gender(id)
);

# Creando la tabla "skill"
CREATE TABLE IF NOT EXISTS skill(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    CONSTRAINT pk_id_skill PRIMARY KEY(id)
);

# Creando la tabla "stack"
CREATE TABLE IF NOT EXISTS stack(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    CONSTRAINT pk_id_stack PRIMARY KEY(id)
);

# Creando la tabla "stack_skill"
CREATE TABLE IF NOT EXISTS stack_skill(
	idskill INT UNSIGNED NOT NULL,
    idstack INT UNSIGNED NOT NULL,
    idstatus INT UNSIGNED NOT NULL,
    CONSTRAINT pk_stack_skill PRIMARY KEY(idskill, idstack, idstatus),
    CONSTRAINT fk_idskill_stack_skill FOREIGN KEY(idskill) REFERENCES skill(id),
    CONSTRAINT fk_idstack_stack_skill FOREIGN KEY(idstack) REFERENCES stack(id)
);

# Creando la tabla "persons_skill"
CREATE TABLE IF NOT EXISTS persons_skill(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    registration_date DATE NOT NULL,
    idperson INT UNSIGNED NOT NULL,
    idskill INT UNSIGNED NOT NULL,
    CONSTRAINT pk_id_persons_skill PRIMARY KEY(id, idperson, idskill),
    CONSTRAINT fk_idperson_persons_skill FOREIGN KEY(idperson) REFERENCES persons(id),
    CONSTRAINT fk_idskill_persons_skill FOREIGN KEY(idskill) REFERENCES skill(id)
);