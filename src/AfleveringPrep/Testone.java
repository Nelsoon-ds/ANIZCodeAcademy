package AfleveringPrep;

import java.util.Arrays;

public class Testone {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 140};
        //int[] temp = new int[4];
        int[][] multiDimensionalArray = new int[4][4];

        multiDimensionalArray[0][0] = 1;
        multiDimensionalArray[1][1] = 2;
        multiDimensionalArray[2][2] = 3;
        multiDimensionalArray[3][3] = 4;

      //  System.out.println(Arrays.deepToString(multiDimensionalArray));


        /* for (int i = 0; i < multiDimensionalArray.length; i++) {
            System.out.println(multiDimensionalArray[i][i]);

        }
        /*
         */

        /* for (int[] x : multiDimensionalArray) {
            for (int y : x) {
                System.out.println(y + " ");
            }
            System.out.println();
        }
        /*
         */

        for (int[] row : multiDimensionalArray){
            System.out.println(Arrays.toString(row));
        }


        int maxNum = numArray[0];
        int lowNum = numArray[0];


        /* for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > maxNum) {
                maxNum = numArray[i];
            }

        } */

        /* for (int i = numArray.length - 1; i >= 0; i--) {
            if (numArray[i] < maxNum) {
                lowNum = numArray[i];
                System.out.println(lowNum);
                System.out.println("----");
                System.out.println(numArray[i]);
            }

        } */

        /* for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray.length; j++) {
                if (numArray[i] > numArray[j]) {
                    maxNum = numArray[i];
                } else {
                    maxNum = numArray[j];
                }


        } */

   //     System.out.println(maxNum);
     //   System.out.println(lowNum + " lowest num");

       /* for (int i = 0; i < numArray.length ; i++) {
            System.out.println(numArray[i]);

        } */
         /*for (int j = 3; j < temp.length; j--) {
            temp[j] = numArray[j];
            System.out.println(temp[j]);
        } */

       /* for(int num : numArray) {
            System.out.println(numArray[num]);
        } */



    }}
