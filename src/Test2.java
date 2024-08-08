import java.util.Scanner;

public class Test2{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое слово или предложение");
        String st1 = sc.nextLine();
        System.out.println("Введите второе слово или предложение");
        String st2 = sc.nextLine();
        if(st1.equals(st2)){
            System.out.println("Строки идентичны");
        }
        else
            System.out.println("Строки неидентичны");
    }

}