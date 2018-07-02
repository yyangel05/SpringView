package view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.PageRank;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class PageRanksView extends AbstractExcelView {

	@SuppressWarnings("unchecked")
	@Override
	//엑셀의 전체적인 문서를 만드는 메서드
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, 
			HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		HSSFSheet sheet = createFirstSheet(workbook);
		
		createColumnLabel(sheet); //컬럼의 제목을 정하는 메서드를 호출함

		List<PageRank> pageRanks = (List<PageRank>) model.get("pageRanks");
		int rowNum = 1;
		for (PageRank rank : pageRanks) {
			createPageRankRow(sheet, rank, rowNum++); //엑셀의 행작업을 하는 메서드를 호출함
		}
	}

	//시트를 만드는 메서드
	private HSSFSheet createFirstSheet(HSSFWorkbook workbook) {
		HSSFSheet sheet = workbook.createSheet();
		workbook.setSheetName(0, "페이지 순위");
		sheet.setColumnWidth(1, 256 * 20);
		return sheet;
	}

	//컬럼의 제목을 정하는 메서드. 
	private void createColumnLabel(HSSFSheet sheet) {
		HSSFRow firstRow = sheet.createRow(0);
		//A열 1행의 값은 "순위" 라는 글자
		HSSFCell cell = firstRow.createCell(0);
		cell.setCellValue("순위");

		//B열 1행의 값은 "페이지" 라는 글자
		cell = firstRow.createCell(1);
		cell.setCellValue("페이지");
	}

	//엑셀에 들어갈 행 작업을 함
	private void createPageRankRow(HSSFSheet sheet, PageRank rank, int rowNum) {
		HSSFRow row = sheet.createRow(rowNum);
		HSSFCell cell = row.createCell(0);
		cell.setCellValue(rank.getRank()); //A열에는 pageRanks 리스트의 순위값이 들어간다

		cell = row.createCell(1);
		cell.setCellValue(rank.getPage());  //B열에는 pageRanks 리스트의 페이지값이 들어간다

	}

}

