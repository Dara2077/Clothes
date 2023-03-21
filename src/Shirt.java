public class Shirt extends ClothingItem{

    private String collarType;

    public Shirt(int price, boolean saleItem, String collarType){
        super(price, saleItem);
        this.collarType = collarType;
    }

    //Getter

    public String getCollarType() {
        return collarType;
    }

    //Method

    public void turnIntoCropTop(){
        System.out.println("You've turned me into a crop top");
    }
}
