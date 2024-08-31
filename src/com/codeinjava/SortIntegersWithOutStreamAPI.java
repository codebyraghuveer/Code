package com.codeinjava;

public class SortIntegersWithOutStreamAPI {
    public static void main(String[] args) {
        int[] ints = {1, 2343, 3242, 324};
        //List<Integer> list = Arrays.stream(ints).boxed().toList();

        for (int i = 0; i < ints.length; i++) {
            for(int j=0;j<ints.length-i-1;j++){

                if(ints[j]>ints[j+1]){
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
        for (int anInt : ints) {
            System.out.println(anInt);

        }





    }
}
