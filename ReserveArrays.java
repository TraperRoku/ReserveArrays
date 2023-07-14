package Fylyp.kot;

import java.util.Scanner;
public class Main {


     public static void main(String[] args) {

    printArray(sortIntegers(getIntegers(5)));

}


    public static int[]getIntegers(int len){
        Scanner scanner = new Scanner(System.in);
        int[]tab = new int[len];
        for(int i=0; i<len;i++){
            tab[i]=scanner.nextInt();
        }
        scanner.close();
        return tab;

    }
    public static void printArray(int[] Array){
        for(int i=0; i<Array.length;i++){
            System.out.println("Element "+i+" contents "+Array[i]);
        }

    }
    public static int[] sortIntegers(int[] unSort){
        boolean flag = true;
        int lowest;
        while(flag){
            flag = false;
            for(int i=0; i<unSort.length-1;i++){
                if(unSort[i]<unSort[i+1]){
                    lowest = unSort[i];
                    unSort[i]=unSort[i+1];
                    unSort[i+1]=lowest;
                    flag=true;
                }
            }
        }
        return unSort;
    }
}