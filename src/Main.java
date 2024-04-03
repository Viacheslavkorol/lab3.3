//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Використання оператора циклу for:");
            for (int i = 500; i <= 650; i += 10) {
                System.out.print(i + " ");
            }
            System.out.println("\n\nВикористання оператора циклу while:");
            int j = 500;
            while (j <= 650) {
                System.out.print(j + " ");
                j += 10;
            }
            System.out.println("\n\nВикористання оператора циклу do-while:");
            int k = 500;
            do {
                System.out.print(k + " ");
                k += 10;
            } while (k <= 650);


            int a = 2;
            while (2 * a - 1 < 5000) {
                int result = 2 * a - 1;
                System.out.print(result + " ");
                a++;


                int a1 = 10;

                System.out.println("Додатні дільники числа " + a1 + ":");

                for (int b = 1; b <= а1; b++) {
                    if (a1 % b == 0) {
                        System.out.println(b);

                    }
                }
            }
        }
    }
}
