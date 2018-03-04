package old_java.java_classes;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void create(Created created) {
        created.onCreate(this);
    }
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
