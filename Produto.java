package igor2;

public class Produto {
	private String descricao;
    private float preco;

    public Produto(String descricao, float preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return descricao + " - R$ " + String.format("%.2f", preco);
    }

}
