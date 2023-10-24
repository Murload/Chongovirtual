package fufiadero.dev.Model;



public class Person {
    private long Id;
    private String name;
    private String lastname;
    private int telephone;
    private String mail;

    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public Person(long id, String name, String lastname, int telephone, String mail) {
        Id = id;
        this.name = name;
        this.lastname = lastname;
        this.telephone = telephone;
        this.mail = mail;
    }

    
}
