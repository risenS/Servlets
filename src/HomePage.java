import java.io.IOException;
import javax.servlet.ServletException;
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
@WebServlet(urlPatterns={"/homepage"})
public class HomePage extends HttpServlet 
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
        {
                    req.getRequestDispatcher("/namex.jsp").forward(req,resp);
        }
}
