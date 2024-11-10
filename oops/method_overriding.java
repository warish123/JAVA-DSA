class parent{
    public void property(){
        System.out.println("gold+cash+land+home");
    }
    public void marry(){
        System.out.println("relative girl");
    }

}
class child extends parent{

    // method overriding
    public void marry(){
        // Re- implementation
        System.out.println("Some other girl");
    }

}
public class method_overriding {
    public static void main(String[] args) {
        //Parent Object
        parent p1 = new parent();
        p1.property();
        p1.marry();

        System.out.println();
        // child Object
        child c1 = new child();
        c1.property();
        c1.marry();

        System.out.println();

        //child object
        parent p2 = new child();
        p2.property();
        p2.marry();

    }
    
}
