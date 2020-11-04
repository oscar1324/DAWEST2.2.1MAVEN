/**
 * 
 */
package com.oscar.controller.Negocio;

/**
 * @author Usuario
 *
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.oscar.controller.Datos.*;


public class Negocio {
	
	public Integer logic (String nombre) throws IOException {
		
		Datos datos = new Datos();
		
		int resultado = datos.consultaPeso(nombre)/datos.consultaAltura(nombre);
		
		
		return resultado;	
	
	
	}
	
}
