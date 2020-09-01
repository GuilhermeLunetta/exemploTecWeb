public class Cadastro {
	// Aqui teríamos uma interface

	Database db = new Database(); // Fictício

	public Cadastro() {

	}

	public void inserirCliente(Cliente c) {
		db.put(c) // Código totalmente fictício, fingindo que estamos adicionando esse cliente no Banco de Dados
	}

	public void inserirEndereco(Cliente c) {
		db.put(c.getAddress()); // Código totalmente fictício, fingindo que estamos adicionando esse cliente no Banco de Dados
	}

	public void inserirID(Cliente c) {
		db.put(c.getUserID()); // Código totalmente fictício, fingindo que estamos adicionando esse cliente no Banco de Dados
	}
}