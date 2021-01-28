import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str = scan.nextLine();
        System.out.println("Enter how many times: ");
        int times = scan.nextInt();
        int i;
        for (i=0;i<times;i++) {
            System.out.print(str);
        }
    }
}
