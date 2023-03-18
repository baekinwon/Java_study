package Codeup;
import java.util.Scanner;

public class codeup_1099 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] maze = new int[10][10];
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				maze[i][j] = scan.nextInt();
			}
		}
		
		int x = 1, y = 1;
		
		for(int i = 0;i<22;i++) {
			if(maze[y][x]==0) {
				maze[y][x] = 9;
				x++;
			}
			else if(maze[y][x]==1){
				y++;
				x--;
			}
			else if(maze[y][x]==2) {
				maze[y][x] = 9;
				break;
			}
			else if(maze[y+1][x]==1 && maze[y][x+1]==1) {
				if(maze[y][x]==0) maze[y][x]=9;
				break;
			}
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.printf("%d ",maze[i][j]);
			}
			System.out.println();
		}
	}

}
