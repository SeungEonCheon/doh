package com.doh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doh.domain.QReplyVO;
import com.doh.mapper.QReplyMapper;

@Service
public class QReplyServiceImpl implements QReplyService {
	@Autowired
	private QReplyMapper mapper;
	
	@Override
	public List<QReplyVO> replyImpl(int q_no){
		List<QReplyVO> reply = mapper.reply(q_no);
		return reply;
	}
	
	@Override
	public void insertRImpl(QReplyVO rvo) {
		mapper.insertR(rvo);
	}
	
	@Override
	public void updateRImpl(int a_no, String a_content) {
		QReplyVO rvo = new QReplyVO();
		rvo.setA_no(a_no);
		rvo.setA_content(a_content);
		mapper.updateR(rvo);
	}
	
	@Override
	public void deleteRImpl(int a_no) {
		mapper.deleteR(a_no);
	}
	
	@Override
	public int checkRImpl(int a_no) {
		return mapper.checkR(a_no);
	}

}
