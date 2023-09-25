public class Complex {

    //creating a variable for the real part of the complex number
    public double realNumber;
    public double imaginaryNumber;

    //creating a constructor of the class Complex
    Complex(){
        this.realNumber=1;
        this.imaginaryNumber=1;
    }

    // this method performs the addition of complex numbers
    public static void addComplexNumbers(Complex comp1,Complex comp2){
        float realPart = (float) comp1.realNumber + (float) comp2.realNumber;
        float imaginaryPart =(float) comp1.imaginaryNumber + (float) comp2.imaginaryNumber;
        System.out.println("The sum of "+comp1.realNumber+" + "+comp1.imaginaryNumber+"i and "+comp2.realNumber+" + "+comp2.imaginaryNumber+"i = "+realPart+" + "+imaginaryPart+"i");

    }

    // this method performs the subtraction
    public static void subtractComplexNumbers(Complex comp1,Complex comp2) {
        float realPart = (float) comp1.realNumber - (float) comp2.realNumber;
        float imaginaryPart = (float) comp1.imaginaryNumber - (float) comp2.imaginaryNumber;
        System.out.println("The difference of " + comp1.realNumber + " + " + comp1.imaginaryNumber + "i and " + comp2.realNumber + " + " + comp2.imaginaryNumber + "i = " +realPart+ " + " + imaginaryPart + "i");
    }

    //this method prints out the complex number
    public void printComplex(){
        System.out.println(this.realNumber+" + "+this.imaginaryNumber+"i");

    }




    }
