package com.example.notas;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddNoteServlet")
public class AddNoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String note = request.getParameter("note");

        HttpSession session = request.getSession();
        List<String> notes = (List<String>) session.getAttribute("notes");

        if (notes == null) {
            notes = new ArrayList<>();
        }

        notes.add(note);
        session.setAttribute("notes", notes);

        response.sendRedirect("index.jsp");
    }
}
