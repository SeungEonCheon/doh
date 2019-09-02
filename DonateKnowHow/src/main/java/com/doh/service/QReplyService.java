package com.doh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.doh.domain.QReplyVO;
import com.doh.mapper.QReplyMapper;

public interface QReplyService {	
	List<QReplyVO> replyImpl(int q_no);
	void insertRImpl(QReplyVO rvo);
	void updateRImpl(int a_no, String a_content);
	void deleteRImpl(int a_no);
	int checkRImpl(int a_no);
}
