
public class Person {
    private int age;
    private  String name;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
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

    public void sayHello(){
        System.out.println("Hi, I am " + name + " and I am " + age + "years old");
    }

    public static void main(String[] args) {
        Person onePerson = new Person("Elwood", 23);
        onePerson.sayHello();
    }

}
