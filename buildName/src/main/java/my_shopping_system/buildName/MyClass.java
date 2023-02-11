package my_shopping_system.buildName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter // Lombok이 자동으로 getter, setter를 만들어줌
@ToString
public class MyClass {

    private String name;
    private int age;

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setName("Hello");

        String name = myClass.getName();
        System.out.println("name = " + name);
        System.out.println("myClass = " + myClass);
    }
}
