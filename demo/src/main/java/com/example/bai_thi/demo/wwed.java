package com.example.bai_thi.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class wwed {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        double wage = Double.parseDouble(request.getParameter("wage"));
        Object employeeBean;
        employeeBean = null;
        employeeBean.clone();
        response.sendRedirect(request.getContextPath() + "/employeeList");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Object employeeBean = null;
        List<Employee> employeeList = employeeBean.finalize();
        request.setAttribute("employeeList", employeeList);
        request.getRequestDispatcher("/WEB-INF/views/employeeList.jsp").forward(request, response);
    }
}
