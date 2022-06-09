package Zad5_1;

//import java.util.ArrayList;
import java.util.*;



public class List {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 1; true; i++){
            if (i % 2 == 0){
                list.add(i);
                if (list.size() == 50){
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int j = i + 1;
            System.out.println("[" + j + "] " + list.get(i));
        }
        long stop = System.currentTimeMillis();
        System.out.println("Czas wykonania(w milisekundach): " + (stop - start));
    }
}
