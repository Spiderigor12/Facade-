package igor2;

public class Sobremesa extends Produto {
	private String tamanho;

    public Sobremesa(String descricao, float preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + tamanho;
    }

}
