package com.spring.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	//怨듯넻 �쁺�뿭 : �떆�옉 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//怨듯넻 �쁺�뿭 : �걹 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	
	//�뭾�쁺 : �떆�옉 ==============================================
	@Override
	public void service_poong() {
		
		String a = "jeongsu";
		System.out.println(a);// 7.6 수정
		System.out.println("�븘臾� �쓽誘� �뾾�씠 洹몃깷 merge �븯�젮怨� 留뚮뱾�뿀�떎.");
		
		return ;
	}
	
	//�뭾�쁺 : �걹 ==============================================

	//�젙�닔 : �떆�옉 ########################################
	//
	
	//�젙�닔 : �걹 ########################################
}
