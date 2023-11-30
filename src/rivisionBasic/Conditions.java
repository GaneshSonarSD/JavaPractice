package rivisionBasic;

public class Conditions {
    public static void main(String[] args) {
        int salary = 25400;
//        if( salary > 10000){
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
        if (salary > 10000){
            salary += 200;
        }else if(salary > 20000){
            salary+= 4000;

        }
        else{
            salary += 100;
        }
        System.out.println(salary);
    }

}
