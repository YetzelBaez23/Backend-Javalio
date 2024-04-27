
-- -----------------------------------------------------
-- Data for table `NuevoMundoTravel`.`roles`
-- -----------------------------------------------------
START TRANSACTION;
USE `NuevoMundoTravel`;
INSERT INTO `NuevoMundoTravel`.`roles` (`id`, `name`, `description`) VALUES (1, 'admin', 'Administrador de la página.');
INSERT INTO `NuevoMundoTravel`.`roles` (`id`, `name`, `description`) VALUES (2, 'client', 'Cliente que compra viajes.');
INSERT INTO `NuevoMundoTravel`.`roles` (`id`, `name`, `description`) VALUES (3, 'visitor', 'Visitante de la página.');

COMMIT;


-- -----------------------------------------------------
-- Data for table `NuevoMundoTravel`.`users`
-- -----------------------------------------------------
START TRANSACTION;
USE `NuevoMundoTravel`;
INSERT INTO `NuevoMundoTravel`.`users` (`id`, `full_name`, `email`, `telephone`, `password`, `role_id`) VALUES (1, 'Ariana Colmenares', 'arianacolmenaresrubio@gmail.com', '3221749411', 'generation2024', 1);
INSERT INTO `NuevoMundoTravel`.`users` (`id`, `full_name`, `email`, `telephone`, `password`, `role_id`) VALUES (2, 'Eric Elizondo ', 'eric.elizondo.vega@gmail.com', '0123456789', 'generation2024', 1);
INSERT INTO `NuevoMundoTravel`.`users` (`id`, `full_name`, `email`, `telephone`, `password`, `role_id`) VALUES (3, 'Miguel Gonzalez', 'Miguel_a.GM@hotmail.com', '0987654321', 'generation2024', 1);
INSERT INTO `NuevoMundoTravel`.`users` (`id`, `full_name`, `email`, `telephone`, `password`, `role_id`) VALUES (4, 'Jesús Lopez ', 'jlmwsk32@gmail.com', '8745333955', 'generation2024', 1);
INSERT INTO `NuevoMundoTravel`.`users` (`id`, `full_name`, `email`, `telephone`, `password`, `role_id`) VALUES (5, 'Penelope Alejandre', 'penelopealejandrelopez@gmail.com', '7646644300', 'generation2024', 1);
INSERT INTO `NuevoMundoTravel`.`users` (`id`, `full_name`, `email`, `telephone`, `password`, `role_id`) VALUES (6, 'Ulises Ortega', 'uliortegao@gmail.com', '3355863121', 'generation2024', 1);
INSERT INTO `NuevoMundoTravel`.`users` (`id`, `full_name`, `email`, `telephone`, `password`, `role_id`) VALUES (7, 'Jetzel Baez ', 'nuevomundotravell@gmail.com', '8778857448', 'generation2024', 1);
INSERT INTO `NuevoMundoTravel`.`users` (`id`, `full_name`, `email`, `telephone`, `password`, `role_id`) VALUES (8, 'Daniel Ezequiel ', 'ezquivel.regresa@gmail.com', '3314378041', 'exgeneration2024', 2);

COMMIT;



-- -----------------------------------------------------
-- Data for table `NuevoMundoTravel`.`destinations`
-- -----------------------------------------------------
START TRANSACTION;
USE `NuevoMundoTravel`;
INSERT INTO `NuevoMundoTravel`.`destinations` (`id`, `name`, `recurrence`, `description`) VALUES (1, 'Maruata', 1, 'Playa situada en el municipio de Aquila, en el estado de Michoacán de Ocampo, México.');
INSERT INTO `NuevoMundoTravel`.`destinations` (`id`, `name`, `recurrence`, `description`) VALUES (2, 'Nevado de Colima', 2, 'El Parque Nacional Volcán Nevado de Colima es un Área Natural Protegida federal, localizada en los límites de los estados de Jalisco y Colima.');
INSERT INTO `NuevoMundoTravel`.`destinations` (`id`, `name`, `recurrence`, `description`) VALUES (3, 'Nevado de Toluca', 1, 'El Nevado de Toluca es un volcán mexicano ubicado en el estado de México, en el Valle de Toluca.');
INSERT INTO `NuevoMundoTravel`.`destinations` (`id`, `name`, `recurrence`, `description`) VALUES (4, 'Laguna de Santa Maria del Oro ', 1, 'El lago cráter en la parte noroccidental de la faja volcánica trans-mexicana, en la localidad de Santa María del Oro, en el estado de Nayarit, México. ');
INSERT INTO `NuevoMundoTravel`.`destinations` (`id`, `name`, `recurrence`, `description`) VALUES (5, 'Tepoztlán', 2, 'Tepoztlán es un pueblo mexicano al sur de la Ciudad de México. Es conocido por ser el lugar de nacimiento de Quetzalcóatl, el dios azteca. ');
INSERT INTO `NuevoMundoTravel`.`destinations` (`id`, `name`, `recurrence`, `description`) VALUES (6, 'Rioverde ', 1, 'Rioverde es una ciudad del estado de San Luis Potosí, México.');
INSERT INTO `NuevoMundoTravel`.`destinations` (`id`, `name`, `recurrence`, `description`) VALUES (7, 'Iztaccíhuatl', 1, 'El Iztaccíhuatl es un volcán inactivo, ubicado en el centro de México y es la tercera montaña más alta del país.​ Se localiza en los límites territoriales de los estados de México y Puebla.');
INSERT INTO `NuevoMundoTravel`.`destinations` (`id`, `name`, `recurrence`, `description`) VALUES (8, 'León, Guanajuato', 1, 'León es una ciudad del estado de Guanajuato, en el centro de México. Es conocida por sus productos de cuero, que se venden en las tiendas de la Zona Piel.');

COMMIT;

SELECT * from images;
-- -----------------------------------------------------
-- Data for table `NuevoMundoTravel`.`images`
-- -----------------------------------------------------
START TRANSACTION;
USE `NuevoMundoTravel`;
INSERT INTO `NuevoMundoTravel`.`images` (`id`, `name`, `url`, `alt`) VALUES (1, 'FIG 1', 'https://ibb.co/D5nXsNq', 'Feria Internacional del Globo en Guanajuato ');
INSERT INTO `NuevoMundoTravel`.`images` (`id`, `name`, `url`, `alt`) VALUES (2, 'Maruata 1', 'https://ibb.co/zNx79ZT', 'Playa de Maruata');
INSERT INTO `NuevoMundoTravel`.`images` (`id`, `name`, `url`, `alt`) VALUES (3, 'Nevado de Toluca 1', 'https://ibb.co/crnpbLf', 'Paisaje del nevado de Toluca');
INSERT INTO `NuevoMundoTravel`.`images` (`id`, `name`, `url`, `alt`) VALUES (4, 'Nevado de Colima 1', 'https://ibb.co/8cqrnLw', 'Paisaje del nevado de Colima');
INSERT INTO `NuevoMundoTravel`.`images` (`id`, `name`, `url`, `alt`) VALUES (5, 'Tepoztlán 1', 'https://ibb.co/Jshk5Rr', 'Paracaidismo en Tepoztlán');

COMMIT;


-- -----------------------------------------------------
-- Data for table `NuevoMundoTravel`.`posts`
-- -----------------------------------------------------
START TRANSACTION;
USE `NuevoMundoTravel`;
INSERT INTO `NuevoMundoTravel`.`posts` (`id`, `departure_date`, `return_date`, `price`, `departure_site`, `spots`, `description`, `image_id`, `destination_id`) VALUES (1, '2024-11-15', '2024-11-18',130, ' Parque Rojo, Burger King Central Nueva, Guadalajara', 40, '¡Despega con nosotros en el Festival Internacional del Globo en León 2024! Prepárate para elevar tus emociones del 15 al 18 de noviembre. Disfruta de un viaje cómodo en una sprinter de lujo, deliciosos Box Lunches, seguro de viajero, y la atención de un coordinador de grupo. Reserva con solo $500 por persona y únete a la emoción del FIG 2024.', 1, 8);
INSERT INTO `NuevoMundoTravel`.`posts` (`id`, `departure_date`, `return_date`, `price`, `departure_site`, `spots`, `description`, `image_id`, `destination_id`) VALUES (2, '2024-05-11', '2024-05-12',150, '1ra Vips Revolución, 2da Parque Rojo, 3ra Hotel Fiesta Americana, Guadalajara', 30, '¡Vive el amanecer en el Nevado de Toluca! Descubre su majestuosidad en un viaje lleno de aventura. Acamparemos una noche del 18-19 de mayo, partiendo a la 1 pm desde tres puntos de salida: Vips Revolución, Parque Rojo y Hotel Fiesta Americana. Disfruta del transporte redondo, Box Lunch, guías experimentados, snack energético, fogata nocturna, fotografías y medidas de seguridad. El precio regular es $1500 por persona, ¡pero hay un precio especial de $1400 para grupos de +4 personas!', 3, 3);
INSERT INTO `NuevoMundoTravel`.`posts` (`id`, `departure_date`, `return_date`, `price`, `departure_site`, `spots`, `description`, `image_id`, `destination_id`) VALUES (3, '2024-05-25', '2024-05-26',520 , ' Parque Rojo, Burger King Central Nueva, Guadalajara', 40, '¡Atrévete a vivir tu sueño con nosotros este 2024! Salimos el viernes 24 de mayo para dos días llenos de emoción. Incluye lanzamiento en paracaídas desde 13,000 ft, hospedaje en Tubo-Hotel con alberca, transporte redondo en sprinter de lujo, Box Lunch, seguro de viajero, coordinador de grupo, desayuno americano y visita a las famosas TEPOZNIEVES. ¡Reserva hoy mismo desde $1,500 por persona y únete a la aventura!', 5, 5);
INSERT INTO `NuevoMundoTravel`.`posts` (`id`, `departure_date`, `return_date`, `price`, `departure_site`, `spots`, `description`, `image_id`, `destination_id`) VALUES (4, '2024-06-08', '2024-06-09',150, '1ra Vips Revolución, 2da Parque Rojo, 3ra Hotel Fiesta Americana, Guadalajara', 30, 'Descubre la majestuosidad del Nevado de Colima con una altitud de aproximadamente 4,330 metros sobre el nivel del mar. Acamparemos una noche el sábado 2 y domingo 3 de marzo, saliendo a la 1 pm desde tres puntos de salida. Incluye transporte redondo, Box Lunch, guías, snack, fogata, fotografías y seguridad. Precio regular $1500 por persona, especial de $1400 para grupos de +4. El ascenso es un desafío físico, hazlo bajo tu propio riesgo.', 4, 2);
INSERT INTO `NuevoMundoTravel`.`posts` (`id`, `departure_date`, `return_date`, `price`, `departure_site`, `spots`, `description`, `image_id`, `destination_id`) VALUES (5, '2024-06-15', '2024-06-16',160, ' Parque Rojo, Burger King Central Nueva, Guadalajara', 30, '¡Acompáñanos a las costas de Michoacán del 16 al 18 de marzo! Acamparemos dos noches y visitaremos varios lugares como playa Colola, el faro Bulerías, playa Palma Sola y Maruata. Salida el viernes 15 de marzo desde tres puntos. Incluye transporte en autobús de lujo, Box Lunch, barra libre, transporte a las playas, liberación de tortugas, fotografías y seguro de viajero. Precio regular $1600 por persona, pero hay un precio especial de $1500 para grupos de +5 personas. ¡No te lo pierdas!', 2, 1);

COMMIT;

SELECT * from posts;


-- -----------------------------------------------------
-- Data for table `NuevoMundoTravel`.`purchases`
-- -----------------------------------------------------
START TRANSACTION;
USE `NuevoMundoTravel`;
INSERT INTO `NuevoMundoTravel`.`purchases` (`id`, `date`, `total`, `user_id`) VALUES (1, '2024-04-22 18:30:56', 2600, 8);
INSERT INTO `NuevoMundoTravel`.`purchases` (`id`, `date`, `total`, `user_id`) VALUES (2, '2024-04-22 20:30:43', 1500, 8);
INSERT INTO `NuevoMundoTravel`.`purchases` (`id`, `date`, `total`, `user_id`) VALUES (3, '2024-04-22 20:40:11', 5200, 8);
INSERT INTO `NuevoMundoTravel`.`purchases` (`id`, `date`, `total`, `user_id`) VALUES (4, '2024-04-23 10:34:54', 3000, 8);
INSERT INTO `NuevoMundoTravel`.`purchases` (`id`, `date`, `total`, `user_id`) VALUES (5, '2024-04-23 12:01:23', 1600, 8);

COMMIT;


-- -----------------------------------------------------
-- Data for table `NuevoMundoTravel`.`purchases_has_posts`
-- -----------------------------------------------------
START TRANSACTION;
USE `NuevoMundoTravel`;
INSERT INTO `NuevoMundoTravel`.`purchases_has_posts` (`purchase_id`, `post_id`, `reservations`) VALUES (1, 1, 2);
INSERT INTO `NuevoMundoTravel`.`purchases_has_posts` (`purchase_id`, `post_id`, `reservations`) VALUES (2, 2, 1);
INSERT INTO `NuevoMundoTravel`.`purchases_has_posts` (`purchase_id`, `post_id`, `reservations`) VALUES (3, 3, 1);
INSERT INTO `NuevoMundoTravel`.`purchases_has_posts` (`purchase_id`, `post_id`, `reservations`) VALUES (4, 4, 2);
INSERT INTO `NuevoMundoTravel`.`purchases_has_posts` (`purchase_id`, `post_id`, `reservations`) VALUES (5, 5, 1);

COMMIT;