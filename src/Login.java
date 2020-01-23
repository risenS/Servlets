import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(urlPatterns={"/login"})
public class Login extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        resp.setContentType("text/plain");
        var pw = resp.getWriter();
        var Name = req.getParameter("user");
        var Pass = req.getParameter("pass");
        
        
        if( Name == null ){
            pw.printf("No username provided.");
        }
        
        if( Pass == null){
            pw.printf("No password provided.");
        }
        
        int index = -1;
        for(int i=0; i < SignUp.account_list.size(); i++)
        {
            if(SignUp.account_list[i].username = Name && SignUp.account_list[i].password = Pass)
            {
                index = i;
                break;
            }
        }
        
        if(index > -1) {
            var sess = req.getSession();
            sess.setAttribute("name", Name );
            pw.printf("Logged in as "+Name);
        }
    }

}
