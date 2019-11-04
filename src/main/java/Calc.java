public class Calc {

//    instance variables

    private double numberOne;
    private double  numberTwo;


//    constructor

    public Calc(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
//    getter

    public double canAdd(){
        return this.numberOne + this.numberTwo;
    }

    public double canSubtract(){
        return this.numberOne - this.numberTwo;
    }

    public double canMultiple(){
        return this.numberOne * this.numberTwo;
    }

    public double canDivide(){
        return this.numberOne / this.numberTwo;
        }

}
