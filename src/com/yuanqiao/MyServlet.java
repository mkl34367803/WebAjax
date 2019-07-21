package com.yuanqiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getOutputStream().print("this is producer generate get return");
		response.getOutputStream().flush();
		response.getOutputStream().close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String header = request.getHeader("Accept");
		System.out.println("header="+header);
		String id = request.getParameter("id");
		
		
		
		System.out.println("---------------id="+id);
		String stringBuffer=readReqStr(request);
		System.out.println("--------stringBuffer="+stringBuffer);
		
		System.out.println("enter dopost method");
		response.getOutputStream().print("this is producer generate post return");
		response.getOutputStream().flush();
		response.getOutputStream().close();
	}
	
	
	private  String readReqStr(HttpServletRequest request){
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		try{
			reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));
			String line = null;
			while ((line = reader.readLine()) != null){
				sb.append(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	

}
