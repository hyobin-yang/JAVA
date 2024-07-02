package access.ex2;

public class ShoppingCart {
    private int sum = 0;
    private int cnt = 0;
    private Item[] itemArr = new Item[10];

    public void addItem(Item item){
        itemArr[cnt] = item;
        cnt ++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i=0; i<cnt; i++){
            System.out.println("상품명: " + itemArr[i].getName() + ", 합계: " +
                    itemArr[i].getTotalPrice());
            sum += itemArr[i].getTotalPrice();
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
