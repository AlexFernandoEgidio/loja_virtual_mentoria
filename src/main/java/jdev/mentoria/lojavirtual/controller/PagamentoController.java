package jdev.mentoria.lojavirtual.controller;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PagamentoController implements Serializable {

	private static final long serialVersionUID = 1L;

	@RequestMapping(method = RequestMethod.GET, value = "**/pagamento/{idVendaCompra}")
	public ModelAndView pagamento(@PathVariable(value = "idVendaCompra",
								 required = false) String idVendaCompra) {

		return new ModelAndView("pagamento");
	}

}
