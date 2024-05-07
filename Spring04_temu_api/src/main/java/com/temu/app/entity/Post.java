package com.temu.app.entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="departure_date")
	private Date departureDate;
	@Column(name="return_date")
	private Date returnDate;
	@Column(nullable=false)
	private int price;
	@Column(name="departure_site")
	private String departureSite;
	private int spots;
	@Column(name="description", nullable = false, length=500 )
	private String description;
	@ManyToOne(optional = false)
	@JoinColumn(name = "image_id", nullable = false)
	private Image image; 
	@ManyToOne(optional = false)
	@JoinColumn(name = "destination_id", nullable = false)
	private Destination destination;
	@Column(name = "active")
	private String active;
	
	public Post() {
		
	}

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



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getDepartureSite() {
		return departureSite;
	}



	public void setDepartureSite(String departureSite) {
		this.departureSite = departureSite;
	}



	public int getSpots() {
		return spots;
	}



	public void setSpots(int spots) {
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
