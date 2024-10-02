package igor2;

public class Sanduiche extends Produto{
	 private int pesoEmGramas;

	    public Sanduiche(String descricao, float preco, int pesoEmGramas) {
	        super(descricao, preco);
	        this.pesoEmGramas = pesoEmGramas;
	    }

	    public int getPesoEmGramas() {
	        return pesoEmGramas;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + " - " + pesoEmGramas + "g";
	    }

}
