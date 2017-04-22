package com.adarsh;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by adarshbhattarai on 3/28/17.
 */
public class ZipCodeChallenge {


    public static int[][]  solution(int[][] input){

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        for(int[] keyValue : input){

            //Make smaller value as key
            int key   = keyValue[1]<keyValue[0] ? keyValue[1] : keyValue[0];
            int value = keyValue[1]<keyValue[0] ? keyValue[0] : keyValue[1];

            if(treeMap.containsKey(key)) {

                value = (treeMap.get(key) < value)? value : treeMap.get(key);
            }
            treeMap.put(key,value);

        }

        return filterRanges(treeMap);

    }

    private static int[][] filterRanges(TreeMap<Integer, Integer> treeMap) {

        int prevKey = treeMap.firstKey();
        int prevValue = treeMap.get(prevKey);

        Set set = treeMap.entrySet();

        Iterator it =set.iterator();

        while (it.hasNext()){

            Map.Entry entry = (Map.Entry)it.next();

            int newKey = (int) entry.getKey();
            int newValue = (int) entry.getValue();
            if(newKey > prevKey && newKey <= prevValue+1){
                it.remove();
                if(newValue > prevValue){
                    prevValue = newValue;
                    treeMap.put(prevKey,prevValue);
                }
            }
            else{
                prevKey   = newKey;
                prevValue = newValue;
            }

        }
       return treeToArray(treeMap);
    }

    private static int[][] treeToArray(TreeMap<Integer, Integer> treeMap) {

        int[][] result= new int[treeMap.size()][2];
        int index=0;

        for(Map.Entry<Integer,Integer> entry : treeMap.entrySet()){

            result[index][0]=entry.getKey();
            result[index++][1]=entry.getValue();
        }

        return result;
    }


}
