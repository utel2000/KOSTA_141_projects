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
       vo.setNum(ar.size()+1);
       if(vo.getAge() >= 19){
           vo.setAgestatus("성년입니다.");
           vo.setPoint(3000);
       }else{
           vo.setAgestatus("미성년입니다.");
           vo.setPoint(5000);
       }
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
