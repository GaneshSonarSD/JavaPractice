package rivisionBasic;

public class Basics {
    public static void main(String[] args) {
        System.out.println("hello world  My First program");
        greet("Ganesh");
        int ans = add(10,10);
        System.out.println(ans);
    }
    public static void greet(String x){
        System.out.println("My name is " + x);
    }
    public static int add(int a, int b){
        return a + b;
    }


}
