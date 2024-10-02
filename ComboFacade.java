package igor2;

public class ComboFacade {
        private Sanduiche sanduiche;
	    private Drink drink;
	    private Sobremesa sobremesa;

	    public void criarCombo(int tipo) {
	        String descricaoBebida = "Caipirinha";
	        float precoBebida = 9;
	        String descricaoSobremesa = "Sorvete";
	        float precoSobremesa = 5;
	        String tamanhoSobremesa = "L";

	        switch (tipo) {
	            case 1:
	                sanduiche = new Sanduiche("Podrão", 15, 200);
	                break;
	            case 2:
	                sanduiche = new Sanduiche("Artesanal", 18, 150);
	                break;
	            case 3:
	                sanduiche = new Sanduiche("X-burguer", 10, 150);
	                break;
	            default:
	                System.out.println("Opção não encontrada\n");
	                break;
	        }

	        drink = new Drink(descricaoBebida, precoBebida, 100);
	        sobremesa = new Sobremesa(descricaoSobremesa, precoSobremesa, tamanhoSobremesa);
	    }

	    @Override
	    public String toString() {
	        return "\nCombo: " + "\nSanduíche: " + sanduiche.getDescricao() +
	               "\nBebida: " + drink.getDescricao() +
	               "\nSobremesa: " + sobremesa.getDescricao();
	    }

}
