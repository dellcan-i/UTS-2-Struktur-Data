import java.util.Scanner;

public class uts2 {
    public static int fbnc (int n) {
        if (n <= 1) return n;
        return fbnc (n - 1) + fbnc (n - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan deret fibonacci : ");
        int n = input.nextInt();
        System.out.println("Deret fibonacci : ");

        for (int i = 0; i < n; i++) {
            System.out.print(fbnc(i) + (i==n ? "" : ", " ));
        }
        input.close();
    }
}
