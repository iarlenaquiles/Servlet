
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gerar")
public class Gerar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Gerar() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Random gerador = new Random();

		Set<Integer> numeros = new TreeSet<Integer>();

		while (numeros.size() < 6) {
			numeros.add(gerador.nextInt(60) + 1);
		}
		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("<a href='index.html'>IMC</a> <a href='operacoes.html'>Operações</a> <a href='gerarNumero.html'>Gerar Numeros</a>");
		out.print("<p>" + numeros + "</p>");
		
		out.print("</body></html>");
	}

}
