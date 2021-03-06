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

// AbstractExcelView 를 상속받아서 사용하는데 
@SuppressWarnings("deprecation")
public class ExcelBuilder extends AbstractExcelView {
	// excelView 뷰를 찾으면, 이것을 현재클래스 ExcelBuilder 가
	// AbstractExcelView 를 상속했기 때문에 이것은 뷰이다.

	// DispatcherServlet -> [view]jsp (model) : forward
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// HSSF - 마이크로 소프트의 엑셀 전용 클래스
		// DispatcherServlet 에의해서 Model을 받습니다.
		// ${listBooks}
		List<TboardVO> listBooks = (List<TboardVO>) model.get("listBooks");
		// poi문법
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
		// 액셀의 셀 타이틀
		String[] str = { "number", "sub", "writer", "mfile", "content", "tdate" };
		for (int i = 0; i < str.length; i++) {
			header.createCell(i).setCellValue(str[i]);
			header.getCell(i).setCellStyle(style);
		}
		int rowCount = 1;
		// Controller모델에서 listBooks으로 받은 List데이터를
		// 개선된 for문으로 반복하면서 처리한다.
		// 데이터로 셀의 내용을 채움
		for (TboardVO aBook : listBooks) {
			HSSFRow aRow = sheet.createRow(rowCount++);
			aRow.createCell(0).setCellValue(aBook.getNum());
			aRow.createCell(1).setCellValue(aBook.getSub());
			aRow.createCell(2).setCellValue(aBook.getWriter());
			aRow.createCell(3).setCellValue(aBook.getMfile());
			aRow.createCell(4).setCellValue(aBook.getContent());
			aRow.createCell(5).setCellValue(aBook.getTdate());
		}
		// 응답객체로 부터 다운로드 받을 타입과 파일 이름을 설정한다.
		response.setContentType("Application/Msexcel");
		response.setHeader("Content-Disposition", "attachment; filename=tboard_exce.xls;");
	}

}