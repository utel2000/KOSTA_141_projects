package model;
import javax.swing.table.AbstractTableModel;
public class JTableModel extends AbstractTableModel {
    // 컬럼명이 들어갈 배열 변수
    private Object[] c_name;
    // 데이터가 들어갈 배열 변수
    private Object[][] data;
    // 모델 객체 생성 시 제일 먼저 인자를 받아 컬럼과 데이터를 넣는 생성자.
    public JTableModel(Object[] c_name, Object[][] data) {
        this.c_name = c_name;
        this.data = data;
    }
    // 컬럼명 반환
    @Override
    public String getColumnName(int column) {
        return c_name[column].toString();
    }
    // 로우 수 반환
    @Override
    public int getRowCount() {
        return data.length;
    }
    // 컬럼 수 반환
    @Override
    public int getColumnCount() {
        return c_name.length;
    }
    // 테이블의 값 반환.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
}
