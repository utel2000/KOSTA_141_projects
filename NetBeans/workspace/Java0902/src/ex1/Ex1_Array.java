package ex1;
public class Ex1_Array {
    public static void main(String[] args) {
        int[][] test;
        // test = new int[1�����迭�Ǽ�][�� 1���� �迭�� ũ��]
        test = new int[2][3];
        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;
        // -- ù��° �ּҸ� ���� ������ �迭�� ���� ���
        test[1][0] = 500;
        test[1][1] = 600;
        test[1][2] = 700;
        // int[][] test = int[2] �ݺ� : �ٱ� for���� �ݺ�
        for (int i = 0; i < test.length; i++) {
            // int[][] test = int[][3] : �ٱ� for���� �ε����� �ش��ϴ�
            // ������ �迭�� ���� �ݺ�
            for (int j = 0; j < test[i].length; j++) {
                System.out.println(test[i][j]);
            }
            System.out.println("-----------------");
        }
        // �� �� �غ���. ���� �ڵ带 ������ for������ �����մϴ�.
        for (int[] i : test) { // 2���� �迭
            for(int j : i){ // 1���� �迭
                System.out.println(j);
            }
        }
    }
}
