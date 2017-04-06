/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivemul
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreePagePathAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String path = "/home/srivemul/Desktop/weblog.csv"; 
        Map<String, Integer> pageCountMap = getMaxThreePagesPath(path);
        //Sort hashmap based on count decending order and print the map
        System.out.println(sortHashMapByValues(pageCountMap));
    }

    public static Map<String, Integer> sortHashMapByValues(
            Map<String, Integer> passedMap) {
        List<String> mapKeys = new ArrayList<>(passedMap.keySet());
        List<Integer> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a == b) {
                    return 0;
                }
                if (a < b) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        Map<String, Integer> sortedMap
                = new HashMap<>();

        Iterator<Integer> valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Integer val = valueIt.next();
            Iterator<String> keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                String key = keyIt.next();
                Integer comp1 = passedMap.get(key);
                Integer comp2 = val;

                if (comp1.equals(comp2)) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
        return sortedMap;
    }

    private static Map<String, Integer> getMaxThreePagesPath(String path) {

        Map<String, Integer> pageCountMap = new HashMap<>(); // For maintaining 3 pagepath and its count across all users
        if (path == null || "".equals(path)) {
            return null;
        }
        File file = new File(path);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            Map<String, List<String>> userThreePageMap = new HashMap<String, List<String>>();// HashMap for maintaining user and 3 page path
            String line = null;
            try {
                while ((line = bf.readLine()) != null) {
                    String[] lineArr = line.split(",");
                    String userId = lineArr[0];
                    String url = lineArr[1];
                    List<String> urlList = null;
                    if (userThreePageMap.get(userId) == null) {
                        urlList = new ArrayList<String>();
                    } else {
                        urlList = userThreePageMap.get(userId);
                    }
                    if (urlList.size() < 2) { // Skip checking till the urllist is filled with min 2 page urls for particular user 
                        urlList.add(url);
                        continue;
                    }
                    urlList.add(url);
                    if (urlList.size() > 3) {  // Removing first url for sliding to next 3 urls
                        urlList.remove(0);
                    }
		    userThreePageMap.put(userId,urlList);
                    String key = urlList.get(0).trim() + urlList.get(1).trim() + urlList.get(2).trim();
                    int count = (pageCountMap.get(key) == null ? 0 : pageCountMap.get(key)) + 1;
                    pageCountMap.put(key, count);
                }
            } catch (IOException ex) {
                Logger.getLogger(ThreePagePathAlgorithm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ThreePagePathAlgorithm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pageCountMap;
    }

}
