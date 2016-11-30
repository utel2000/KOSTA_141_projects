package model;
import javax.swing.table.AbstractTableModel;
public class JTableModel extends AbstractTableModel {
    // �÷����� �� �迭 ����
    private Object[] c_name;
    // �����Ͱ� �� �迭 ����
    private Object[][] data;
    // �� ��ü ���� �� ���� ���� ���ڸ� �޾� �÷��� �����͸� �ִ� ������.
    public JTableModel(Object[] c_name, Object[][] data) {
        this.c_name = c_name;
        this.data = data;
    }
    // �÷��� ��ȯ
    @Override
    public String getColumnName(int column) {
        return c_name[column].toString();
    }
    // �ο� �� ��ȯ
    @Override
    public int getRowCount() {
        return data.length;
    }
    // �÷� �� ��ȯ
    @Override
    public int getColumnCount() {
        return c_name.length;
    }
    // ���̺��� �� ��ȯ.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
}
