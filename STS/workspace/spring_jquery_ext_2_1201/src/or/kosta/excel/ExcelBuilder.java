package or.kosta.excel;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import or.kosta.vo.TboardVO;

// AbstractExcelView �� ��ӹ޾Ƽ� ����ϴµ� 
@SuppressWarnings("deprecation")
public class ExcelBuilder extends AbstractExcelView {
	// excelView �並 ã����, �̰��� ����Ŭ���� ExcelBuilder ��
	// AbstractExcelView �� ����߱� ������ �̰��� ���̴�.

	// DispatcherServlet -> [view]jsp (model) : forward
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// HSSF - ����ũ�� ����Ʈ�� ���� ���� Ŭ����
		// DispatcherServlet �����ؼ� Model�� �޽��ϴ�.
		// ${listBooks}
		List<TboardVO> listBooks = (List<TboardVO>) model.get("listBooks");
		// poi����
		HSSFSheet sheet = workbook.createSheet("Show Books");
		sheet.setDefaultColumnWidth(30);
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Arial");
		style.setFillForegroundColor(HSSFColor.BLUE.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setColor(HSSFColor.WHITE.index);
		style.setFont(font);

		HSSFRow header = sheet.createRow(0);
		// �׼��� �� Ÿ��Ʋ
		String[] str = { "number", "sub", "writer", "mfile", "content", "tdate" };
		for (int i = 0; i < str.length; i++) {
			header.createCell(i).setCellValue(str[i]);
			header.getCell(i).setCellStyle(style);
		}
		int rowCount = 1;
		// Controller�𵨿��� listBooks���� ���� List�����͸�
		// ������ for������ �ݺ��ϸ鼭 ó���Ѵ�.
		// �����ͷ� ���� ������ ä��
		for (TboardVO aBook : listBooks) {
			HSSFRow aRow = sheet.createRow(rowCount++);
			aRow.createCell(0).setCellValue(aBook.getNum());
			aRow.createCell(1).setCellValue(aBook.getSub());
			aRow.createCell(2).setCellValue(aBook.getWriter());
			aRow.createCell(3).setCellValue(aBook.getMfile());
			aRow.createCell(4).setCellValue(aBook.getContent());
			aRow.createCell(5).setCellValue(aBook.getTdate());
		}
		// ���䰴ü�� ���� �ٿ�ε� ���� Ÿ�԰� ���� �̸��� �����Ѵ�.
		response.setContentType("Application/Msexcel");
		response.setHeader("Content-Disposition", "attachment; filename=tboard_exce.xls;");
	}

}