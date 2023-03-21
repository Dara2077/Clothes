public class ClothingItem {

    private int price;
    private boolean saleItem;

    public ClothingItem(int price, boolean saleItem){
        this.price = price;
        this.saleItem = saleItem;
    }

    //getters


    public int getPrice() {
        return price;
    }

    public boolean isSaleItem() {
        return saleItem;
    }

    //Method

    public void tryOn(){
        System.out.println("Thanks for trying me on!");
    }
}
