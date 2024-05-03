INSERT INTO roles(name, description) VALUES("Visitor","visitante de la ecommerce");
INSERT INTO roles(name, description) VALUES("customer","Cliente de la ecommerce");
INSERT INTO roles(name, description) VALUES("admin","Administrador de la ecommerce");
--Quitar usuarios en el futuro (modificar la creación de tabla con atributo active)
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES("Winnie Pooh","666666666","winnie@disney.com","ricamiel",1, 2);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES("Bob Esponja","1111111116","bob@nickelodeon.com","cangreburguer",1, 1);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES("Arenita Mejillas","101010108","arenita@nickelodeon.com","amotexas",0, 1);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES("Ariana Colmenares","1234567891","arianacolmenaresrubio@gmail.com" ,"generation2024",1, 1);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES("Eric Elizondo ","0123456789","eric.elizondo.vega@gmail.com","generation2024",1, 2);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES("Miguel Gonzalez","0987654321","Miguel_a.GM@hotmail.com","generation2024",1, 2);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES("Jesús Lopez","8745333955","jlmwsk32@gmail.com","generation2024",1, 2);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES ("Penelope Alejandre ","7646644300 ",  "penelopealejandrelopez@gmail.com ",    "generation2024 ", 1,2);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES ("Ulises Ortega",  "3355863121 ","uliortegao@gmail.com ",    "generation2024 ", 1,2);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES ("Jetzel Baez ",   "8778857448 ", "nuevomundotravell@gmail.com ", "generation2024 ", 1,2);
INSERT INTO users(full_name, telephone, email, password, active, role_id ) VALUES ("Daniel Ezequiel", "3314378041 ", "ezquivel.regresa@gmail.com ", "exgeneration2024 ", 1,2);

--Quitar usuarios en el futuro (modificar la creación de tabla con atributo active)
INSERT INTO images(url, alt) VALUES ( "https://ibb.co/D5nXsNq", "Feria Internacional del Globo en Guanajuato");
INSERT INTO images(url, alt) VALUES ( "https://ibb.co/zNx79ZT", "Playa de Maruata");
INSERT INTO images(url, alt) VALUES ( "https://ibb.co/crnpbLf", "Paisaje del nevado de Toluca");
INSERT INTO images(url, alt) VALUES ( "https://ibb.co/8cqrnLw", "Paisaje del nevado de Colima");
INSERT INTO images(url, alt) VALUES ( "https://ibb.co/Jshk5Rr", "Paracaidismo en Tepoztlán");


INSERT INTO destinations (name, recurrence, description) VALUES ("Maruata", 1, "Playa situada en el municipio de Aquila, en el estado de Michoacán de Ocampo, México.");
INSERT INTO destinations (name, recurrence, description) VALUES ("Nevado de Colima", 2, "El Parque Nacional Volcán Nevado de Colima es un Área Natural Protegida federal, localizada en los límites de los estados de Jalisco y Colima.");
INSERT INTO destinations (name, recurrence, description) VALUES ("Nevado de Toluca", 1, "El Nevado de Toluca es un volcán mexicano ubicado en el estado de México, en el Valle de Toluca.");
INSERT INTO destinations (name, recurrence, description) VALUES ("Laguna de Santa Maria del Oro ", 1, "El lago cráter en la parte noroccidental de la faja volcánica trans-mexicana, en la localidad de Santa María del Oro, en el estado de Nayarit, México. ");
INSERT INTO destinations (name, recurrence, description) VALUES ("Tepoztlán", 2, "Tepoztlán es un pueblo mexicano al sur de la Ciudad de México. Es conocido por ser el lugar de nacimiento de Quetzalcóatl, el dios azteca. ");
INSERT INTO destinations (name, recurrence, description) VALUES ("Rioverde ", 1, "Rioverde es una ciudad del estado de San Luis Potosí, México.");
INSERT INTO destinations (name, recurrence, description) VALUES ("Iztaccíhuatl", 1, "El Iztaccíhuatl es un volcán inactivo, ubicado en el centro de México y es la tercera montaña más alta del país.​ Se localiza en los límites territoriales de los estados de México y Puebla.");
INSERT INTO destinations (name, recurrence, description) VALUES ("León, Guanajuato", 1, "León es una ciudad del estado de Guanajuato, en el centro de México. Es conocida por sus productos de cuero, que se venden en las tiendas de la Zona Piel.");

INSERT INTO posts(departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES ("2024-11-15", "2024-11-18",130, " Parque Rojo, Burger King Central Nueva, Guadalajara", 40, "¡Despega con nosotros en el Festival Internacional del Globo en León 2024! Prepárate para elevar tus emociones del 15 al 18 de noviembre. Disfruta de un viaje cómodo en una sprinter de lujo, deliciosos Box Lunches, seguro de viajero, y la atención de un coordinador de grupo. Reserva con solo $500 por persona y únete a la emoción del FIG 2024.", 1, 8);
INSERT INTO posts(departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES ("2024-05-11", "2024-05-12",150, "1ra Vips Revolución, 2da Parque Rojo, 3ra Hotel Fiesta Americana, Guadalajara", 30, "¡Vive el amanecer en el Nevado de Toluca! Descubre su majestuosidad en un viaje lleno de aventura. Acamparemos una noche del 18-19 de mayo, partiendo a la 1 pm desde tres puntos de salida: Vips Revolución, Parque Rojo y Hotel Fiesta Americana. Disfruta del transporte redondo, Box Lunch, guías experimentados, snack energético, fogata nocturna, fotografías y medidas de seguridad. El precio regular es $1500 por persona, ¡pero hay un precio especial de $1400 para grupos de +4 personas!", 3, 3);
INSERT INTO posts(departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES ("2024-05-25", "2024-05-26",520 , " Parque Rojo, Burger King Central Nueva, Guadalajara", 40, "¡Atrévete a vivir tu sueño con nosotros este 2024! Salimos el viernes 24 de mayo para dos días llenos de emoción. Incluye lanzamiento en paracaídas desde 13,000 ft, hospedaje en Tubo-Hotel con alberca, transporte redondo en sprinter de lujo, Box Lunch, seguro de viajero, coordinador de grupo, desayuno americano y visita a las famosas TEPOZNIEVES. ¡Reserva hoy mismo desde $1,500 por persona y únete a la aventura!", 5, 5);
INSERT INTO posts(departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES ("2024-06-08", "2024-06-09",150, "1ra Vips Revolución, 2da Parque Rojo, 3ra Hotel Fiesta Americana, Guadalajara", 30, "Descubre la majestuosidad del Nevado de Colima con una altitud de aproximadamente 4,330 metros sobre el nivel del mar. Acamparemos una noche el sábado 2 y domingo 3 de marzo, saliendo a la 1 pm desde tres puntos de salida. Incluye transporte redondo, Box Lunch, guías, snack, fogata, fotografías y seguridad. Precio regular $1500 por persona, especial de $1400 para grupos de +4. El ascenso es un desafío físico, hazlo bajo tu propio riesgo.", 4, 2);
INSERT INTO posts(departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES ("2024-06-15", "2024-06-16",160, " Parque Rojo, Burger King Central Nueva, Guadalajara", 30, "¡Acompáñanos a las costas de Michoacán del 16 al 18 de marzo! Acamparemos dos noches y visitaremos varios lugares como playa Colola, el faro Bulerías, playa Palma Sola y Maruata. Salida el viernes 15 de marzo desde tres puntos. Incluye transporte en autobús de lujo, Box Lunch, barra libre, transporte a las playas, liberación de tortugas, fotografías y seguro de viajero. Precio regular $1600 por persona, pero hay un precio especial de $1500 para grupos de +5 personas. ¡No te lo pierdas!", 2, 1);

INSERT INTO purchases ( "date", "total", "user_id") VALUES ('2024-04-22 18:30:56', 2600, 8);
INSERT INTO purchases ( "date", "total", "user_id") VALUES ('2024-04-22 20:30:43', 1500, 8);
INSERT INTO purchases ( "date", "total", "user_id") VALUES ('2024-04-22 20:40:11', 5200, 8);
INSERT INTO purchases ( "date", "total", "user_id") VALUES ('2024-04-23 10:34:54', 3000, 8);
INSERT INTO purchases ( "date", "total", "user_id") VALUES ('2024-04-23 12:01:23', 1600, 8);

