package com.icbt.web.demo.web_app_demo;

import com.icbt.web.demo.web_app_demo.model.CustomerDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tharindu Eranga
 * @date Tue 29 Dec 2020
 */
@WebServlet(name = "customerServlet", value = "/customer")
public class CustomerController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
        try {
            req.setAttribute("customers", getCustomers());
            req.getRequestDispatcher("/customer.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private List<CustomerDTO> getCustomers() {
        return Arrays.asList(
                new CustomerDTO("1", "Tharindu", "0776288969"),
                new CustomerDTO("2", "Sadeesha", "0776248969"),
                new CustomerDTO("3", "Kalani", "0776288669"),
                new CustomerDTO("4", "Yohan", "0776289789")
        );
    }
}
