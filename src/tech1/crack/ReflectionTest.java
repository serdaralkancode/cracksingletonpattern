package tech1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

    public static void main(String[] args) {

        MyObject ins1 = MyObject.instance;
        MyObject ins2 = null;

        Constructor[] constructors = MyObject.class.getDeclaredConstructors();

        for(Constructor constructor : constructors)
        {
            constructor.setAccessible(true);
            try
            {
                ins2 = (MyObject) constructor.newInstance();
            }
            catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        //different hashcode
        System.out.println("ins1 hashcode :" + ins1.hashCode());
        System.out.println("ins2 hashcode :" + ins2.hashCode());
    }
}
