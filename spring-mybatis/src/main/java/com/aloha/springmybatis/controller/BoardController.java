package com.aloha.springmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aloha.springmybatis.dto.Board;
import com.aloha.springmybatis.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
	private BoardService boardService;
 
    /**
	 * 게시글 목록 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/list")
	public String list(Model model) throws Exception {
		List<Board> boardList = boardService.list();
		model.addAttribute("boardList", boardList);
		return "board/list";
	}

	
	/**
	 * 게시글 조회
	 * @param model
	 * @param no
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/read")
	public String select(Model model, @RequestParam("no") int no) throws Exception {
		Board board = boardService.select(no);
		model.addAttribute("board", board);
		return "board/read";
	}

	
	// 게시글 등록			
	@GetMapping("/insert")
	public String insert() throws Exception {
		return "board/insert";
	}
	
	// 게시글 등록 처리		
	@PostMapping("/insert")
	public String insertPro(Board board) {

		try {
			int result = boardService.insert(board);
			if (result > 0) 
				return "redirect:/board/list";
			else 
				return "redirect:/board/insert?error";
		} catch (Exception e) {
			return "redirect:/board/insert?error";
		}

	}

	// 게시글 수정			
	@GetMapping("/update")		
	public String update(Model model, @RequestParam("no") int no) throws Exception {
		Board board = boardService.select(no);
		model.addAttribute("board", board);

		return "board/update";
	}
		
	// 게시글 수정 처리
	@PostMapping("/update")
	public String updatePro(Board board) throws Exception {
		int result = boardService.update(board);
		
        if( result == 0) 
            return "redirect:/board/update?no=" + board.getNo();
		return "redirect:/board/list";
	}
	
	/**
     * 게시글 삭제 처리
     * @param board
     * @return
     */
    @PostMapping("/delete")
    public String deletePro(@RequestParam("no") int no) throws Exception {        
        int result = boardService.delete(no);

        // 데이터 삭제 실패
        if( result == 0) 
            return "redirect:/board/delete?no=" + no;

        return "redirect:/board/list";
    }
    
}
