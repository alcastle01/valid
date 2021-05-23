DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
	id INT NOT NULL,
	primer_nombre varchar (30),
	segundo_nombre varchar (30),
	status boolean DEFAULT FALSE,
	inserted_at timestamp with time zone DEFAULT CURRENT_TIMESTAMP
);


