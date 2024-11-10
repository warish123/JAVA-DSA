class Node{
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}
public class trasversal_tree {
    public static void pre_order(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        pre_order(root.left);
        pre_order(root.right);
    }
    public static void in_order(Node root){
        if(root == null) return;
        pre_order(root.left);
        System.out.print(root.val+" ");
        pre_order(root.right);
    }
    public static void post_order(Node root){
        if(root == null) return;
        pre_order(root.left);
        pre_order(root.right);
        System.out.print(root.val+" ");
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.left = h;
        c.left = f; c.right = g;
        f.right = i;
        pre_order(a);
        System.out.println();
        in_order(a);
        System.out.println();
        post_order(a);



    }
}
