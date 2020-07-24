package com.uverwolf.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.uverwolf.models.Numero;

/**
 * Servlet implementation class NumeroMagico
 */
@WebServlet("/NumeroMagico")
public class NumeroMagico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumeroMagico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		vista.forward(request, response);
		String numeroIngresado = request.getParameter("numero");
		if(numeroIngresado ==null || numeroIngresado.equals("")) {
			HttpSession session = request.getSession();
			Numero num = new Numero();
			session.setAttribute("numero", num.aleatorio());
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		String numeroIngresado = request.getParameter("numero");
		if(numeroIngresado ==null || numeroIngresado.equals("")) {
			HttpSession session = request.getSession();
			Numero num = new Numero();
			session.setAttribute("numero", num.aleatorio());
			
			
		}else {
			HttpSession session = request.getSession();
			
			Integer x = (Integer) session.getAttribute("numero");
			try {
				if(Integer.parseInt(numeroIngresado) == x ) {
					request.setAttribute("borde", "border border-dark");
					request.setAttribute("ganaste", "IGUALITOS");
					session.invalidate();
				}else if(Integer.parseInt(numeroIngresado)>x){
					request.setAttribute("borde", "border border-dark");
					request.setAttribute("contenido", "Tu numero es mayor al numero secreto");
				}else if(Integer.parseInt(numeroIngresado)<x){
					request.setAttribute("borde", "border border-dark");
					request.setAttribute("contenido", "Tu numero es menor al numero secreto");
				}
			} catch (Exception e) {
				// TODO: handle exception
				
				response.setHeader("Refresh", "0; URL=http://localhost:8081/NumeroMagico/NumeroMagico");
				
			}

		}
		

		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		vista.forward(request, response);
		
	}

}
