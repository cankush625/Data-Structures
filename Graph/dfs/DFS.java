package Graph.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cankush
 * Created by Ankush Chavan on 04/02/2020
 */
public class DFS {
    static class Node {
        int key;
        List<Node> neighbours;
        boolean visited;

        // Constructor
        public Node(int key, boolean visited) {
            this.key = key;
            this.visited = visited;
            this.neighbours = new ArrayList<>();
        }

        // Method to add neighbour node to the list
        public void addNeighbour(Node neighbourNode) {
            this.neighbours.add(neighbourNode);
        }

        // Returning the list of the neighbour nodes
        public List<Node> getNeighbours() {
            return neighbours;
        }
    }

    /**
     * DFS implementation
     * @param start the starting node from where the traversing should begin
     */
    public void dfs(Node start) {
        List<Node> neighbours = start.getNeighbours();
        System.out.print(start.key + " ");
        start.visited = true;

        for (int i = 0; i < neighbours.size(); i++) {
            Node n = neighbours.get(i);
            if (n != null && !n.visited) {
                dfs(n);
            }
        }
    }

    public static void main(String[] args) {
        // Creating nodes
        Node node1 = new Node(10, false);
        Node node2 = new Node(20, false);
        Node node3 = new Node(30, false);
        Node node4 = new Node(40, false);
        Node node5 = new Node(50, false);
        Node node6 = new Node(60, false);

        // Connecting nodes to each other by adding them as the neighbours of each other
        node1.addNeighbour(node2);
        node1.addNeighbour(node4);
        node2.addNeighbour(node3);
        node2.addNeighbour(node5);
        node3.addNeighbour(node4);
        node4.addNeighbour(node5);
        node5.addNeighbour(node1);
        node5.addNeighbour(node6);
        node6.addNeighbour(node2);
        node6.addNeighbour(node1);

        DFS dfs = new DFS();
        System.out.print("Visited nodes are: ");
        dfs.dfs(node1);
    }
}
