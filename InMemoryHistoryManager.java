package trecker.v2_2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class InMemoryHistoryManager implements IHistoryManager{
    private Map<Integer, trecker.v2_2.Task> historyMap;
    private int generatorHistoryMapId=1;
    
    InMemoryHistoryManager(){
        historyMap = new LinkedHashMap<>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, trecker.v2_2.Task> eldest) {
                return size() > 10;
            }
        };
    }
     
     public void addHistory( Task task){
        historyMap.put(generatorHistoryMapId++, task);
     }
     
     @Override 
    public  List<trecker.v2_2.Task> getHistory(){
         return new ArrayList<>(historyMap.values());
    }
}
