package board.v2.u4;

import java.io.RandomAccessFile;

public class BoardSequence {
	public synchronized static int getNo() {
		int no = 0;
		try (
			RandomAccessFile seqFile = new RandomAccessFile("board_seq.txt", "rw");	
		) {
			int readNo = no = Integer.parseInt(seqFile.readLine().trim());
			seqFile.seek(0);
			seqFile.writeBytes(String.valueOf(++readNo));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return no;
	}
}

