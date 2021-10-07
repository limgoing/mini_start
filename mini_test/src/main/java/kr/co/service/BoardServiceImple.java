package kr.co.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dao.BoardDAO;

@Service
public class BoardServiceImple implements BoardService {
	@Autowired
	BoardDAO dao;
	
	@Override
	public void write(Map<String, Object> map) throws Exception {
		dao.write(map);
	}

}
