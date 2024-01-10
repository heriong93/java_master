package com.yedam.member.command;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.yedam.common.Control;
import com.yedam.member.service.MemberService;
import com.yedam.member.serviceImpl.MemberServiceImpl;
import com.yedam.member.vo.MemberVO;

public class MemberAddJson implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.setCharacterEncoding("utf-8");
			resp.setContentType("text/json;charset=utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// 파일 업로드 포함
		String saveLoc = req.getServletContext().getRealPath("images"); // images폴더의 경로를 찾아 업로드 하겠습니다.폴더 위치에 없어서 만들어줌
		int maxSize = 1024 * 1024 * 5;
		MultipartRequest mr = null;
		// mr= 속성들 1.request 2.saveLoc 3.maxSize 4.인코딩 방식 5.중복이 있을 시 리네임 정책
		// 5.D:\JAVA_WS\.metadata\.plugins\org.eclipse.wst.server.core\tmp1\wtpwebapps\BoardWeb\images
		// 확인가능
		try {
			mr = new MultipartRequest(req, saveLoc, maxSize, "utf-8", new DefaultFileRenamePolicy());
			String id = mr.getParameter("id");
			String pw = mr.getParameter("pw");
			String name = mr.getParameter("name");
			String responsibility = "User";
			String image = mr.getFilesystemName("image");

			MemberVO vo = new MemberVO();
			vo.setId(id);
			vo.setPw(pw);
			vo.setName(name);
			vo.setResponsibility(responsibility);
			vo.setImage(image);

			MemberService svc = new MemberServiceImpl();

			Map<String, Object> map = new HashMap<>();
			if (svc.addMember(vo)) {
				map.put("retCode", "OK");
				map.put("vo", vo);
			} else {
				map.put("retCode", "NG");
			}
			Gson gson = new GsonBuilder().create();

			resp.getWriter().print(gson.toJson(map));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
