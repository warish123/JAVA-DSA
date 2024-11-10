class Calculator {
    // method overloading ::(two or more method with same name but different arruguments)
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public void add(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }
}

class AdvancedCalculator {
    // var args :: 0 to n
    public void add(int... args) {
        int sum = 0;
        for (int data : args) {
            sum += data;
        }
        System.out.println("sum of var args :: " + sum);

    }
}

public class Method_overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(2, 3);
        c.add(2, 3, 4);
        c.add(2, 3, 4, 5);
        c.add(2, 3, 4, 5, 6);

        AdvancedCalculator ac = new AdvancedCalculator();
        ac.add();
        ac.add(2, 3);
        ac.add(2, 3, 4);
        ac.add(2, 3, 4, 5);
        ac.add(2, 3, 4, 5, 6);

    }
}
