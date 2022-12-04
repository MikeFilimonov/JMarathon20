package day18.Task3;

public class Node {

    private int value;
    private Node leftNode;
    private Node rightNode;

    public Node(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public static Node childNode(int value, Node node){

        if (node == null){
            return new Node(value);
        }

        if (value == node.getValue())
            return node;

        if (value > node.getValue()){
            node.setRightNode(childNode(value, node.getRightNode()));
        }
        if(value < node.getValue()){
             node.setLeftNode(childNode(value, node.getLeftNode()));
        }
        return node;
    }
}
