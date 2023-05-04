public class ArrayLesson {
    static void printArray (int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] orderPrice = new int[10];
        orderPrice[2]=5;
        orderPrice[5]=8;
        orderPrice[6]=4;
        orderPrice[9]=9;
        printArray(orderPrice);
        System.out.println("///////////////////////");
        int[] orderPrice1 = new int[10];
        for(int i=0; i< orderPrice1.length; i++) {
            if (i == 2)
                orderPrice1[i] = 5;
            else if (i == 5)
                orderPrice1[i] = 8;
            else if (i == 6)
                orderPrice1[i] = 6;
            else if (i == 9)
                orderPrice1[i] = 9;
        }
        printArray(orderPrice1);
            }
    }

