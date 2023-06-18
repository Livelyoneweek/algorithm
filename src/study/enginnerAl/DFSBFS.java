package study.enginnerAl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent; // 인접한노드
        boolean marked; //방문했는지 확인

        Node(int data) {
            this.data=data;
            this.marked=false;
            adjacent= new LinkedList<Node>();
        }
    }
    Node[] nodes; //그래프 저장할 노드

    Graph(int size) {
        nodes= new Node[size]; // 간단하게 하기 위해 사이즈 고정
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }
    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    void bfs() {
        bfs(0);
    }

    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        root.marked = true;
        while (!queue.isEmpty()) {
            Node r = queue.poll();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.add(n);
                }
            }
            visit(r);
        }
    }

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked = true;

        while (!stack.isEmpty()) {
            Node r = stack.pop();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    void dfsR() {
        dfsR(0);
    }
    //재귀호출 사용
    void dfsR(Node r) {
        if(r== null) return;
        r.marked = true;
        visit(r);
        for (Node n : r.adjacent) {
            if (n.marked == false) {
                dfsR(n);
            }
        }
    }

    // index받는걸로도
    void dfsR(int index) {
        Node r = nodes[index];
        if(r== null) return;
        r.marked = true;
        visit(r);
        for (Node n : r.adjacent) {
            if (n.marked == false) {
                dfsR(n);
            }
        }
    }

    void visit(Node n) {
        System.out.print(n.data+" ");
    }
}


public class DFSBFS {

    /**
     * Depth-First Search (깊이 우선 탐색)
     * 루트 기준으로 차일드 하나를 가장 아래차일드까지 탐색
     * 이진트리탐색에서 inorder, preorder, postorder등이 이에 해당
     * stack 또는 재귀함수로 구현
     * 
     * Breadth-First Search 줄임말 (넓이 우선 검색)
     * 루트 기준으로 바로 아래 차일드들 다 방문하고
     * 그 아래 레벨 차일드들 다 방문하고
     * 그 아래 레벨 차일드들 방문하고 하는것
     * 큐를 이용해서 구현
     *
     *      0
     *    /
     *  1 --   3      7
     *  |   /  | \   /
     *  |  /   |   5
     *  2  --  4    \
     *               6 - 8
     */

    public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.addEdge(6,8);
        graph.dfsR();
    }
}
