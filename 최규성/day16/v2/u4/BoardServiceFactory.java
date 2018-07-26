package board.v2.u4;

import board.v2.u4.service.BoardService;

public class BoardServiceFactory {
	private static BoardService service = null;
	public static synchronized BoardService getInstance() {
		if (service == null) {
			service = new BoardService();
			return service;
		}
		return service;
	}
}
