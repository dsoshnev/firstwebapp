package ru.geekbrains.servlet;


import ru.geekbrains.servlet.model.Product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);
    private static List<Product> products = new ArrayList<Product>();

    @Override
    public void init() throws ServletException {
        super.init();
        products.add(new Product().init(1, "product1",10.1D));
        products.add(new Product().init(2, "product2",20D));
        products.add(new Product().init(3, "product3",30D));
        products.add(new Product().init(4, "product4",40D));
        products.add(new Product().init(5, "product5",50D));
        products.add(new Product().init(6, "product6",60D));
        products.add(new Product().init(7, "product7",70D));
        products.add(new Product().init(8, "product8",80D));
        products.add(new Product().init(9, "product9",90D));
        products.add(new Product().init(10, "product10",100D));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New GET request");

        //Response
        for (Product product : products) {
            resp.getWriter().printf("<h1>" + product + "/h1>");
        }

        //Redirect
        //req.setAttribute("myAttr", "attrValue");
        //getServletContext().getRequestDispatcher("/basic_servlet").forward(req, resp);

        //Simple Response
        //resp.getWriter().printf("<h1>New GET request</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New POST request");

        resp.getWriter().printf("<h1>New POST request</h1>");
    }


}
