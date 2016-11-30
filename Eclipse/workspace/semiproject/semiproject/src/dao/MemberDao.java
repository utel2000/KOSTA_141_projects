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

	// �α���
	public MemberVO loginChk(MemberVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		MemberVO resVo = ss.selectOne("member.loginchk", vo);
		ss.close();
		return resVo;
	}
	
	// �α��� : ���̵� ã��
	public String idfind(MemberVO vo){
		SqlSession ss = FactoryService.getFactory().openSession();
		String res = ss.selectOne("member.idfind", vo);
		ss.close();
		return res;	
	}
	
	// �α��� : ��й�ȣ ã��
	public String pwdfind(MemberVO vo){
		SqlSession ss = FactoryService.getFactory().openSession();
		String res = ss.selectOne("member.pwdfind", vo);
		ss.close();
		return res;
	}

	// ȸ������
	public void memberJoin(MemberVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("member.add", vo);
		ss.close();
	}
	
	// ȸ������ : ���̵� �ߺ�Ȯ��
	 public int checkId(String m_id) {
	  SqlSession ss = FactoryService.getFactory().openSession();
	  int check = ss.selectOne("member.checkId", m_id);
	  ss.close();
	  return check;
	 }
	 
	// ȸ�� : ����������(�̹���)
	public String mypageimg(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		String res = ss.selectOne("member.mypageimg", id);
		System.out.println("[Dao_mypageimg] : " + res);
		ss.close();
		return res;
	}

	// ȸ�� : ����������(ȸ������)
	public MemberVO getMypage(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		MemberVO vo = ss.selectOne("member.mypage", id);
		ss.close();
		return vo;
	}
	
	// ȸ�� : ��������(�̹���)
	public void memberupdateimg(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.update("member.memberupdateimg", id);
		ss.close();
	}
	
	// ȸ�� : ��������(ȸ������)
	public void memberupdate(MemberVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("member.memberupdate", vo);
		System.out.println("[Dao_memberupdate] id : " + vo.getM_id());
		System.out.println("[Dao_memberupdate] img : " + vo.getM_img());
		ss.close();
	}
	
	// ȸ�� : Ż��
	public void delete(MemberVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		System.out.println("�������̵� Dao : " + vo);
		ss.delete("member.memberdelete", vo);
		ss.close();
	}

	// ������ : ȸ������
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

	// ������ : ȸ�� �󼼺���(�̹���)
	public String getDetailimg(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		String res = ss.selectOne("member.detailimg", id);
		System.out.println("[Dao]�󼼺��� ���� : " + res);
		ss.close();
		return res;
	}

	// ������ : ȸ�� �󼼺���(ȸ������)
	public MemberVO getDetail(int m_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		System.out.println("[Dao_Detail]SessionOpen");

		MemberVO v = ss.selectOne("member.detail", m_num);
		System.out.println("[Dao_Detail]id : " + m_num);
		ss.close();
		System.out.println("[Dao_Detail]Close�Ϸ�");
		return v;
	}

	// ������ : ȸ������ ����
	public void managerDelete(String id) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.delete("member.managerdelete", id);
		System.out.println("[Dao_Delete]id : " + id);
		ss.close();
	}
}