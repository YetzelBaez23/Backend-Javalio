package com.nuevomundotravel.app.entity;

import java.sql.Date;

import jakarta.persistence.*;


public class Post {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 private Long id;  
	
	@Column(name = "departure_date", nullable = false)  
	private Date departureDate; 
	
	@Column(name = "return_date", nullable = false)  
	private Date returnDate; 
	
	@Column(name = "price", nullable = false)  
	private Double price; 
	
	@Column(name = "departure_site", length = 250, nullable = false)  
	private String departureSite; 
	
	@Column(name = "spots", nullable = false)  
	private Integer spots; 
	
	@Column(name = "description", length = 1200, nullable = false)  
	private String description; 
	
	@ManyToOne
	// @JoinColumn(name = "image_id")
	private Image image;
	
	@ManyToOne
	// @JoinColumn(name = "destination_id")
	private Destination destination;

	public Post() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDepartureSite() {
		return departureSite;
	}

	public void setDepartureSite(String departureSite) {
		this.departureSite = departureSite;
	}

	public Integer getSpots() {
		return spots;
	}

	public void setSpots(Integer spots) {
		this.spots = spots;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Post [id=");
		builder.append(id);
		builder.append(", departureDate=");
		builder.append(departureDate);
		builder.append(", returnDate=");
		builder.append(returnDate);
		builder.append(", price=");
		builder.append(price);
		builder.append(", departureSite=");
		builder.append(departureSite);
		builder.append(", spots=");
		builder.append(spots);
		builder.append(", description=");
		builder.append(description);
		builder.append(", image=");
		builder.append(image);
		builder.append(", destination=");
		builder.append(destination);
		builder.append("]");
		return builder.toString();
	}
		
}
