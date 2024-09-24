package Inventory;
public class DVD extends Product{
    int lenght;
    int rating;
    String studio;

	public int getLenght() {
		return this.lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getStudio() {
		return this.studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}


    public DVD(){
        super();
        lenght = 0;
        rating = 0;
        studio = "";
    }
    public DVD (int number, String name, int quantity, double price, int lenght, int rating, String studio){
        super(number, name, quantity, price);
        this.lenght = lenght;
        this.rating = rating;
		this.studio = studio;

    }
}
