package зачёт;

import java.io.FileReader;
import java.util.Scanner;

public class clwt2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n= inp.nextInt();
        double x[]=new double[n];
        for (int i=0;i<n;i++){
            System.out.println("Введите число");
            x[i]=inp.nextInt();
        }
        double y[]=new double[n];
        for (int i=0;i<n;i++) {

            if (x[i] < -3) {
                y[i] = ((1 + x[i] * x[i] * x[i]) / (2 * x[i])) * ((x[i] + 4) / (x[i] * x[i] - (1 / x[i])));
            } else if ((x[i] >= -3) & (x[i] < 2 * Math.PI)) {
                y[i] = (x[i] * x[i] - 3) * Math.sin(2 * x[i]);
            } else y[i] = (2 * (1 / 3));
        }
        enterXY(x,y);
    }


    public static void enterXY(double []x, double[] y) {
        boolean flag = false;
        double distance = 0;
        int k = 0;
        double t=0;
        for (int i = 0; i < x.length; i++) {
            if ((x[i]<=0 & x[i]>-10) & (y[i]<10 & y[i]>0) &((y[i]==x[i]-10) & (y[i]<Math.abs(x[i])))){
                flag=false;
            } else { if (t<x[i]) t=x[i];
            }
            if ((y[i] <= 10) && (-10 >= y[i]) & (x[i] >= -10) & (x[i] <= 10)) {
                if (x[i] > 0 && y[i] > 0) {
                    System.out.println(x[i] + " и " + y[i] + " Не входит");
                }
                System.out.println(x[i] + " и " + y[i] + " Точка входит в заштрихованную область");
                k++;
            } else {
                if (!flag) System.out.println(x[i] + " и " + y[i] + " Не входит");
            }
        }

        System.out.println("Количество точек, входящих в заштрихованную область: " + k);
        System.out.println("Самая отдаленная точка "+t);
    }
}
