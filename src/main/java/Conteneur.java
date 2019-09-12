import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Conteneur {

    private Map<String, String> map;



    private boolean isFinish;

    public Conteneur(){
        map = new HashMap<>();
    }

    public Map<String, String> getMapUnmodifiable() {
        return Collections.unmodifiableMap(map);
    }

    public void addEntryIntoMap(String key, String value) {
        if (map.size() < 10) {
            map.put(key, value);
        } else {
            throw new SizeException();
        }
    }
    public void deleteEntryIntoMap(String key){
        if(getEntryByKey(key)!=null){
            map.remove(key);
        }
    }

    public String getEntryByKey(String key) {
        if (map.get(key) != null) {
            return map.get(key);
        } else {
            throw new NotFound();
        }
    }

    public int getSize() {
        return map.size();
    }
    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}
