-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema NuevoMundoTravel
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema NuevoMundoTravel
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `NuevoMundoTravel` DEFAULT CHARACTER SET utf8 ;
USE `NuevoMundoTravel` ;

-- -----------------------------------------------------
-- Table `NuevoMundoTravel`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NuevoMundoTravel`.`roles` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL,
  `description` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NuevoMundoTravel`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NuevoMundoTravel`.`users` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `full_name` VARCHAR(70) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `telephone` VARCHAR(20) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `role_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`, `role_id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) ,
  INDEX `fk_users_roles_idx` (`role_id` ASC) ,
  CONSTRAINT `fk_users_roles`
    FOREIGN KEY (`role_id`)
    REFERENCES `NuevoMundoTravel`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NuevoMundoTravel`.`destinations`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NuevoMundoTravel`.`destinations` (
  `id` BIGINT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `recurrence` INT ZEROFILL NOT NULL,
  `description` VARCHAR(200) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NuevoMundoTravel`.`images`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NuevoMundoTravel`.`images` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `url` VARCHAR(300) NOT NULL,
  `alt` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NuevoMundoTravel`.`posts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NuevoMundoTravel`.`posts` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `departure_date` DATE NOT NULL,
  `return_date` DATE NOT NULL,
  `price` DECIMAL(7,2) NOT NULL,
  `departure_site` VARCHAR(250) NOT NULL,
  `spots` INT NOT NULL,
  `description` VARCHAR(1200) NOT NULL,
  `image_id` BIGINT NOT NULL,
  `destination_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`, `image_id`, `destination_id`),
  INDEX `fk_posts_images1_idx` (`image_id` ASC) ,
  INDEX `fk_posts_destinations1_idx` (`destination_id` ASC) ,
  CONSTRAINT `fk_posts_images1`
    FOREIGN KEY (`image_id`)
    REFERENCES `NuevoMundoTravel`.`images` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_posts_destinations1`
    FOREIGN KEY (`destination_id`)
    REFERENCES `NuevoMundoTravel`.`destinations` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NuevoMundoTravel`.`purchases`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NuevoMundoTravel`.`purchases` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `date` TIMESTAMP NOT NULL,
  `total` DECIMAL(10,2) NOT NULL,
  `user_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`, `user_id`),
  INDEX `fk_purchases_users1_idx` (`user_id` ASC) ,
  CONSTRAINT `fk_purchases_users1`
    FOREIGN KEY (`user_id`)
    REFERENCES `NuevoMundoTravel`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NuevoMundoTravel`.`purchases_has_posts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NuevoMundoTravel`.`purchases_has_posts` (
  `purchase_id` BIGINT NOT NULL,
  `post_id` BIGINT NOT NULL,
  `reservations` INT NOT NULL,
  PRIMARY KEY (`purchase_id`, `post_id`),
  INDEX `fk_purchases_has_posts_posts1_idx` (`post_id` ASC) ,
  INDEX `fk_purchases_has_posts_purchases1_idx` (`purchase_id` ASC) ,
  CONSTRAINT `fk_purchases_has_posts_purchases1`
    FOREIGN KEY (`purchase_id`)
    REFERENCES `NuevoMundoTravel`.`purchases` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_purchases_has_posts_posts1`
    FOREIGN KEY (`post_id`)
    REFERENCES `NuevoMundoTravel`.`posts` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



 

