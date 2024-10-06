package Codewars;

public class MergeArrays {
    /*
Написать метод, который принимает
на вход 2 массива int[] и возвращает объединенный
массив уникальных неповторяющихся элементов
 */
//    public static int[] mergeArrays(int[] a, int[] b {
//        // int[] newArr = new int[a.length+b.length];
//
//        int uniqueCounter = 0;
//        int uniqueCounter2 = 0;
//        for (int i= 0; i < a.length; i++){
//            boolean isUnique = true;
//
//        }

        //int uniqueCount1 = 0;
        //int uniqueCount2 = 0;
        //
        //for (int i = 0; i < array1.length; i++) {
        //    boolean isUnique = true;
        //    for (int j = 0; j < i; j++) {
        //        if (array1[i] == array1[j]) {
        //            isUnique = false;
        //            break;
        //        }
        //    }
        //    if (isUnique) {
        //        uniqueCount1++;
        //    }
        //}

/*

    static int[] uniqueArr(int[] arr1, int[] arr2) {
​
        int uniqueCount1 = 0;
        int uniqueCount2 = 0;
​
        for (int i = 0; i < arr1.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount1++;
            }
        }
​
        for (int i = 0; i < arr2.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr2[i] == arr2[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount2++;
            }
        }
        System.out.println(uniqueCount1);
        System.out.println(uniqueCount2);
​
        int[] result = new int[uniqueCount1 + uniqueCount2];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[index++] = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean isInFirstArray = false;
            for (int k = 0; k < arr1.length; k++) {
                if (arr2[i] == arr1[k]) {
                    isInFirstArray = true;
                    break;
                }
            }
            if (!isInFirstArray) {
                result[index++] = arr2[i];
            }
        }
    return result;
}
 */
    //}

}
