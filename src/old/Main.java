package old;

public class Main {
    public static void main(String[] args) {
        IObject obj = new MyObject();
        MyObject myObject = (MyObject) obj;
        myObject.doSth2();
    }
}
