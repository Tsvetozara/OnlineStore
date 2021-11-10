import org.reflections.Reflections;

import java.util.Set;

public class StoreApp {
    public static void main(String args[]) {

        System.out.println("Hello world");

        Reflections reflections = new Reflections("com.my.project");

        Set<Class<?>> subTypes =
                reflections.get(SubTypes.of(SomeType.class).asClass());

        Set<Class<?>> annotated =
                reflections.get(SubTypes.of(TypesAnnotated.with(SomeAnnotation.class)).asClass());
    }
}
