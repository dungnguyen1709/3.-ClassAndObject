public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 4, 3, 1, 17, 34, 9,6,97,99};
        do {
            int index_del = findX(1,arr);
            removeX(index_del, arr);
        } while (findX(1,arr) > 0);

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static int findX(int number, int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return index = i;
            }
        }
        return index;
    }

    public static int[] removeX(int indexX, int[] arr) {
        for (int i = indexX; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }
}


