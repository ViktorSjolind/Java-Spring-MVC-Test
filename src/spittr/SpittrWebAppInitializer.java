package spittr;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//AbstractAnnotia... creates both ContextLoaderListener and DispatcherServlet
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	//ContextLoaderListener - other beans defined in RootConfig
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	//DispatcherServlet - beans defined in WebConfig
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
