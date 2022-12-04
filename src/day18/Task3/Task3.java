package day18.Task3;

public class Task3 {

    public static void main(String[] args) {

        Node root = new Node(20);

        int [] nums = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int element: nums) {
            Node.childNode(element, root);
        }
        dfs(root);

    }

    public static void dfs(Node node){

        if (node == null){
            return;
         }
        dfs(node.getLeftNode());
        System.out.println(node.getValue());
        dfs(node.getRightNode());

    }

}
