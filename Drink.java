package igor2;

public class Drink extends Produto {
	 private int volumeInMl;

	    public Drink(String description, float price, int volumeInMl) {
	        super(description, price);
	        this.volumeInMl = volumeInMl;
	    }

	    public int getVolumeInMl() {
	        return volumeInMl;
	    }

}
