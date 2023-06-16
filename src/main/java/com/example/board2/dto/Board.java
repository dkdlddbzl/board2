package com.example.board2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
	private int num;
	private String name;
	private String pwd;
	private String email;
	private String subject;
	private String content;
	private String ipAddr; //게시물 등록자의 ip주소
	private String created; //게시물 생성날짜
	private int hitCount; //조회수
}
