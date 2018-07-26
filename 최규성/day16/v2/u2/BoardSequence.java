package board.v2.u2;

public class BoardSequence {
	private static int no = 1;
	
	public synchronized static int getNo() {
		return no++;
	}
}
