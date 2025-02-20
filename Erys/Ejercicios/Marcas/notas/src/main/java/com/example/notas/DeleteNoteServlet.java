package com.example.notas;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DeleteNoteServlet")
public class DeleteNoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String noteToDelete = request.getParameter("note");

        HttpSession session = request.getSession();
        List<String> notes = (List<String>) session.getAttribute("notes");

        if (notes != null) {
            notes.remove(noteToDelete);
            session.setAttribute("notes", notes);
        }

        response.sendRedirect("index.jsp");
    }
}

