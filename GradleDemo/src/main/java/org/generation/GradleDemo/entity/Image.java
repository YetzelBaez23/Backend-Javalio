package org.generation.GradleDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "images")
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "url", nullable = false, length = 300)
	private String url;
	@Column(name = "alt", nullable = false, length = 500)
	private String alt;
	
	public Image() {
		
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
		builder.append("Image [name=");
		builder.append(", url=");
		builder.append(url);
		builder.append(", alt=");
		builder.append(alt);
		builder.append("]");
		return builder.toString();
	}
	

}
