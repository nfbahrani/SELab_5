import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the input 'n' and get 2^n and fib(n):");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        BigInteger ans_power = two_power(inp);
        BigInteger ans_fib = fib(inp);
        System.out.println("2^n = " + ans_power);
        System.out.println("fib(" + inp + ") = " + ans_fib);
    }

    private static BigInteger fib(int n) {
        if (n <= 1)
            return BigInteger.valueOf(n);
        return fib(n - 1).add(fib(n - 2));
    }

    private static BigInteger two_power(int n) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            ans = ans.multiply(BigInteger.TWO);
        }
        return ans;
    }

    private static BigInteger dp_fib(int n) {
        BigInteger f[] = new BigInteger[n + 2];
        f[0] = BigInteger.ZERO;
        f[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1].add(f[i - 2]);
        }
        return f[n];
    }
}

