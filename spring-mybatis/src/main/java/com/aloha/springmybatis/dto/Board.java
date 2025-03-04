package com.aloha.springmybatis.dto;

import java.util.Date;

import lombok.Data;

/**
 * Board 
 * - 게시글 정보
 */
@Data
public class Board {
    private int no;        
    private String title;
    private String writer;
    private String content;
    private Date regDate;
    private Date updDate;
    private int views;

    public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	  }    

}
 