package old_java;

public interface IObject2 {
    default void doSth(String s, Integer i){
        System.out.println(s);
    }
}
