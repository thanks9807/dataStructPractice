package tree;

public class Node implements TreePrinter.PrintableNode {
    Integer data;
    Node left;
    Node right;

    public Node(Integer data) {
        this.data = data;
        left = null;
        right = null;
    }

    @Override
    public TreePrinter.PrintableNode getLeft() {
        return this.left;
    }

    @Override
    public TreePrinter.PrintableNode getRight() {
        return this.right;
    }

    @Override
    public String getText() {
        return "["+this.data+"]";
    }
}
