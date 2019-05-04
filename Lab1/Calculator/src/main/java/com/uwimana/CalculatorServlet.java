package com.uwimana;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet" , urlPatterns = {"/calculator"})
public class CalculatorServlet extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {

            String num1 = request.getParameter("num1").trim();
            String num2 = request.getParameter("num2").trim();
            String num3 = request.getParameter("num3").trim();
            String num4 = request.getParameter("num4").trim();

            out.println("<form action='calculator'>");
            if (!("".equals(num1) && "".equals(num2))) {
                int sum = Integer.valueOf(num1) + Integer.valueOf(num2);
                out.println(" <input name=\"num1\" value=" + num1 + "> + <input name=\"num2\" value=" + num2 + "> = <input name=\"sum\" value=" + sum + " readonly>");
                out.println();
            } else {
                out.println("<input name=\"num1\"> + <input name=\"num2\"> = <input name=\"sum\" readonly>");
                out.println();
            }
            out.print("<br/>");
            if(!("".equals(num3) && "".equals(num4))){
                int product = Integer.valueOf(num3) * Integer.valueOf(num4);
                out.println("<input name=\"num3\" value="+num3+"> * <input name=\"num4\" value="+num4+"> = <input name=\"product\" value="+product+" readonly>");
            }else{
                out.println("<input name=\"num3\"> * <input name=\"num4\"> = <input name=\"product\" readonly>");
            }
            out.print("<br/>");
            out.print(" <input type=\"submit\" value=\"Submit\" >");
            out.print("</form>");
        }catch (Exception e){
            out.print("Something is wrong...");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //doPost(request, response);

        request.getRequestDispatcher("/WEB-INF/calculator.jsp").forward(request, response);


//        String sum = "";
//        String product = "";
//
//        // Check for valid inputs....
//        try {
//            Integer a1 = Integer.parseInt(add1);
//            Integer a2 = Integer.parseInt(add2);
//            sum = "" + (a1+a2);
//        } catch(NumberFormatException e) {
//            if (add1.isEmpty()) add1 = "''";
//            if (add2.isEmpty()) add2 = "''";
//            sum = "''";
//        }
//
//        /*
//         * Integer.parseInt(str) throws NumberFormatException
//         * if the string cannot be converted to an integer.
//         */
//
//        try {
//            Integer m1 = Integer.parseInt(mult1);
//            Integer m2 = Integer.parseInt(mult2);
//            product = "" + (m1 * m2);
//        } catch(NumberFormatException e) {
//            if (mult1.isEmpty()) mult1 = "''";
//            if (mult2.isEmpty()) mult2 = "''";
//            product = "''";
//        }
//
//
//        // Another "view" of how to use PrintWriter
//        response.setContentType("text/html");
//        response.setHeader("Cache-Control", "no-cache");
//        PrintWriter writer = response.getWriter();
//        StringBuilder sb = new StringBuilder("<html><body>");
//        sb.append("<title>Calculate</title><head>");
//        sb.append("<body>");
//        sb.append("<form action='calc2' method='get'>");
//        sb.append("<input type = 'text' size = '2' name = 'add1' " + "value = " +  add1 +" />+");
//        sb.append("<input type = 'text' size = '2' name = 'add2'"  + "value = " +  add2 + " />=");
//        sb.append("<input type = 'text' size = '4' name = 'sum'"   + "value = " +  sum + " readonly  /> <br/>");
//        sb.append("<input type = 'text' size = '2' name = 'mult1'" + "value = " +  mult1 + " />*");
//        sb.append("<input type = 'text' size = '2' name = 'mult2'" + "value = " +  mult2 + "  />=");
//        sb.append("<input type = 'text' size = '4' name = 'product'" + "value = " + product + " readonly  /><br/>");
//        sb.append("<input type = 'submit' value = 'Submit'/>");
//        sb.append("</form></body></html>");
//        writer.println(sb.toString());
    }
}
