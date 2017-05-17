import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IMC")
public class IMC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IMC() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String massa = request.getParameter("massa");
		String altura = request.getParameter("altura");

		double resultado = Double.parseDouble(massa) / Math.pow(Double.parseDouble(altura), 2);

		String classificacao = "";

		if (resultado < 16) {
			classificacao = "Magreza grave";
		} else if (resultado < 17) {
			classificacao = "Magreza moderada";
		} else if (resultado < 18.5) {
			classificacao = "Magreza leve";
		} else if (resultado < 25) {
			classificacao = "Saudável";
		} else if (resultado < 30) {
			classificacao = "Sobrepeso";
		} else if (resultado < 35) {
			classificacao = "Obesidade Grau I";
		} else if (resultado < 40) {
			classificacao = "Obesidade Grau II (severa)";
		} else {
			classificacao = "Obesidade Grau III (mórbida)";
		}

		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<a href='index.html'>IMC</a> <a href='operacoes.html'>Operações</a> <a href='gerarNumero.html'>Gerar Numeros</a>");
		out.print("<p>" + resultado + " kg/m²</p>");
		out.print("<p>" + classificacao + "</p>");
		out.print("</body></html>");
	}

}
