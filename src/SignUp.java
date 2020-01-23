
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrown
 */
@WebServlet(urlPatterns={"/signup"})
public class SignUp extends HttpServlet
{
    static ArrayList<Account> account_list = new ArrayList<Account>();
     public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
     {
         String Username = req.getParameter("user");
         String Password = req.getParameter("pass");
         resp.setContentType("text/plain");
         var pw = resp.getWriter();
         account_list.add(new Account(Username, Password));
         
         pw.printf("Account '" +Username +"' created, please sign in.");
         
     }
     
}
    
