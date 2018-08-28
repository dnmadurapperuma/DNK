package com.dnk.spring.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class Add implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;
	
	private String id;
	private String title;
	private String discription;
	private String type;
	private String mainImage;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	private Date createdDate;
	private Map< Attributes,Integer> numericalAttributes=new HashMap<Attributes, Integer>();
	
	private Map< Attributes,String> stringAttributes=new HashMap<Attributes, String>();
	
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDiscription() {
		return discription;
	}
	public String getType() {
		return type;
	}
	public String getMainImage() {
		return mainImage;
	}
	public String getImage1() {
		return image1;
	}
	public String getImage2() {
		return image2;
	}
	public String getImage3() {
		return image3;
	}
	public String getImage4() {
		return image4;
	}
	public String getImage5() {
		return image5;
	}
	public Map<Attributes, Integer> getNumericalAttributes() {
		return numericalAttributes;
	}
	public Map<Attributes, String> getStringAttributes() {
		return stringAttributes;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	public void setImage5(String image5) {
		this.image5 = image5;
	}
	public void setNumericalAttributes(Map<Attributes, Integer> numericalAttributes) {
		this.numericalAttributes = numericalAttributes;
	}
	public void setStringAttributes(Map<Attributes, String> stringAttributes) {
		this.stringAttributes = stringAttributes;
	}
	@JsonSerialize(using=DateSerializer.class)
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
