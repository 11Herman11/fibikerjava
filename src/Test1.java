import java.util.Scanner;

public class Test1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1 + " > " + num2);
        }else if(num1<num2){
            System.out.println(num1 + " < " + num2);
        }else {
            System.out.println(num1 + " = " + num2);
        }
        System.out.println("Результат сложения: " + (num1+num2));
        System.out.println("Результат вычитания: " + (num1-num2));
        System.out.println("Результат умножения: " + (num1*num2));
        if(num2==0){
            System.out.println("На ноль делить нельзя! Введите другое число");
        } else {
            System.out.println("Результат деления: " + ((double) num1 / (double) num2));
        }
    }


}