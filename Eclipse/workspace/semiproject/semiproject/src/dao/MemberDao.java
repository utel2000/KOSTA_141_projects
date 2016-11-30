package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import service.FactoryService;
import vo.MemberVO;
import vo.PagingVO;

public class MemberDao {
	private static MemberDao dao;

	public static synchronized MemberDao getDao() {
		if (dao == null)
			dao = new MemberDao();
		return dao;
	}

	// 로그인
	public MemberVO loginChk(MemberVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		MemberVO resVo = ss.selectOne("member.loginchk", vo);
		ss.close();
		return resVo;
	}
	
	// 로그인 : 아이디 찾기
	public String idfind(MemberVO vo){
		SqlSession ss = FactoryService.getFactory().openSession();
		String res = ss.selectOne("member.idfind", vo);
		ss.close();
		return res;	
	}
	
	// 로그인 : 비밀번호 찾기
	public String pwdfind(MemberVO vo){
		SqlSession ss = FactoryService.getFactory().openSession();
		String res = ss.selectOne("member.pwdfind", vo);
		ss.close();
		return res;
	}

	// 회원가입
	public void memberJoin(MemberVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("member.add", vo);
		ss.close();
	}
	
	// 회원가입 : 아이디 중복확인
	 public int checkId(String m_id) {
	  SqlSession ss = FactoryService.getFactory().openSession();
	  int check = ss.selectOne("member.checkId", m_id);
	  ss.close();
	  return check;
	 }
	 
	// 회원 : 마이페이지(이미지)
	public String mypageimg(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		String res = ss.selectOne("member.mypageimg", id);
		System.out.println("[Dao_mypageimg] : " + res);
		ss.close();
		return res;
	}

	// 회원 : 마이페이지(회원정보)
	public MemberVO getMypage(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		MemberVO vo = ss.selectOne("member.mypage", id);
		ss.close();
		return vo;
	}
	
	// 회원 : 정보수정(이미지)
	public void memberupdateimg(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.update("member.memberupdateimg", id);
		ss.close();
	}
	
	// 회원 : 정보수정(회원정보)
	public void memberupdate(MemberVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("member.memberupdate", vo);
		System.out.println("[Dao_memberupdate] id : " + vo.getM_id());
		System.out.println("[Dao_memberupdate] img : " + vo.getM_img());
		ss.close();
	}
	
	// 회원 : 탈퇴
	public void delete(MemberVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		System.out.println("삭제아이디 Dao : " + vo);
		ss.delete("member.memberdelete", vo);
		ss.close();
	}

	// 관리자 : 회원정보
	public List<MemberVO> getList(PagingVO pvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<MemberVO> list = ss.selectList("member.managerList", pvo);
		ss.close();
		return list;
	}

	public int getTotal() {
		SqlSession ss = FactoryService.getFactory().openSession();
		int num = ss.selectOne("member.total");
		ss.close();
		return num;
	}

	// 관리자 : 회원 상세보기(이미지)
	public String getDetailimg(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		String res = ss.selectOne("member.detailimg", id);
		System.out.println("[Dao]상세보기 사진 : " + res);
		ss.close();
		return res;
	}

	// 관리자 : 회원 상세보기(회원정보)
	public MemberVO getDetail(int m_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		System.out.println("[Dao_Detail]SessionOpen");

		MemberVO v = ss.selectOne("member.detail", m_num);
		System.out.println("[Dao_Detail]id : " + m_num);
		ss.close();
		System.out.println("[Dao_Detail]Close완료");
		return v;
	}

	// 관리자 : 회원정보 삭제
	public void managerDelete(String id) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.delete("member.managerdelete", id);
		System.out.println("[Dao_Delete]id : " + id);
		ss.close();
	}
}