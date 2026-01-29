import java.util.Scanner;

public class Kruskal_Algo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int num = sc.nextInt();

        int[][] matrix = new int[num][num];
        int[] parent = new int[num];

        // Read adjacency matrix
        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = sc.nextInt();
            }
            parent[i] = i;   // initialize components
        }

        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int count = 0;
        int totalCost = 0;

        System.out.println("\nEdges in Minimum Spanning Tree:");

        while (count < num - 1) {

            int min = 999;
            int u = 0, v = 0;

            // Find minimum edge
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (matrix[i][j] != 0 && matrix[i][j] < min) {
                        min = matrix[i][j];
                        u = i;
                        v = j;
                    }
                }
            }

            int uComp = parent[u];
            int vComp = parent[v];

            // Check for cycle
            if (uComp != vComp) {
                System.out.println(u + " - " + v + " : " + min);
                totalCost += min;
                count++;

                // Union
                for (int i = 0; i < num; i++) {
                    if (parent[i] == uComp) {
                        parent[i] = vComp;
                    }
                }
            }

            // Mark edge as used
            matrix[u][v] = matrix[v][u] = 999;
        }

        System.out.println("\nTotal cost = " + totalCost);


    }
}
