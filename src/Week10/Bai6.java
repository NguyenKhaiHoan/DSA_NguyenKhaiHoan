package Week10;

public class Bai6 {
    public static TreeNode insert(TreeNode root,int val) {
        if(root == null) {
            root = new TreeNode();
            root.val = val;
            root.ht = setHeight(root);
            return root;
        }
        if(val <= root.val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        int balance = height(root.left) - height(root.right);

        if(balance > 1) {
            if(height(root.left.left) >= height(root.left.right)) {
                root = rightRotation(root);
            }
            else {
                root.left = leftRotation(root.left);
                root = rightRotation(root);
            }
        }
        else if(balance < -1) {
            if(height(root.right.right) >= height(root.right.left)) {
                root = leftRotation(root);
            }
            else {
                root.right = rightRotation(root.right);
                root = leftRotation(root);
            }
        }
        else {
            root.ht = setHeight(root);
        }
        return root;
    }

    private static TreeNode rightRotation(TreeNode root) {
        TreeNode newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;
        root.ht = setHeight(root);
        newRoot.ht = setHeight(newRoot);
        return newRoot;
    }

    private static TreeNode leftRotation(TreeNode root) {
        TreeNode newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;
        root.ht = setHeight(root);
        newRoot.ht = setHeight(newRoot);
        return newRoot;
    }

    private static int height(TreeNode root) {
        if(root == null)
            return -1;
        else
            return root.ht;
    }

    private static int setHeight(TreeNode root) {
        if(root == null) {
            return -1;
        }
        else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }
}
