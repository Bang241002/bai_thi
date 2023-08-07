package com.example.bai_thi.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



@WebServlet("/employee")

public class wed {
    private EmployeeBean employeeBean;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        double wage = Double.parseDouble(request.getParameter("wage"));
        employeeBean.Employee(name, wage);
        response.sendRedirect(request.getContextPath() + "/employeeList");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Employee> employeeList = employeeBean.Employees();
        request.setAttribute("employeeList", employeeList);
        request.getRequestDispatcher("/WEB-INF/views/employeeList.jsp").forward(request, response);
    }
}
