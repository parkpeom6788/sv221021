package org.kosta.myproject.model;

public class ItemVO {
	private int itemNo;
	private String name;
	private int price;
	public ItemVO() {
		super();
	}
	public ItemVO(int itemNo, String name, int price) {
		super();
		this.itemNo = itemNo;
		this.name = name;
		this.price = price;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ItemVO [itemNo=" + itemNo + ", name=" + name + ", price=" + price + "]";
	}
}
