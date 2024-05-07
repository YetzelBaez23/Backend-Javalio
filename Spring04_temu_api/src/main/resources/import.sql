INSERT INTO roles(name, description) VALUES ("customer", "cliente de la ecommerce");
INSERT INTO roles(name, description) VALUES ("admin", "administrador de la ecommerce");
INSERT INTO roles(name, description) VALUES ("Visitor", "Visitante de la ecommerce");

INSERT INTO users(first_name, last_name,birth_date, email, password, active, role_id) VALUES("Winnie","Pooh","1976-04-12","winnie@disney.com","ricamiel",1,2);
INSERT INTO users(first_name, last_name,birth_date, email, password, active, role_id) VALUES("Bob","Esponja","1996-04-12","bob@disney.com","cangreburger",1,2);
INSERT INTO users(first_name, last_name,birth_date, email, password, active, role_id) VALUES("Arenita","Mejilla","1996-04-12","arenita@disney.com","amotexas",0,2);

INSERT INTO images(url, alt) VALUES ( "/assets/img/Globos-PL.jpg", "Feria Internacional del Globo");
INSERT INTO images(url, alt) VALUES ( "/assets/img/Maruata-PL.jpeg", "Playa de Maruata");
INSERT INTO images(url, alt) VALUES ( "/assets/img/NevadoToluca-PL.JPG", "Paisaje del nevado de Toluca");
INSERT INTO images(url, alt) VALUES ( "/assets/img/Ncolima.PL.jpg", "Paisaje del nevado de Colima");
INSERT INTO images(url, alt) VALUES ( "/assets/img/Tepoztlan2-PL.jpg", "Paracaidismo en Tepoztlán");

INSERT INTO destinations (name, recurrence, description) VALUES ("Maruata", 1, "Playa situada en el municipio de Aquila, en el estado de Michoacán de Ocampo, México.");
INSERT INTO destinations (name, recurrence, description) VALUES ("Nevado de Colima", 2, "El Parque Nacional Volcán Nevado de Colima es un Área Natural Protegida federal, localizada en los límites de los estados de Jalisco y Colima.");
INSERT INTO destinations (name, recurrence, description) VALUES ("Nevado de Toluca", 1, "El Nevado de Toluca es un volcán mexicano ubicado en el estado de México, en el Valle de Toluca.");
INSERT INTO destinations (name, recurrence, description) VALUES ("Laguna de Santa Maria del Oro ", 1, "El lago cráter en la parte noroccidental de la faja volcánica trans-mexicana, en la localidad de Santa María del Oro, en el estado de Nayarit, México. ");
INSERT INTO destinations (name, recurrence, description) VALUES ("Tepoztlán", 2, "Tepoztlán es un pueblo mexicano al sur de la Ciudad de México. Es conocido por ser el lugar de nacimiento de Quetzalcóatl, el dios azteca. ");
INSERT INTO destinations (name, recurrence, description) VALUES ("Rioverde ", 1, "Rioverde es una ciudad del estado de San Luis Potosí, México.");
INSERT INTO destinations (name, recurrence, description) VALUES ("Iztaccíhuatl", 1, "El Iztaccíhuatl es un volcán inactivo, ubicado en el centro de México y es la tercera montaña más alta del país.​ Se localiza en los límites territoriales de los estados de México y Puebla.");
INSERT INTO destinations (name, recurrence, description) VALUES ("León, Guanajuato", 1, "León es una ciudad del estado de Guanajuato, en el centro de México. Es conocida por sus productos de cuero, que se venden en las tiendas de la Zona Piel.");

INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-05-03', '2024-05-05', 1600, '📍1ra Vips Revolución 11:30 pm', 15, 'Playa situada en el municipio de Aquila, en el estado de Michoacán de Ocampo, México. ¡Reserva ahora y prepárate para dos días de acampada llenos de sol, arena y momentos inolvidables!', 1,1);
INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-05-11', '2024-05-12', 1500, '📍1ra Vips Revolución 9:00 am', 20, 'El Parque Nacional Volcán Nevado de Colima es un Área Natural Protegida Federal, localizada en los límites de los estados de Jalisco y Colima. Únete a nosotros mientras conquistamos el amanecer en una ruta desafiante, la Ruta de la J, diseñada para aquellos que buscan un nuevo reto en un entorno espectacular, con una noche de acampada. ', 2,3);
INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-05-18', '2024-05-19', 2000, '📍1ra Vips Revolución 6:30 am', 15, 'El Nevado de Toluca, imponente volcán mexicano situado en el estado de México, en el pintoresco Valle de Toluca, aguarda para ser explorado al amanecer. Embárcate en una emocionante aventura y descubre su majestuosidad en un viaje inolvidable. ¿Quién se une a acampar una noche bajo el cielo estrellado? Ten en cuenta que el ascenso supone un desafío físico y lo realizas bajo tu propia responsabilidad. ¡Prepárate para vivir una experiencia única!', 3,2);
INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-06-01', '2024-06-02', 1100, '📍1ra Vips Revolución 7:00 am', 20, 'Únete a nuestra emocionante excursión a la Laguna de Santa María del Oro, el lago cráter del estado de Nayarit. Disfruta de un día de camping junto a la laguna con todos los servicios y actividades acuáticas como paddleboard y paseos en lancha, además, no te pierdas la visita a Amatitán.', 4,4);
INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-05-25', '2024-05-26', 5200, '📍1ra Vips Revolución 11:30 pm', 15, 'Tepoztlán es un pueblo mexicano al sur de la Ciudad de México. Es conocido por ser el lugar de nacimiento de Quetzalcóatl, y famoso por sus tepoznieves. Podrás disfrutar una noche en el Tubo-Hotel con alberca. ¡Atrévete a vivir tu sueño de lanzarte en paracaídas con nosotros!', 5,5);
INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-06-08', '2024-06-09', 1200, '📍1ra Vips Revolución 7:00 am', 15, 'Embárcate en una aventura inolvidable en Río Verde! Descubre la belleza natural y la emoción que este destino tiene para ofrecerte. Desde impresionantes paisajes hasta emocionantes actividades al aire libre, Río Verde lo tiene todo.', 1,6);
INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-06-15', '2024-06-16', 2300, '📍1ra Vips Revolución 11:30 pm', 18, '¡Descubre la majestuosidad de Iztaccíhuatl! Adéntrate en las alturas y contempla vistas impresionantes desde la cima de este emblemático volcán. Conquista sus picos nevados en una emocionante expedición de montañismo, explorando sus rutas escénicas y desafiando tus límites.', 3,7);
INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-11-16', '2024-11-17', 1000, '📍1ra Vips Revolución 5:30 am', 15, '¡No te pierdas el Festival Internacional del Globo en León, Guanajuato! Con más de 200 globos aerostáticos y conciertos espectaculares, es una experiencia imperdible.', 5,8);
INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-06-22', '2024-06-23', 5200, '📍1ra Vips Revolución 7:00 pm', 15, 'Tepoztlán es un pueblo mexicano al sur de la Ciudad de México. Es conocido por ser el lugar de nacimiento de Quetzalcóatl, y famoso por sus tepoznieves. Podrás disfrutar una noche en el Tubo-Hotel con alberca. ¡Atrévete a vivir tu sueño de lanzarte en paracaídas con nosotros! ', 2, 1);
INSERT INTO posts (active, departure_date, return_date, price, departure_site, spots, description, image_id, destination_id) VALUES(1,'2024-08-06', '2024-08-07', 1500, '📍1ra Vips Revolución 9:00 am', 18, 'El Parque Nacional Volcán Nevado de Colima es un Área Natural Protegida F, localizada en los límites de los estados de Jalisco y Colima. Únete a nosotros mientras conquistamos el amanecer en una ruta desafiante, la Ruta de la J, diseñada para aquellos que buscan un nuevo reto en un entorno espectacular, con una noche de acampada.', 1 , 5);