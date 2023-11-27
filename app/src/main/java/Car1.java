/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
public class Car1 {
    private int weight;
    private String manufacturer;
    private String model;
    public Car1(int weight,String manufacturer, String model){
            this.weight = weight;
    this.manufacturer = manufacturer;
    this.model = model;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public static void main(String[] args) {
        Car1 car12 = new Car1(1500,"Mercedes","AMG");
        Car1 car2 = new Car1(1800,"Skoda","Fabia");
        Car1 car3 = new Car1(2000,"Tir","Jakiśtam");
        System.out.println("Waga samochodu1:" + car12.getWeight() + "Marka:" + car12.getManufacturer() + ", Model:" + car12.getModel());
                System.out.println("Waga samochodu1:" + car2.getWeight() + "Marka:" + car2.getManufacturer() + ", Model:" + car2.getModel());
                                System.out.println("Waga samochodu1:" + car3.getWeight() + "Marka:" + car3.getManufacturer() + ", Model:" + car3.getModel());


    }
}
