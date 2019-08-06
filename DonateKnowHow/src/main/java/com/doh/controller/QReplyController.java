package com.doh.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.doh.domain.QBoardVO;
import com.doh.domain.QReplyVO;
import com.doh.service.QReplyService;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("qreply")
public class QReplyController {
	private QReplyService rservice;	

	@GetMapping("/all/{q_no}")
	public List<QReplyVO> replyList(@PathVariable("q_no") int q_no, Model model){
		model.addAttribute("reply", rservice.replyImpl(q_no));
		System.out.println("-------   >  " +rservice.replyImpl(q_no));
		return rservice.replyImpl(q_no);
	}
	
}
