package зачёт;

import java.util.Comparator;
import java.util.Scanner;

public class Phone{
    private String model;
    private double price;
    private int memory;
    private String color;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void inputPhone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название модели");
        String model = scanner.nextLine();
        setModel(model);
        System.out.println("Введите цену ");
        double price = scanner.nextDouble();
        setPrice(price);
        System.out.println("Введите сколько памяти в телефоне ");
        int memory = scanner.nextInt();
        setMemory(memory);
        System.out.println("Введите цвет телефона ");
        String color = scanner.nextLine();
        setColor(color);
    }

    public void printPhone(){
        System.out.println(getModel());
        System.out.println(getPrice());
        System.out.println(getMemory());
        System.out.println(getColor());
    }

   // {
   //     Comparator<Phone> compareByPrice = new Comparator<Phone>() {
     //       @Override
       //     public double compare(Phone phone1, Phone phone2) {
         //       return phone1.getPrice() - phone1.getPrice();
           // }
       // }
    //}
    public double compareToByPrice(Phone phone1){
        return  this.getPrice() - phone1.getPrice();
    }

    public double compareToByColor(Phone phone1){
        return this.getColor().length() - phone1.getColor().length();
    }

    public void maxPhone(Phone[] arrayOfPhone){
        Phone mxPhone = new Phone();
        for (int i = 1; i  < arrayOfPhone.length; i++){
            if(arrayOfPhone[i].compareToByPrice(arrayOfPhone[i-1]) > 0){
                mxPhone = arrayOfPhone[i];
            }
        }
        mxPhone.printPhone();
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    Phone(){}

    public Phone(String model, double price, int memory, String color){
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.color = color;
    }



}
