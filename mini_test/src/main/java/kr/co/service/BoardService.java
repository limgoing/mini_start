package kr.co.service;

import java.util.Map;

public interface BoardService {
	// 게시글 작성
		public void write(Map<String, Object> map) throws Exception;
}
