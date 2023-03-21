public class Pants extends ClothingItem{
    private int numPockets;

    public Pants(int price, boolean saleItem, int numPockets){
        super(price, saleItem);
        this.numPockets = numPockets;
    }

    //getter

    public int getNumPockets() {
        return numPockets;
    }

    //Method

    public void hem(){
        System.out.println("You have hemmed your pants!");
    }
}
