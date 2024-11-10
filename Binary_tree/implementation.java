class Node{
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}
public class implementation{
    public static void main(String[] args) {
        Node a = new Node(13);
        Node b = new Node(41);
        Node c = new Node(11);
        Node d = new Node(14);
        Node e = new Node(19);
        Node f = new Node(17);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        Node g = new Node(121);
        Node h = new Node(87);

        c.left = g;
        d.right = h;

        // System.out.println(b.val);
        // System.out.println(a.left.val);
        display(a);
        System.out.println();

        // sum of tree
        System.out.println("sum of the tree : "+sumOfTree(a));

        // max of tree
        System.out.println("max of the tree : "+MaxOfTree(a));

        //size of the tree
        System.out.println("size of the tree : "+SizeOfTree(a));

        //levels of tree
        System.out.println("Level of the tree : "+levels(a));
        
    }
    private static void display(Node root){
        if(root == null) return; 
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
        
    }
    public static int SizeOfTree(Node root){
        if(root == null) return 0;
        return 1 + SizeOfTree(root.left) + SizeOfTree(root.right);
    }

    public static int sumOfTree(Node root){
        if(root == null) return 0;
        return root.val + sumOfTree(root.left) + sumOfTree(root.right);
    }

    public static int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),  levels(root.right));
    }

    public static int MaxOfTree(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(MaxOfTree(root.left), MaxOfTree(root.right)));
    }

}