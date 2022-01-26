public class HomeWork {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\nЧисла кратные 2");
        for (i = 1; i<=100; i++) {
            if (i % 2 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\nЧисла кратные 4");
        i = 1;
        while (i<=100){
            if (i % 4 == 0)
            System.out.print(i + ", ");
            i++;
        }

    }



}
