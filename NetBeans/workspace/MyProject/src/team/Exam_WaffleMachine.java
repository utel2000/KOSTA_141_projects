// 조별 팀 연구 과제 1. 캡슐화, JVM메모리의 효율적인 코드로 리팩토링.
// Exam_WaffleMachineUse.java를 만들어서 실제 사용자들에게 주문을 받고
// 그 결과를 출력하는 프로그램으로 완성. Scanner 기준
// 내일 수업 중에 반드시 반드시 지정한 조를 발표시켜서 결과를 함께 살펴 보도록 할 예정입니다.
// 시나리오 : 
// 손님은 와플의 모양을 선택(별, 달, 구름)
// 손님은 와플의 가격을 정확히 지불한다.(거스럼돈 기능은 생략)
// 손님은 수량을 선택하고 주문을 한다.
package team;

public class Exam_WaffleMachine {
    private int price;
    private int qty;
    private String shapeType;
    private String msg;
    public void setWaffle(int price, int qty, String shapeType) {
        this.price = price;
        this.qty = qty;
        this.shapeType = shapeType;
    }

    public String getWaffle() {
        return this.msg;
    }

    public void orderWaffle() {
        StringBuffer sb = new StringBuffer();
        int num = this.price * this.qty;
        if (qty != 0 || price != 0) {
            sb.append("주문하신 제품은 ").append(this.shapeType).append(" 입니다.\n");
            sb.append("수량 : ").append(this.qty).append("\n");
            sb.append("가격 : ").append(this.price).append("\n");
            sb.append("결재 금액 : ").append(num).append("입니다.\n");
            this.msg = sb.toString();
        } else {
            sb.append("주문하신 제품은 수량이 0이거나 가격을 지불하지 않았습니다.\n");
            this.msg = sb.toString();
        }
    }
}
