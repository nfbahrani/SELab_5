import java.util.Scanner;

public class ComputeFibAndPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        long ans1 = two_power(inp);
        long ans2 = fib(inp);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    private static long fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    private static long two_power(int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= 2;
        }
        return ans;
    }

    private static long dp_fib(int n) {
        long f[] = new long[n + 2];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}

