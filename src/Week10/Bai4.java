package Week10;

public class Bai4 {
    public static Node lca(Node root, int v1, int v2) {
        if (root == null)
            return null;
        if (root.data > v1 && root.data > v2)
            return lca(root.left, v1, v2);
        if (root.data < v1 && root.data < v2)
            return lca(root.right, v1, v2);
        return root;
    }
}
