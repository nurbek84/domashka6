public class Main {
    public static void main(String[] args) {
        int[] array = {4654,34356,762,12};
//        sumArray(array); //suma
//        sortOfArray(array); // sorted
//        System.out.println(min(array)); // min elements of array
//        System.out.println(max(array)); // max elements of array
        sortOfArray(array);
    }
    public static void sumArray(int [] array){
        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum+=array[i];
//        }


        for (int a: array) {
            sum+=a;
        }

        System.out.println(sum);
    }
    public static void sortOfArray(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int a:array) {
            System.out.print(a+" ");
        }
    }
    public static int min(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array[0];
    }
    public static int max(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        return array[0];
    }


}