package datastructure;

import java.util.Scanner;

public class Dejktra_algorithm {
	int numofvertex = 0;

	public int[][] getGraph() {
		Scanner scr = new Scanner(System.in);

		int[][] graph = new int[10][10];
		System.out.println("Enter the totle number of vertex");
		numofvertex = scr.nextInt();

		for (int i = 0; i < numofvertex; i++) {
			System.out.println("Enter the distances for " + i);
			for (int j = 0; j < numofvertex; j++) {
				System.out.println("Enter the destance from " + i + "->" + j);
				graph[i][j] = scr.nextInt();
			}
		}
		return graph;
	}

	int minDistance(int dist[], boolean visited[]) {
		// Initialize min value
		int min = Integer.MAX_VALUE, min_index = -1;

		for (int v = 0; v < numofvertex; v++)
			if (visited[v] == false && dist[v] <= min) {
				min = dist[v];
				min_index = v;
			}
		return min_index;
	}

	public void getShortestDistance(int[][] graph, int src) {
		boolean[] visited = new boolean[numofvertex];
		int[] Dist = new int[numofvertex];
		int min_index = minDistance(Dist, visited);

		for (int i = 0; i < numofvertex; i++) {
			Dist[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		Dist[src]=0;
		
		
		for (int row = 0; row < numofvertex; row++) {
			for (int colomn = 0; colomn < numofvertex; colomn++) {
				if (!visited[row]) {

				}
			}
		}

	}

	public static void main(String[] args) {

		Dejktra_algorithm dj = new Dejktra_algorithm();
		dj.getGraph();

	}
}
