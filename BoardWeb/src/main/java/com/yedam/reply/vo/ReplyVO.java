package com.yedam.reply.vo;
//순서 1 sql developer data로 vo만들기 (같은 이름 사용) => mybatis-config.xml 들어가서 mapper, alias설정 후 mapper생성 
import java.util.Date;

import lombok.Data;
@Data
public class ReplyVO {
	private int replyNo;
	private int boardNo;
	private String reply;
	private String replyer;
	private Date replyDate;
	private String name;

}

