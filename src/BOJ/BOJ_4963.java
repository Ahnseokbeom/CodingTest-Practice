package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4963 {
	static int[][] arr;
	static boolean[][] check;
	static int[] dx = {-1,0,1,-1,1,-1,0,1};
	static int[] dy = {-1,-1,-1,0,0,1,1,1};
	static int w,h;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if(w==0 && h==0) break;
			arr = new int[h][w];
			check = new boolean[h][w];
			for(int i = 0;i<h;i++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int j = 0;j<w;j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int count = 0;
			for(int i = 0;i<h;i++) {
				for(int j = 0;j<w;j++) {
					if(!check[i][j] && arr[i][j] == 1) {
						count++;
						dfs(i,j);
					}
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
	public static void dfs(int x,int y) {
		check[x][y] = true;
		for(int i = 0;i<8;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx >= 0 && ny >=0 && nx < h && ny < w) {
				if(!check[nx][ny] && arr[nx][ny] ==1) dfs(nx,ny);
			}
		}
	}

}