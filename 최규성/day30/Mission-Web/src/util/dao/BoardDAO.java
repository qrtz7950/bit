package util.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionFactory;
import util.JDBCClose;
import util.vo.BoardFileVO;
import util.vo.BoardVO;

/*
 * Oracle의 t_board테이블을 접근하여 CRUD하는 기능을 가지는 기능클래스
 * 
 */
public class BoardDAO {
	/*
	 * t_board테이블의 전체 게시글을 조회하는 기능
	 */
	public List<BoardVO> selectAll() {
		List<BoardVO> boardList = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = ConnectionFactory.getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, writer, to_char(reg_date,'yyyy-mm-dd') as reg_date ");
			sql.append("	from t_board ");
			sql.append("  order by no desc ");

			pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
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
		pstmt.setInt(1, boardNo);

		ResultSet rs = pstmt.executeQuery();
		rs.next();

		int no = rs.getInt("no");
		String title = rs.getString("title");
		String writer = rs.getString("writer");
		String content = rs.getString("content");
		int viewCnt = rs.getInt("view_cnt");
		String regDate = rs.getString("reg_date");

		BoardVO board = new BoardVO(no, title, writer, content, viewCnt, regDate);

		JDBCClose.close(conn, pstmt);

		return board;
	}

	/*
	 * 게시글을 등록하는 기능
	 */

	public void insert(BoardVO board) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = ConnectionFactory.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("insert into t_board(no,title,writer,content) ");
			sql.append("	values(?,?,?,?) ");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, board.getNo());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getWriter());
			pstmt.setString(4, board.getContent());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

	/*
	 * 게시물을 수정하는 기능
	 */

	public void update(BoardVO board) {

		StringBuilder sql = new StringBuilder();
		sql.append("update t_board ");
		sql.append("  set title =? , content =? ");
		sql.append("  where no ? ");

		try (
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			) {
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getNo());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 게시물을 삭제하는 기능
	 */

	public void delete(int no) {

		StringBuilder sql = new StringBuilder();
		sql.append("delete t_board ");
		sql.append("where no =? ");

		try (
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			) {
			pstmt.setInt(1, no);

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/*
	 * 조회수를 증가하는 기능
	 */

	public void updateViewCnt(int no) {

		StringBuilder sql = new StringBuilder();
		sql.append("update t_board ");
		sql.append("  set view_cnt = view_cnt + 1 ");
		sql.append(" where no =? ");
		try (
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			) {
			pstmt.setInt(1, no);

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * t_board 테이블에 저장할 일련번호 조회
	 */

	public int selectNo() {
		String sql = "select seq_t_board_no.nextVal from dual";

		try (
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			) {
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			return rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	//////////////////// t_board_file 과 관련된 CRUD //////////////////////

	/*
	 * 새로운 첨부파일을 저장하는 기능
	 */
	public void insertFile(BoardFileVO fileVO) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into t_board_file(no, board_no, file_ori_name, file_save_name, file_size) ");
		sql.append("  values(seq_t_board_file_no.nextval, ?, ?, ?, ?) ");

		try (
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			) {
			pstmt.setInt(1, fileVO.getBoardNo());
			pstmt.setString(2, fileVO.getFileOriName());
			pstmt.setString(3, fileVO.getFileSaveName());
			pstmt.setInt(4, fileVO.getFileSize());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * 게시판 번호에 해당하는 첨부파일 조회하는 기능
	 */
	public List<BoardFileVO> selectFileByNo(int boardNo) {

		List<BoardFileVO> fileList = new ArrayList<>();

		StringBuilder sql = new StringBuilder();
		sql.append("select no, board_no, file_ori_name, file_save_name, file_size ");
		sql.append("   from t_board_file ");
		sql.append("  where board_no = ? ");

		try (
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			) {
			pstmt.setInt(1, boardNo);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardFileVO fileVO = new BoardFileVO();
				fileVO.setNo(rs.getInt("no"));
				fileVO.setBoardNo(rs.getInt("board_no"));
				fileVO.setFileOriName(rs.getString("file_ori_name"));
				fileVO.setFileSaveName(rs.getString("file_save_name"));
				fileVO.setFileSize(rs.getInt("file_size"));

				fileList.add(fileVO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return fileList;
	}

	/*
	 * 첨부파일 삭제하는 기능
	 */

	public void deleteFiles(int boardNo) {
		StringBuilder sql = new StringBuilder();
		sql.append("delete t_board_file ");
		sql.append(" where board_no = ? ");

		try (
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			) {
			pstmt.setInt(1, boardNo);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
