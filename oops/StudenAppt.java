class student{
    private int id;
    private int rollnb;
    private String name;
    private String Branch;
    public void setid(int id){
        this.id = id;
    }
    public void Setrollnb(int rollnb){
        this.rollnb = rollnb;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setBranch(String Branch){
        this.Branch = Branch;
    }

    public int getid(){
        return id;
    }
    public int getrollnb(){
        return rollnb;
    }
    public String getname(){
        return name;
    }
    public String getBranch(){
        return Branch;
    }
    
}
public class StudenAppt {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setid(101);
        s1.Setrollnb(01);
        s1.setname("Masood");
        s1.setBranch("information Technology");

        System.out.println("Student id :"+s1.getid());
        System.out.println("Student roll no :"+s1.getrollnb());
        System.out.println("Student name :"+s1.getname());
        System.out.println("Student branch :"+s1.getBranch());
        
    }
}
