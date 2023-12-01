package application;

public class Item {
	private String name;
	private int xCoordinate;
	private int yCoordinate;
	private int length;
	private int width;
	private int height;
	
	public Item(String name,int xCoordinate,int yCoordinate,int length, int width,int height,double marketVal,String parentName) {
		this.name = name;
		this.xCoordinate = xCoordinate;
		this.yCoordinate= yCoordinate;
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	

}
