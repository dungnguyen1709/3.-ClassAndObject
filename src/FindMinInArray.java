public class FindMinInArray {
    public static void main(String[] args) {
        int[] array = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(array);
        System.out.println(" Smallest value in Array is : " + array[index] + " at position " + index);
    }
    public static int minValue(int[] array) {
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                indexMin = i;
            }
        }
        return  indexMin;
    }
}
