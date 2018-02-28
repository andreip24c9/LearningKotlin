package old_java;

public interface IObject {
    default void doSth(String s){
        System.out.println(s);
    }
}
