package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    char data;
    Node left;
    Node right;

    Node(char data) {
        this.data = data;
    }
}

class Tree {
    Node root;

    public void createNode(char data, char leftData, char rightData) {
        if (root == null) {
            root = new Node(data);

            if (leftData != '.') {
                root.left = new Node(leftData);
            }
            if (rightData != '.') {
                root.right = new Node(rightData);
            }
        } else {
            searchNode(root, data, leftData, rightData);
        }
    }
    public void searchNode(Node root, char data, char leftData, char rightData){
        if (root == null) {
            return;
        } else if (root.data == data) {
            if (leftData != '.') {
                root.left = new Node(leftData);
            }
            if (rightData != '.'){
                root.right = new Node(rightData);
            }
        } else {
            searchNode(root.left, data, leftData, rightData); // left 재귀탐색
            searchNode(root.right, data, leftData, rightData); // right 재귀탐색
        }
    }

    // 전위 순회 = V -> L -> R
    public void preorder(Node root){
        System.out.print(root.data); // 가운데
        if (root.left != null) preorder(root.left); // 왼쪽
        if (root.right != null) preorder(root.right); // 오른쪽
    }
    // 중위 순회 = L -> V -> R
    public void inorder(Node root){
        if (root.left != null) inorder(root.left); // 왼쪽
        System.out.print(root.data); // 가운데
        if (root.right != null) inorder(root.right); // 오른쪽
    }
    // 후위 순회 = L -> R -> V
    public void postorder(Node root){
        if (root.left != null) postorder(root.left); // 왼쪽
        if (root.right != null) postorder(root.right); // 오른쪽
        System.out.print(root.data); // 가운데
    }
}

public class Q1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nodeNum = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        for (int i = 0; i < nodeNum; i++) {
            char[] data;
            data = br.readLine().replaceAll(" ", "").toCharArray();
            tree.createNode(data[0],data[1],data[2]);
        }

        tree.preorder(tree.root);
        System.out.println();

        tree.inorder(tree.root);
        System.out.println();

        tree.postorder(tree.root);

        br.close();
    }
}
