/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fruitshop.Model;

/**
 *
 * @author tuanh
 */
import java.util.concurrent.atomic.AtomicInteger;
public class IdGenerator {
	private String prefix;
	private String suffix;
	private AtomicInteger lastId;
	public IdGenerator() {
		this.lastId = new AtomicInteger();
		this.prefix = "     ";
		this.suffix = "";
	}
	public void init(String prefix, String suffix, int lastId) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.lastId.set(lastId); 
	}
	public String generate() {
		return this.prefix + this.lastId.incrementAndGet() + this.suffix;
	}
}
