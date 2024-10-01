//Inheritance with Person and override say Hello to show one's GPA.
public class Students extends Person{

    private double studentGPA;

    public Students(String name, int age, double studentGPA){
        super(name, age);
        this.studentGPA = studentGPA;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }

    @Override
    public void sayHello(){
        System.out.println("Hi. My name is " + getName() + ". And my GPA is " + getStudentGPA());

    }

    public static void main(String[] args) {
        Students student = new Students("Elwood", 23, 3.2);
        student.sayHello();
    }
}
