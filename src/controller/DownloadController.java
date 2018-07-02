package controller;

import java.io.File;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController implements ApplicationContextAware {

	private WebApplicationContext context = null;
	
	@RequestMapping("/file")
	public ModelAndView download() throws Exception {
		File downloadFile = getFile();
		return new ModelAndView("download", "downloadFile", downloadFile); //bean으로 등록한 클랑스의 id값
	} //uri경로는 /download/file. 누르면 파일다운로드창이 실행된다.
	
	private File getFile() {
		String path= context.getServletContext().getRealPath("/WEB-INF/설명.txt");
		//상대경로를 넣으면 getRealPath()가 절대경로로 리턴해준다. 그 리턴값은 context가 받음.
		
		return new File(path);
	}
	
	@Override 
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = (WebApplicationContext) applicationContext;
	}
	

}
