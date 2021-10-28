/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.CayThuaKeAnimal;

public class Animal {
    protected String picture;
    protected int age;
    protected String food;
    protected int hunger;
    protected float boundaries;
    protected String sound; 
    private String name;
    protected void eat(){
        System.out.println("Ăn thức ăn : "+ food);
    }
    protected void roam(){
        System.out.println("===đi bộ===");
    }
    protected void makeNoise(){
        System.out.println("tiếng động vật kêu !!!");
    }
    protected void findFood(){
        System.out.println("đi tìm thức ăn :v");
    }
    protected void Sleep(){
        System.out.println("zzzZZZZzzzzzzzzzz");
    }
    public Animal(){
        System.out.println("create a animal");
    }
    public Animal(String n) {
        name = n;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
