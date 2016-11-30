package or.kosta.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import or.kosta.vo.BoardVO;
// Dao�� ���� ������̼�, @Controller�� ����� ����
@Repository
public class BoardDao {
	//SqlSessionTemplate�� mybatis-spring���̺귯������ ����.
	@Autowired
	private SqlSessionTemplate ss;
	
	public void addBoard(BoardVO vo){
		ss.insert("board.add", vo);
	}
	public List<BoardVO> listBoard(){
		return ss.selectList("board.list");
	}
	public BoardVO detailBoard(int num){
		return ss.selectOne("board.detail", num);
	}
	public void deleteBoard(int num){
		ss.delete("board.delete", num);
	}
}
