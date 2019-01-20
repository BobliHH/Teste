import java.util.LinkedList;
import java.util.List;

public class CustomList {
    private List<String> list = new LinkedList<String>();

    public boolean isEmpty() {
        if(list.size()==0){
            return true;
        }else {
            return false;
        }
    }

    public void add(String value) {
        list.add(value);
    }

    public int size() {
        return list.size();
    }

    public String get(int i) {
        return list.get(i);
    }
}
