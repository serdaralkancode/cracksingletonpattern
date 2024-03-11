package tech1.prevent.tech1;

import tech1.prevent.tech1.MyObject2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest2 {

    public static void main(String[] args) {

        MyObject2 ins1 = MyObject2.instance;
        MyObject2 ins2 = null;

        Constructor[] constructors = MyObject2.class.getDeclaredConstructors();

        for(Constructor constructor : constructors)
        {
            constructor.setAccessible(true);
            try
            {
                ins2 = (MyObject2) constructor.newInstance();
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
