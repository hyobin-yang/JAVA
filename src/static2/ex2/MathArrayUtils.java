package static2.ex2;

public class MathArrayUtils {

    private MathArrayUtils(){
        // 객체 생성 막기
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] arr){
        return (double)sum(arr)/arr.length;
    }

    public static int min(int[] arr){
        int tmp = arr[0];
        for (int value:arr){
            if (value < tmp){
                tmp = value;
            }
        }
        return tmp;
    }

    public static int max(int[] arr){
        int tmp = arr[0];
        for (int value:arr){
            if (value > tmp){
                tmp = value;
            }
        }
        return tmp;
    }


}
