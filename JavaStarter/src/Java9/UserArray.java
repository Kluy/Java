package Java9;

public class UserArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,11,12,33,44,55,22,33,44};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        arr = lengthPlus(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int value = 112;

        arr = plusOne(arr, value);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    static int [] lengthPlus (int [] arr) {
        int [] arrNew = new int [arr.length + 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arrNew[j] = arr[i];
            j++;
        }
        return arrNew;
    }
    static int [] plusOne(int [] arr, int value) {
        int[] arrNew = new int[arr.length + 1];
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            arrNew[j] = arr[i];
            j++;
        }
        arrNew[0] = value;
        return arrNew;
    }
}