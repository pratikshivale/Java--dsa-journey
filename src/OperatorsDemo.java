//Program 3
//Description:

public class OperatorsDemo {
    public static void main(String[]args){
        int a = 10;
        int b = 30;

       double addition = a+b;
       double subtraction = a-b;
       double multiplication = a*b;
       double division = a/b;
       double  division_using_casting = (double)a/b;

        System.out.println("Addition: "+ addition);
       System.out.println("Subtraction: "+ subtraction);
        System.out.println("Multiplication: "+ multiplication);
        System.out.println("Division: "+ division);
        System.out.println("Decimal division using casting: "+ division_using_casting);

    }
}
