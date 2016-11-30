package exam;
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
       vo.setEdate(new 
        SimpleDateFormat("yyyy-MM-dd").format(new Date()));
       ar.add(vo);
    }
    @Override
    public ArrayList<MemberVO> getMemberList() {
        return ar;
    }
}
