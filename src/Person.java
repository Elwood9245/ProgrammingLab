
public class Person {
    private int age;
    private  String name;

    public Person(String s, int a){
        age = a;
        name = s;
    }

    public void sayHello(){
        System.out.println("Hi, I am " + name + " and I am " + age + "years old");
    }

    public static void main(String[] args) {
        Person onePerson = new Person("Elwood", 23);
        onePerson.sayHello();
    }

}
