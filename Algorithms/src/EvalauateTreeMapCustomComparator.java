
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sv186040
 */
public class EvalauateTreeMapCustomComparator {

    public static void main(String[] args) {
        //if(context.size() == 0)
        //  return null;
        TreeMap<Double, List<String>> map = new TreeMap<Double, List<String>>(
                new Comparator<Double>() {
            @Override
            public int compare(Double d0, Double d1) {
                return d1.compareTo(d0);
            }
        });
        map.put(0.1, new ArrayList<String>());
        map.put(0.2, new ArrayList<String>());
        map.put(0.3, new ArrayList<String>());
           // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Double,List<String> >entry : map.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
            
    }
}
