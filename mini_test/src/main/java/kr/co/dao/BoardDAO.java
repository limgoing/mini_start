package kr.co.dao;

import java.util.Map;

public interface BoardDAO {
	// 게시글 작성
	public void write(Map<String, Object> map) throws Exception;
}
