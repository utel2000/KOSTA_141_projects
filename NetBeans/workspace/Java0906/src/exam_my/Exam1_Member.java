package exam_my;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Exam1_Member implements Exam1_MemberInter{
    private ArrayList<MemberVO> ar;
    public Exam1_Member() {
        ar = new ArrayList<>();
    }
    @Override
    public void addMember(MemberVO vo) {
       vo.setNum(ar.size()+1);
       /// 현재 날짜new Date()를 2016-09-07 SimpleDateFormat
       // 형태로 가져오기 위한 객체생성
       vo.setEdate(new 
        SimpleDateFormat("yyyy-MM-dd").format(new Date()));
       ar.add(vo);
    }
    @Override
    public ArrayList<MemberVO> getMemberList() {
        return ar;
    }
}
