package application;

import java.util.ArrayList;

public class ItemContainer {
	private String name;
	private double price;
	private int xCoordinate;
	private int yCoordinate;
	private int length;
	private int width;
	private int height;
	private boolean isParent;
	private String parentName;
	
	private ArrayList<Item> itemsCollection = new ArrayList<Item>();
	public ItemContainer(String name,int xCoordinate,int yCoordinate,int length, int width,int height, String parentName) {
		this.name = name;
		this.xCoordinate = xCoordinate;
		this.yCoordinate= yCoordinate;
		this.length = length;
		this.width = width;
		this.height = height;
		this.isParent = true;
		this.parentName = parentName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public ArrayList<Item> getItemsCollection() {
		return itemsCollection;
	}
	
	public void addItem(Item item) {
		itemsCollection.add(item);
	}
	
	public void setItemsCollection(ArrayList<Item> itemsCollection) {
		this.itemsCollection = itemsCollection;
	}
	public boolean isParent() {
		return isParent;
	}
	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}
	
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	@Override
	public String toString() {
		return this.name+","
				+this.price+","
				+this.xCoordinate+","
				+this.yCoordinate+","
				+this.length+","
				+this.width+","
				+this.height+","
				+this.parentName+","
				+"itemContainer";
		
	}

}
