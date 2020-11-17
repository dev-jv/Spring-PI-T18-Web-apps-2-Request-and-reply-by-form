package webApps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NuevoControlador { 
	
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario() { // Proporciona el Formulario (pag)
		return "FormularioBas"; // * Nombre de la pag. (Formulario)
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() { // Muestra la respuesta (pag)
		return "FormularioPro"; // * Nombre de la pag. (Respuesta)
	}
}


