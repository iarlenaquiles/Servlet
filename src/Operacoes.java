
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Operacoes")
public class Operacoes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Operacoes() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String numero1 = request.getParameter("numero1");
		String numero2 = request.getParameter("numero2");

		double numeroAux = Double.parseDouble(numero1);
		double numeroAux1 = Double.parseDouble(numero2);

		double soma = numeroAux + numeroAux1;
		double subtracao = numeroAux - numeroAux1;

		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("<a href='index.html'>IMC</a> <a href='operacoes.html'>Operações</a> <a href='gerarNumero.html'>Gerar Numeros</a>");
		out.print("<p>Soma: " + soma + "</p>");
		out.print("<p>Subtração: " + subtracao + "</p>");
		out.print("</body></html>");
	}

}
