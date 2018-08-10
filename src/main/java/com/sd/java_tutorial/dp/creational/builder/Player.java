/**
 * 
 */
package com.sd.java_tutorial.dp.creational.builder;

/**
 *  This class represents the player and has the characteristics of the player like name, gender, skin color, hair color, hair style etc.
 * @author Sapan.Desai
 *
 */
public class Player {
	
	
	public static class Builder{
		private String name;
		private String gender;
		private String skinColor;
		private String hairColor;
		private String hairStyle;
		
		public Builder() {
			
		}
		
		public Builder playerName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Builder skinColor(String skinColor) {
			this.skinColor = skinColor;
			return this;
		}
		
		public Builder hairColor(String hairColor) {
			this.hairColor = hairColor;
			return this;
		}
		
		public Builder hairStyle(String hairStyle) {
			this.hairStyle = hairStyle;
			return this;
		}
		
		public Player buildPlayer() {
			return new Player(this);
		}
	}
	
	private String name;
	private String gender;
	private String skinColor;
	private String hairColor;
	private String hairStyle;
	
	public Player(Builder builder) {
		this.name = builder.name;
		this.gender = builder.gender;
		this.skinColor = builder.skinColor;
		this.hairColor = builder.hairColor;
		this.hairStyle = builder.hairStyle;
	}
	/**
	 * @return the hairStyle
	 */
	public String getHairStyle() {
		return hairStyle;
	}
	/**
	 * @param hairStyle the hairStyle to set
	 */
	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @return the skinColor
	 */
	public String getSkinColor() {
		return skinColor;
	}
	/**
	 * @return the hairColor
	 */
	public String getHairColor() {
		return hairColor;
	}
	
	

}
