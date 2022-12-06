package Curse_structure_dates.Contact_ex06;

public class Contact {
    private String name;
    private String telephone;
    private String email;

    public Contact(String name, String telephone, String email) {
        super();
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    public Contact() {
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{" + "name='" + name + '\'' + ", telephone='" + telephone + '\'' + ", email='" + email + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (!name.equals(contact.name)) return false;
        if (!telephone.equals(contact.telephone)) return false;
        return email.equals(contact.email);
    }
}

