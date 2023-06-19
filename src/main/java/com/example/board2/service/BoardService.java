package com.example.board2.service;

import java.util.List;

import com.example.board2.dto.Board;

public interface BoardService {
	public int maxNum() throws Exception;
	
	public void insertData(Board board) throws Exception;
	
	public int getDataCount(String searchKey, String searchValue) throws Exception;
	
	public List<Board> getlists(String searchKey, String searchValue, int start, int end) throws Exception;
}
