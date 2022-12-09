package checkers;

public class checkerboard {
	public static void main(String[] args) {
		String board[][] = new String[8][8];
		for (int x = 1; x<=8; x++ ) {
			for (int y=1; y<=8; y++) {
				if ((x+y)%2==0){
					board[x-1][y-1]="X";
				}
				else {
					board[x-1][y-1]="0";
				}
			}
		}
		
		
		// 
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	public void move_piece(int starti, int startj, int endi, int endj) {
		
	}
}
