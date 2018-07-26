package board.v2.u4.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import board.v2.u4.vo.BoardVO;

public class BoardDAO {
	
	// 게시물 저장 공간
	private ArrayList<BoardVO> boardList = null;
	// 게시물이 저장되어 있는 파일명
	private String filePath = "board.txt";
	private File f;
	// 파일의 수정 시간을 저장
	private long oriModifyTime;
	// 파일 사이즈를 저장
	private long oriSize;
	
	public BoardDAO( ) {
		boardList = new ArrayList<BoardVO>();
		f = new File(filePath);	
		oriModifyTime = f.lastModified();
		oriSize       = f.length();
		// 최초 객체 생성 시 파일에 저장되어 있는 게시물 정보를 리스트에 저장한다.
		loading();
	}
	
	/**
	 * 파일에서 주소록 정보를 리스트에 저장한다.
	 */
	public void loading( ) {
		boardList.clear();
		try (
			FileReader fr = new FileReader( f );
			BufferedReader br = new BufferedReader( fr );
		) {
			String str = null;
			while( ( str = br.readLine()) != null ) {
				String [] bArr = str.split(":");
				if(bArr.length == 0) {
					break;
				}
				BoardVO board = new BoardVO(
						Integer.parseInt(bArr[0]),   // 번호
						bArr[1],   // 글쓴이
						bArr[2],   // 제목
						bArr[3]    // 등록일
				);
				boardList.add(board);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * 파일의 내용이 변경되었는지 확인
	 * - 파일의 사이즈와 파일의 마지막 수정시간을 비교하여 체크
	 * @return
	 */
	public boolean isChange( ) {
		boolean flag = false;
		File f  = new File(filePath );	
		if (oriModifyTime != f.lastModified() || oriSize != f.length()) {
			System.out.println("파일의 내용이 변경되었읍니다.");
			oriModifyTime = f.lastModified();
			oriSize       = f.length();
			flag = true;
		}
		return flag; 
	}	
	
	/**
	 * 전체 게시글을 조회하는 기능 
	 */
	public ArrayList<BoardVO> selectBoard() {
		return boardList;
	}
	
	/**
	 * 게시글 번호에 해당하는 글을 조회하는 기능
	 */
	public BoardVO selectOneBoard(BoardVO board) {
		for (BoardVO vo : boardList) {
			if (vo.getNo() == board.getNo()) {
				return vo;	
			}
		}
		return null;
	}
	
	/**
	 * 게시글을 등록하는 기능
	 */
	public void insertBoard(BoardVO board) {
		
		if(isChange()) loading();
		
		boardList.add(board);
		try (
			FileWriter     fw = new FileWriter( filePath, true);
			BufferedWriter bw = new BufferedWriter( fw );
		) {
			bw.write(board.getNo() + ":" + board.getWriter() + ":" + board.getTitle() + ":" + board.getRegDate());
			bw.newLine();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 주소정보 리스트에 있는 내용을 파일에 저장
	 * @return
	 */
	private void boardFilWrite() {
		try (
			FileWriter     fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
		) {
			for(BoardVO board : boardList) {
				bw.write(board.getNo() + ":" + board.getWriter() + ":" + board.getTitle() + ":" + board.getRegDate());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
		
	
	/**
	 * 게시글 수정 기능
	 */
	public boolean updateBoard(BoardVO board) {
		if(isChange()) loading();

		if (boardList == null || boardList.isEmpty()) return false;
		
		boolean searchFlag = false;
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				searchFlag = true;
				vo.setTitle(board.getTitle());
				break;
			}
		}
		
		if(searchFlag == true) boardFilWrite();
		
		return searchFlag;
	}
	
	/**
	 * 게시글 삭제 기능
	 */
	public boolean deleteBoard(BoardVO board) {
		if(isChange()) loading();
		
		if (boardList == null || boardList.isEmpty()) return false;
		
		boolean searchFlag = false;
		
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				searchFlag = true;
				boardList.remove(vo);
				break;
			}
		}
		
		if(searchFlag == true) boardFilWrite();
		
		return searchFlag;		
	}
}








