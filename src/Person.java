public class Person {
    String name;
    private int id = 0;
    private static int nextId;

    public Person(String name){
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
