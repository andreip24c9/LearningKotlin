package old_java;

public class MyObject implements IObject, IObject2 {

    public final String TAG = getClass().getSimpleName();

//    @Override
//    public void doSth(String words) {
//        System.out.println(words);
//    }

    public void doSth2() {
        System.out.println("print 2");
    }
}
