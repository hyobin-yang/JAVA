package access.ex;

import java.rmi.activation.ActivationGroup_Stub;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment() {
        if (isCountValid(count)) {
            count++;
        } else {
            System.out.println("최대값을 초과하므로 숫자를 증가시킬 수 없습니다");
        }
    }

    private boolean isCountValid(int count){
        return count+1 <= max;
    }

    public int getCount(){
        return count;
    }
}
