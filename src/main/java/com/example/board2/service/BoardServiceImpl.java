package com.example.board2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board2.dao.BoardDao;
import com.example.board2.dto.Board;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao boardMapper;
	
	@Override
	public int maxNum() throws Exception {
		return boardMapper.maxNum();
	}

	@Override
	public void insertData(Board board) throws Exception {
		boardMapper.insertData(board);
	}

	@Override
	public int getDataCount(String searchKey, String searchValue) throws Exception {
		return boardMapper.getDataCount(searchKey, searchValue);
		
	}

	@Override
	public List<Board> getlists(String searchKey, String searchValue, int start, int end) throws Exception {
		return boardMapper.getlists(searchKey, searchValue, start, end);
	}

	@Override
	public void updateHitCount(int num) throws Exception {
		boardMapper.updateHitCount(num);
	}

	@Override
	public Board getReadData(int num) throws Exception {
		return boardMapper.getReadData(num);
	}

	@Override
	public void updateData(Board board) throws Exception {
		boardMapper.updateData(board);
	}

	@Override
	public void deleteData(int num) throws Exception {
		boardMapper.deleteData(num);
	}

}
