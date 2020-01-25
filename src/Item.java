public class Item {
    private String PartNumber;
    private String Description;
    private double Price;
    public Item (String v1, String v2, double v3) {
        if (Price < 0){
            Price = 0;
        }
        PartNumber = v1;
        Description = v2;
        Price = v3;
    }
    public double getTotalPrice (int quantity){
        if (quantity < 0){
            quantity = 0;
        }
        return quantity * Price;
    }
    public String toString(){
        return "Item: "+PartNumber+"\nPrice: $"+Price+"\nDescription: "+Description;
    }
}
