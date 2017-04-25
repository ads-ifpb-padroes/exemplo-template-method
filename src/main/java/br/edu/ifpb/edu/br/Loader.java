package br.edu.ifpb.edu.br;

public class Loader {
	
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		DocumentoTemplate d = (DocumentoTemplate) Class.forName("br.edu.ifpb.edu.br.DocumentoImpl").newInstance();
		d.imprimir();
	}

}
