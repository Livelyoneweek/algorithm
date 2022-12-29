package study.myReStudy;

import java.util.ArrayList;

class Node5_7 {

    private int index;
    private int distance;

    public Node5_7(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.print("(" + this.index + "," + this.distance + ") ");
    }
}

public class re5_7 {

    // 행(Row)이 3개인 인접 리스트 표현
    public static ArrayList<ArrayList<Node5_7>> graph = new ArrayList<ArrayList<Node5_7>>();

    public static void main(String[] args) {
        // 그래프 초기화
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Node5_7>());
        }

        // 노드 0에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(0).add(new Node5_7(1, 7));
        graph.get(0).add(new Node5_7(2, 5));

        // 노드 1에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(1).add(new Node5_7(0, 7));

        // 노드 2에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(2).add(new Node5_7(0, 5));

        // 그래프 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
    }

}