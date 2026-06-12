package lesson6.demo1_reflexion;

import java.lang.reflect.Field;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException {

        User user =  new User(1, "kokos", "asdqwe");
        System.out.println(user);
        Class<? extends User> aUser = user.getClass();
        Field password = aUser.getDeclaredField("password");
        password.setAccessible(true);
        password.set(user, "new password");

        //    List<Field> fields = Arrays.asList(aUser.getDeclaredFields());
    //    fields.forEach(field -> {
    //        System.out.println(field.getName() + "  " + field.getType() + "  " + field.getModifiers());
    //    });
    //    Method[] declaredMethods = aUser.getDeclaredMethods();
    //    Arrays.asList(declaredMethods).forEach(method -> {
    //        System.out.println("-----------------------------");
    //        System.out.println(method.getName() + " " + method.getReturnType() + " " + method.getParameterCount());
    //        Parameter[] parameters = method.getParameters();
    //        Arrays.asList(parameters).forEach(parameter -> {
    //            System.out.println(parameter.getName() + " " + parameter.getType());
    //        });
    //        System.out.println("------------------------------");



    //    });
    //    Constructor<?>[] declaredConstructors = aUser.getDeclaredConstructors();
    //    Arrays.asList(declaredConstructors).forEach(constructor -> {
    //        System.out.println();
    //    });
    //    Constructor<? extends User> declaredConstructor = aUser.getDeclaredConstructor(int.class, String.class, String.class);
    //    System.out.println(declaredConstructor.getParameterCount());
        System.out.println(user);


    }
}
class User {
    public int id;
    String name;
    private String password;

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password);
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;





    }
}


