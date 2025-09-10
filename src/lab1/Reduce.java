package lab1;

public class Reduce {
    public static int reduce(int n) {
        int steps = 0;
        int x = n;
        while (x > 0) {
            if (x % 2 == 0)
                x = x / 2;
            else
                x -= 1;
            steps++;
        }
        return steps;
    }
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }
}