package org.example;

public class Main {
    public static void main(String[] args) {
    int[] og1 = {3,5,4,6};
    int[] og2 = {8,3,5,2};
    int num = 10;
      Task1 sort = new Task1();
//        sort.sortA(og1,num);
//        sort.sortB(og2,num);
        sort.merge(sort.sortA(og1,num), sort.sortB(og2,num));
    }
}