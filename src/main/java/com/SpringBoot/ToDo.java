package com.SpringBoot;

public class ToDo {
	 
    private String name;
    private String author;
 
    public ToDo() {
 
    }
 
    public ToDo(String name, String author) {
        this.name = name;
        this.author = author;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getLastName() {
        return author;
    }
 
    public void setLastName(String lastName) {
        this.author = author;
    }
 
}