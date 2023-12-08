import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Inspector<T> {

    public Class<T> inspectorClass;

    public Inspector(Class<T> inspectorClass) {
        this.inspectorClass = inspectorClass;
    }

    public void displayInformations() {
        String information = "Information of the \"" + inspectorClass.getName() + "\" class:";
        System.out.println(information);
        System.out.println("Superclass: " + inspectorClass.getSuperclass().getName());

        Method[] methods = inspectorClass.getDeclaredMethods();
        Field[] fields = inspectorClass.getDeclaredFields();

        System.out.println(methods.length + " methods:");
        for (Method method : methods) {
            System.out.println("- " + method.getName());
        }

        System.out.println(fields.length + " fields:");
        for (Field field : fields) {
            System.out.println("- " + field.getName());
        }
    }

    public T createInstance() throws Exception {
        try {
            Constructor<T> constructor = inspectorClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw e;
        }
    }
}