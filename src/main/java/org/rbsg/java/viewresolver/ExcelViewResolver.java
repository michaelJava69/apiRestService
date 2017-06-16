package org.rbsg.java.viewresolver;

 

import java.util.Locale;

import org.apache.log4j.Logger;
import org.rbsg.java.service.PrimeNumberService;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
 
public class ExcelViewResolver implements ViewResolver{
 
	private Logger logger = Logger.getLogger(ExcelViewResolver.class);
	
    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
    	 
    	logger.info("Resolving Excel view");
    	
    	ExcelView view = new ExcelView();
        return view;
      }
     
}
