package advanced.jvm;

public class ClassLoaderTest {
    public static void main(String[] args) {
        // Application Classloader
        Class c = ClassLoaderTest.class;
        System.out.println(c.getClassLoader()); // jdk.internal.loader.ClassLoaders$AppClassLoader

        // Bootstrap Classloader (built-in class)
        System.out.println(String.class.getClassLoader()); // null
    }
}
