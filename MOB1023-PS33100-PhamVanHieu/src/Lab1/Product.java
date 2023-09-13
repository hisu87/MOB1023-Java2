/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author numpa
 */
public class Product {
	private String name;
	private double price;

	public Product() {
	}

	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}	
	
	public double getImportTax(){
		return 0.1* getPrice();
	}
	
	public void input(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Input name:");
		setName(sc.nextLine());
		System.out.println("Input price:");
		setPrice(sc.nextDouble());	
	}
	
	public void output(){
		System.out.println("=> Name:"+getName());
		System.out.println("=> Price:"+getPrice());
		System.out.println("=> Tax:"+getImportTax());
	}
	
}
