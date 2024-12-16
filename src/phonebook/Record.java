package phonebook;


public class Record {
    String name;
    String phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;

    }
    public String toString() {
        return "Record: name = " + name + " ,phone = " + phone;
    }

}