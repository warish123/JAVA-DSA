class person{ //parent class or base class or suoer class
    public String name;
    public int age;
    public String address;
}
// deriver class or sub class or child class
class Student extends person{
    public int Marks;
    public String Grade;  
        Student(String name, int age, String address, int Marks , String Grade){
            this.name = name;
            this.age = age;
            this.address = address;
            this.Marks = Marks;
            this.Grade = Grade;
        }
        public void display(){
            System.out.println("name    is :: "+name);
            System.out.println("age     is :: "+age);
            System.out.println("address is :: "+address);
            System.out.println("Marks   is :: "+Marks);
            System.out.println("Grade   is :: "+Grade);
        }
    }
    public class Inheritance_extend {
        public static void main(String[] args) {
        Student student1 = new Student("masood",25,"patna",999,"A+");
        student1.display();
    }
    
}
