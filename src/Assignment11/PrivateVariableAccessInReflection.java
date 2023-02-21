package Assignment11;
import java.lang.reflect.Field;
class Student{
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class PrivateVariableAccessInReflection {
    public static void main(String[] args){
        try {
            Student e = new Student("Shreya", 21);
            Field privateField
                    = Student.class.getDeclaredField("name");
            privateField.setAccessible(true);
            String name = (String)privateField.get(e);
            System.out.println("Name of Student:" + name);
        }
        catch (Exception e) {
            e.printStackTrace();
        }



    }
}
