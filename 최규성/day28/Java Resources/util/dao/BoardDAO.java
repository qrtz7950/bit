package util.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionFactory;
import util.JDBCClose;
import util.vo.BoardVO;

/*
 * Oracle의 t_board테이블을 접근하여 CRUD하는 기능을 가지는 기능클래스
 * 
 */
public class BoardDAO {
	/*
	 * t_board테이블의 전체 게시글을 조회하는 기능
	 */
	public List<BoardVO> selectAll(){
		List<BoardVO> boardList = new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt =null;
		
		try {
		conn = ConnectionFactory.getConnection();

		StringBuilder sql = new StringBuilder();
		sql.append("select no, title, writer, to_char(reg_date,'yyyy-mm-dd') as reg_date ");
		sql.append("	from t_board ");
		sql.append("  order by no desc ");
		
		pstmt = conn.prepareStatement(sql.toString());
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			
			int no = rs.getInt("no");
			String title = rs.getString("title");
			String writer = rs.getString("writer");
			String regDate = rs.getString("reg_date");
			
			BoardVO board = new BoardVO();
			board.setNo(no);
			board.setTitle(title);
			board.setWriter(writer);
			board.setRegDate(regDate);
			
			boardList.add(board);
		}
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn,pstmt);
		}
		
		return boardList;
		
	}
	/*
	 * 번호에 해당하는 게시물을 조회하는 기능
	 */
	public BoardVO selectByNo(int boardNo) throws Exception {
		
		Connection conn = ConnectionFactory.getConnection();
    	StringBuilder sql = new StringBuilder();
    	sql.append("select no,title,writer,content,view_cnt ");
    	sql.append("	, to_char(reg_date, 'yyyy-mm-dd') reg_date ");
    	sql.append("  from t_board ");
    	sql.append(" where no = ? ");
    	
    	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
    	pstmt.setInt(1,boardNo);
    	
    	ResultSet rs = pstmt.executeQuery();
    	rs.next();
    	
    	int no = rs.getInt("no");
    	String title = rs.getString("title");
    	String writer = rs.getString("writer");
    	String content = rs.getString("content");
    	int viewCnt = rs.getInt("view_cnt");
    	String regDate = rs.getString("reg_date");
    	
    	BoardVO board = new BoardVO(no, title, writer, content,viewCnt,regDate);
    	
    	JDBCClose.close(conn, pstmt);
    	
    	return board;
	}
	
	/*
	 * 게시글을 등록하는 기능
	 */
	
	public void insert(BoardVO board) {
		Connection  conn = null;
		PreparedStatement  pstmt = null;
		try {
			conn = ConnectionFactory.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("insert into t_board(no,title,writer,content)");
			sql.append("	values(seq_t_board_no.nextval,?,?,?)");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,board.getTitle());
			pstmt.setString(2,board.getWriter());
			pstmt.setString(3,board.getContent());
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
		JDBCClose.close(conn,pstmt);
		}
	}
}
































