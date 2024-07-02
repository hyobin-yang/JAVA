package access.ex2;

public class Item {
    public String itemName;
    public int itemPrice;
    public int itemCnt;

    Item(String itemName, int itemPrice, int itemCnt){
        this.itemName = itemName;
        this.itemCnt = itemCnt;
        this.itemPrice = itemPrice;
    }

    public String getName(){
        return itemName;
    }

    public int getTotalPrice(){
        return itemPrice * itemCnt;
    }





}
