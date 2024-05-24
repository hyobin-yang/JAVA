package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if (isCountValid(itemCount)){
            items[itemCount] = item;
            itemCount ++;
        } else{
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    private boolean isCountValid(int itemCount){
        return itemCount < 10;
    }

    int total;
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i=0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("전체 가격 합: " + total);

    }
}
