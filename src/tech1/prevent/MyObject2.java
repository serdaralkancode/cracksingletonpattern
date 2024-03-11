package tech1.prevent.tech1;

public class MyObject2 {

    private MyObject2() {

        if(MyObject2.instance != null)
        {
            //add this exception
            try {
                throw new InstantiationException("creating is not allowed");
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            }
        }

    };

    public static final MyObject2 instance = new MyObject2();
}
