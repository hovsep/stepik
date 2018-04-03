package com.hova;

public class MergeSort {

    public static void showResult(String[] args) {
        int[] a1 = {0, 2,2};
        int[] a2 = {1, 3,5};

        int[] a3 = mergeArrays(a1, a2);

        System.out.println("Merged:");
        for (int item : a3) {
            System.out.println(item);
        }
    }


    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];

        if (a1.length == 0) {
            return a2;
        }

        if (a2.length == 0) {
            return a1;
        }

        Boolean end1 = false;
        Boolean end2 = false;
        for (int i=0,j=0,k=0;k<a1.length + a2.length;k++)
        {

            if (end1|end2) {

                if (end1) {
                    a3[k] = a2[j];
                    System.out.println("end1 take " + a3[k] + " k=" +k);
                    if (j < a2.length -1) {
                        j++;
                    }
                }

                if (end2) {
                    a3[k] = a1[i];
                    System.out.println("end2 take " + a3[k] + " k=" +k);
                    if (i < a1.length -1) {
                        i++;
                    }
                }

            } else {

                System.out.println("i=" + i + " j=" + j + " k=" +k + " a1[i]=" + a1[i] + " a2[j]=" + a2[j]);
                if (a1[i] < a2[j]) {
                    a3[k] = a1[i];
                    if (i < a1.length -1) {
                        i++;
                    } else {
                        end1 = true;
                    }

                } else {
                    a3[k] = a2[j];

                    if (j < a2.length -1) {
                        j++;
                    } else {
                        end2 = true;
                    }
                }
                System.out.println("i=" + i + " j=" + j + " k=" +k + " a3[k]=" + a3[k]);
            }
        }


        return a3;
    }
}
