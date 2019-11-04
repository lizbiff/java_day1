public class WaterBottle {


    //    instance variables

    private int volume;
    private int drink;
    private int fill;

    //    constructor


    public WaterBottle(int volume, int drink, int fill){
        this.volume = volume;
        this.drink = drink;
        this.fill = fill;
    }

//    getter

    public int howMuchLiquid(){
        return this.volume;
    }

    public int takeDrink(){
        return this.volume - this.drink;
    }

    public int empty(){
        return this.volume - this.volume;
    }

//    public int fillBottle(){
//        amountToFill = 100 - this.volume;
//        return  this.volume + amountToFill;
//
//    }






}
