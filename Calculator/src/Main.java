import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int z = 2; z > 1;) {
            System.out.println("Введите первое число:");
            int FirstNumber = in.nextInt();
            System.out.println("Выберите действие:");
            System.out.println("1) + \n2) - \n3) *\n4) /");
            int Action = in.nextInt();
            if (Action > 4){
                System.out.println("Такого действия нет! \n");
                continue;
            }
            System.out.println("Введите второе число: ");
            int SecondNumber = in.nextInt();
            if (Action == 1) {
                System.out.print(FirstNumber + "+" + SecondNumber + "=");
                System.out.println(FirstNumber + SecondNumber + "\n");
            }
            else if (Action == 2) {
                System.out.print(FirstNumber + "-" + SecondNumber + "=");
                System.out.println(FirstNumber - SecondNumber + "\n");
            }
            else if (Action == 3) {
                System.out.print(FirstNumber + "*" + SecondNumber + "=");
                System.out.println(FirstNumber * SecondNumber + "\n");
            }
            else if (Action == 4) {
                System.out.print(FirstNumber + "/" + SecondNumber + "=");
                System.out.println(FirstNumber / SecondNumber + "\n");
            }





        }

    }
}


