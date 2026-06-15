package lesson6.demo2_annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@MyAnnotation
public class Main {
    public static void main(String[] args) {

        User  user = new User();
        handlerOfMyAnnotation(user);

    }

    public static void handlerOfMyAnnotation(User user) {
        Class<? extends User> aClass = user.getClass();
        if (aClass.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);
            String msg = annotation.msg();

        }

    }
}
@MyAnnotation(msg = "bigbird")
class User {
    private int id;
    private String name;

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

    public User(int id, String name) {
        this.id = id;
        this.name = name;


    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
