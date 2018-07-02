package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageReportController {
	
	
	//pdf로 출력
	@RequestMapping("/pageReport")
	public ModelAndView pdfReport() {
		List<PageRank> pageRanks = new ArrayList<PageRank>();
		pageRanks.add(new PageRank(1, "/bbs/mir2/list"));
		pageRanks.add(new PageRank(2, "/bbs/mir3/list"));
		pageRanks.add(new PageRank(3, "/bbs/portnite2/list"));
		return new ModelAndView("pageReport", "pageRanks", pageRanks);
	}
	
	//xml로 출력
	@RequestMapping("/pageXmlReport")
	public ModelAndView xmlReport() {
		List<PageRank> pageRanks = new ArrayList<PageRank>();
		pageRanks.add(new PageRank(1, "/bbs/mir2/list"));
		pageRanks.add(new PageRank(2, "/bbs/mir3/list"));
		pageRanks.add(new PageRank(3, "/bbs/mir4/list"));
		return new ModelAndView("pageXmlReport", "report", new PageRankReport(pageRanks));
	}
	
	//Json으로 출력
	@RequestMapping("/pageJsonReport")
	public ModelAndView jsonReport() {
		List<PageRank> pageRanks = new ArrayList<PageRank>();
		pageRanks.add(new PageRank(1,"/bbs/fortnite/good"));
		pageRanks.add(new PageRank(1,"/bbs/fortnite/soso"));
		pageRanks.add(new PageRank(1,"/bbs/fortnite/bad"));
		return new ModelAndView("pageJsonReport", "report", new PageRankReport(pageRanks));
	}

}
