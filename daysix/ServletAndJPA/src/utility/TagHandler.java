package utility;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler extends  TagSupport {

		public int doStartTag() {
			
			JspWriter out = pageContext.getAttribute();
			try {
				
			}catch(Exception e) {
				
			}
			return 0;
			
		}
}
