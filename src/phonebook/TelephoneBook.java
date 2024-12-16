package phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {
    private final List<Record> records = new ArrayList<Record>();

    public void addRecord(Record record) {
        records.add(record);

    }
    public Record find(String name) {
        for (Record record : records) {
            if(record.name.equals(name)){
                return record;
            }
        }
        return null;
    }
    public List<Record> findAll(String name) {
        List<Record> result = new ArrayList<>();
        for (Record record : records) {
            if(record.name.equals(name)){
                result.add(record);
            }
        }
        return result;

    }
}