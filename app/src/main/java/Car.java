import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
public  class Car {
    private int weight;
    private String manufacturer;
    private String model;
    
    public Car(int weight,String manufacturer, String model)
    {
            this.weight = weight;
    this.manufacturer = manufacturer;
    this.model = model;
    }
    public int getWeight()
    {
        return weight;
    }
    public void setWeight(int weight)
    {
    this.weight = weight;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public void setManufacturer (String manufacturer)
    {
    this.manufacturer = manufacturer;
    }
    public String getModel()
    {
    return model;
    }
    public void setModel(String model)
    {
    this.model = model;
    }


public static void main(String[] args) {

Car Car1 = new Car(1300, "Mercedes",  "AMG");
Car Car2 = new Car(2500,"BMW","E30");
Car Car3 = new Car(1200,"Skoda","Fabia");
System.out.println(Car1);
System.out.println(Car2);
System.out.println(Car3);
}
public void print() {
        System.out.println("Marka: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Waga: " + weight + " kg");
        System.out.println();
    }
public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
Scanner scanner = new Scanner(System.in);
{
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj wagę samochodu:");
String input = scanner.nextLine();
Integer weight = Integer.parseInt(input);
System.out.println("Waga auta to:" + weight);
}


}