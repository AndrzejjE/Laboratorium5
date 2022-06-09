package Zad5_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public static void main(String[] args){
        ArrayList<String> cNames = new ArrayList<>();
        cNames.add("espresso");
        cNames.add("latte");
        cNames.add("cappuccino");
        cNames.add("mocha");
        cNames.add("auLait");
        cNames.add("macchiato");
        for (String name : cNames) {
            System.out.print(name + ", ");
        }
        Iterator<String> it = cNames.iterator();

        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        for (String name: cNames) {
            System.out.println(name.toUpperCase());
        }
        for (int i = 0; i < cNames.size(); i++) {
            String cn = cNames.get(i);
            System.out.println(cn.substring(0,4));
        }
    }
}
