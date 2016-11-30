package ex1;
import javax.swing.table.AbstractTableModel;
public class MyModel extends AbstractTableModel {
    private Object[] c_name;
    private Object[][] data;
    public MyModel(Object[] c_name, Object[][] data) {
        this.c_name = c_name;
        this.data = data;
    }

    @Override
    public String getColumnName(int column) {
        return c_name[column].toString();
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return c_name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
}
