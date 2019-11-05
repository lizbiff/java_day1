public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public void print(int pages, int copies) {
        if ((pages * copies) <= numberOfCopies){
            this.paper -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }

    public int getSheetsLeft(){
        return this.paper;
    }
}
