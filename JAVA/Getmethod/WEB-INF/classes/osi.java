import java.io.*;
import javax.servlet.http.*;

public class osi extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String osi_layer = req.getParameter("param");
		PrintWriter out = res.getWriter();
		if(osi_layer.equals("datalink")){
			out.print("data is transmitted as frames");
		}else if(osi_layer.equals("network")){
			out.print("data is transmitted as packets");
		}
	}
}