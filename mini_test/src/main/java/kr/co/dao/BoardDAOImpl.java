package kr.co.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void write(Map<String, Object> map) throws Exception {
		sqlSession.insert("boardMapper.insert", map);
	}

}
