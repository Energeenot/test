package зачёт;

import Lab8.Person;

import java.util.Scanner;

public class clwt {
    public static void main(String[] args) {
        System.out.println("Введите количество телефонов ");
        Scanner scanner = new Scanner(System.in);
        Phone[] arrayOfPhone = new Phone[scanner.nextInt()];
        for (int i = 0; i < arrayOfPhone.length; i++){
            System.out.println("Введите данные " + (i + 1) + "-ого человека");
            arrayOfPhone[i] = new Phone();
            arrayOfPhone[i].inputPhone();
            //arrayOfPhone[i].maxPhone(arrayOfPhone);
        }
        //Phone[] ph = {
          //      new Phone("Nokia3310", 3969.0, "white"),
            //    new Phone("PRo900", 10000.32, "red");
        //}

        System.out.println();
    }
}
