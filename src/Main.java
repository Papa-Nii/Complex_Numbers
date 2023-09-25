public class Main {
    public static void main(String[] args){

        Complex Number1 = new Complex();
        Number1.realNumber = 4.67;
        Number1.imaginaryNumber=7.67;
        Number1.printComplex();

        Complex Number2 = new Complex();
        Number2.realNumber=3.35;
        Number2.imaginaryNumber=12.02;
        Number2.printComplex();

        Complex.addComplexNumbers(Number1,Number2);
        Complex.subtractComplexNumbers(Number2,Number1);


    }
}
