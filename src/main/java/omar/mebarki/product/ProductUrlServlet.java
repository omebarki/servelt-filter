package omar.mebarki.product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductUrlServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/productDelaits.do");
        String[] splitUrl = req.getPathInfo().split("/");
        req.setAttribute("prd_id", splitUrl[splitUrl.length - 1]);
        requestDispatcher.forward(req, resp);
    }
}
