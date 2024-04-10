package Tinkoff_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);


        Set<Integer> set = new HashSet<>(list);


        System.out.println(set.size() == list.size()-1);
        System.out.println(set);


    }
}
