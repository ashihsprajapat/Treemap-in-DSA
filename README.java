# Treemap-in-DSA
Tree Map with all operation
import java.util.Set;
import java.util.TreeMap;

public class TreeMapcomplete {
    public static void main(String[] args) {
        // sorted order
        // create treemap
        TreeMap<Integer, String> tm = new TreeMap<>();

        // put operation
        tm.put(2, "Ashish");
        tm.put(5, "Anuj");
        tm.put(1, "Vishanu");
        System.out.println(tm);

        // size operation
        System.out.println(tm.size());

        // getOperation
        System.out.println(tm.get(5));

        // containsKey
        System.out.println(tm.containsKey(1));

        // isEmpty
        System.out.println(tm.isEmpty());

        // Iteration search

        Set<Integer> key = tm.keySet();
        for (Integer k : key) {
            System.out.println(k);

        }
    }
}
