package rivisionBasic;

public class ArmStrongNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if(armstrong(i) == true) {
                System.out.print((i + " "));
            }
        }

    }
    static boolean armstrong(int n){
        int sum = 0;
        int a = n;
        while(a > 0){
            int rem = a % 10;
            sum += rem * rem * rem;
            a = a/10;
        }
        return sum == n;
    }

}
