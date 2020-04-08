package dev.alox.searchforfirebase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchFirestore {

    public static HashMap<String,String> realList;

    public static List<String > getField(HashMap<String,String> hashMap, String SearchKey){
        String fVal;
        SearchKey = SearchKey.toUpperCase();
        List<String > field = new ArrayList<>();
        for (int i =0; i<hashMap.size();i++){
            fVal = getHashMapKeyFromIndex(hashMap,i).toUpperCase();
            if (fVal.contains(SearchKey)){
                field.add(getHashMapKeyFromIndex(hashMap,i));
            }
        }

        return field;

    }

    public static List<String > getFieldValue(HashMap<String,String> hashMap, String SearchKey){
        String fVal,key;
        SearchKey = SearchKey.toUpperCase();
        List<String> fieldValue = new ArrayList<>();

        for (int i =0; i<hashMap.size();i++){
            fVal = getHashMapKeyFromIndex(hashMap,i).toUpperCase();
            if (fVal.contains(SearchKey)){
                key = getHashMapKeyFromIndex(hashMap,i);
                fieldValue.add(hashMap.get(key));
            }
        }

        return fieldValue;

    }


    public static String getHashMapKeyFromIndex(HashMap hashMap, int index){

        String key = null;
        HashMap <String,Object> hs = hashMap;
        int pos=0;
        for(Map.Entry<String, Object> entry : hs.entrySet())
        {
            if(index==pos){
                key=entry.getKey();
            }
            pos++;
        }
        return key;

    }

}
