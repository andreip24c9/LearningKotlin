package old;

public interface IObject {
    default void doSth(String s){
        System.out.println(s);
    }
}
