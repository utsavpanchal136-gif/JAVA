import java.util.Scanner;

public class Prims_Algo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] cost = new int[n][n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter adjacency matrix (use 99 for no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        // Start from vertex 0
        visited[0] = true;

        int edgeCount = 0;
        int totalCost = 0;

        System.out.println("\nEdges in Minimum Spanning Tree:");

        while (edgeCount < n - 1) {

            int min = 99;
            int u = -1, v = -1;

            // Find minimum edge from visited to unvisited
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!visited[j] && cost[i][j] < min) {
                            min = cost[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }

            // Select the edge
            visited[v] = true;
            edgeCount++;
            totalCost += min;

            System.out.println(u + " - " + v + " : " + min);
        }

        System.out.println("\nTotal cost of MST = " + totalCost);


    }
}
