import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by alexander.galash on 6/26/2017.
 */
public class Notebook {

    private ArrayList<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);

    }

    public ArrayList<Record> getList() {
        return records;
    }

    public void remove(int id) {
        Iterator<Record> it = records.iterator();
        while (it.hasNext()) {
            Record r = it.next();
            if (r.getId() == id) {
                it.remove();
                System.out.println("Record "+id+" deleted");
            }
        }

    }

}
