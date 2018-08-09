package org.ellie.wineclass.model;

public class Wine {
	
	public static enum WineType {
		
		Dry
		, HalfDry
		, Sweet
		, HalfSweet
	}
	
	public static enum WineColor {
		
		White
		, Red
	}

	private int mId;
	private String mName;
	private WineType mType;
	private short mYear;
	private WineColor mColor;
	
	public int getId() {
		return mId;
	}
	public void setId(int _id) {
		mId = _id;
	}
	public String getName() {
		return mName;
	}
	public void setName(String _name) {
		mName = _name;
	}
	public WineType getType() {
		return mType;
	}
	public void setType(WineType _type) {
		mType = _type;
	}
	public short getYear() {
		return mYear;
	}
	public void setYear(short _year) {
		mYear = _year;
	}
	public WineColor getColor() {
		return mColor;
	}
	public void setColor(WineColor _color) {
		mColor = _color;
	}
	
	@Override
	public String toString() {
		return String.format("Id: %d; name: %s; type: %s; color: %s; year: %d"
				, mId, mName, mType, mColor, mYear);
	}
}
