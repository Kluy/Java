package Java9;

import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        arr = myReverse(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите индекс и размерность нового массива");
        int index = in.nextInt();
        int count = in.nextInt();

        arr = subArray(arr, index, count);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int [] subArray(int [] arr, int index, int count){
        int [] subArray = new int [count];
        int j = 0;
        if (arr.length > count + index){                // Создает массив с длинной count, если новый массив короче старого
            for (int i = index; i < count + index; i++) {
                subArray[j] = arr[i];
                j++;
            }
        } else {                                       // Создает массив с длинной count
            for (int i = index; i < arr.length; i++) {
                subArray[j] = arr[i];
                j++;
            }
        }
        if (count > arr.length) {                  //Заполняет единицами недостающие элементы массива, если новый массив длинне старого
            for (int k = index; count > k; k++) {
                subArray[k] = 1;
            }
        }
        return subArray;
    }

    static int [] myReverse(int [] arr, int length) {
        int [] arrReverse = new int [length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrReverse[j] = arr[i];
            j++;
        }
        return arrReverse;
    }
}