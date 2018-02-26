package old;

public interface IObject2 {
    default void doSth(String s, Integer i){
        System.out.println(s);
    }
}
