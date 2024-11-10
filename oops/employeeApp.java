class Employee{
    private int id;
    private String name;
    private int age;
    private String Address;
   
    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }

    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getAddress(){
        return Address;
    }
}
public class employeeApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setid(100);
        emp1.setname( "massod");
        emp1.setage(25);
        emp1.setAddress("patna");

        System.out.println("Employee Id :"+emp1.getid());
        System.out.println("Employee name :"+emp1.getname());
        System.out.println("Employee age :"+emp1.getage());
        System.out.println("Employee Address :"+emp1.getAddress());


        
    }
}
