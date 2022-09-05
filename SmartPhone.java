package зачёт;

import java.util.Scanner;

public class SmartPhone extends Phone {
    private String internet;
    public void goToInternet(){
        System.out.println("Заходим в интернет .....");
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setMemory(int memory) {
        super.setMemory(memory);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public int getMemory() {
        return super.getMemory();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    public String getInternet() {
        return internet;
    }

    @Override
    public void inputPhone() {
        Scanner scanner = new Scanner(System.in);
        super.inputPhone();
        System.out.println("Есть ли доступ к интернету");
        internet = scanner.nextLine();
        setInternet(internet);

    }

    @Override
    public void printPhone() {
        super.printPhone();
    }
}
