/*
85. In a class Calculator, create multiple add() methods that
overload each other and can sum two integers, three
integers, or two doubles. Demonstrate how each can be
called with different numbers of parameters.
 */
package CH85;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.printf("First add : %d%n", calc.add(4, 5));
        System.out.println("Second add : "+calc.add(4,5,6));
        System.out.println("Third add : "+calc.add(4.5,11.8));
    }
}
