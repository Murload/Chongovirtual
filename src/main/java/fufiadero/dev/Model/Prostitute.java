package fufiadero.dev.Model;

public class Prostitute extends Client {

    public Prostitute(long id, String name, String lastname, int telephone, String mail) {
        super(id, name, lastname, telephone, mail);
    }
    private int price;
    private String namePros;
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getNamePros() {
        return namePros;
    }
    public void setNamePros(String namePros) {
        this.namePros = namePros;
    }
    public Prostitute(long id, String name, String lastname, int telephone, String mail, int price, String namePros) {
        super(id, name, lastname, telephone, mail);
        this.price = price;
        this.namePros = namePros;
    }

    
    
}
