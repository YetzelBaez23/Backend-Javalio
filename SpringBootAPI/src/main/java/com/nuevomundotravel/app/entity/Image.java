package com.nuevomundotravel.app.entity;

import jakarta.persistence.*;

@Entity 
@Table (name = "images")

public class Image {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
 private Long id;  

@Column(name = "name", length = 50, nullable = false)  
private String name; 

@Column(name = "url", length = 300, nullable = false)
private String url;

@Column(name = "alt", length = 100, nullable = false)
private String alt;

public Image() {}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getAlt() {
	return alt;
}

public void setAlt(String alt) {
	this.alt = alt;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Image [id=");
	builder.append(id);
	builder.append(", name=");
	builder.append(name);
	builder.append(", url=");
	builder.append(url);
	builder.append(", alt=");
	builder.append(alt);
	builder.append("]");
	return builder.toString();
}

}