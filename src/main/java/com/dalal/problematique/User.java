package com.dalal.problematique;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String role;
    private String address;
    private String phone;
    private String fax;

    public User(int id, String name, String email, String password, String role, String address, String phone, String fax) {
        this(id, name, email, password,role,address,phone);
        this.fax = fax;
    }

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(int id, String name, String email, String password) {
        this(id,name,email);
        this.password = password;
    }

    public User(int id, String name, String email, String password, String role) {
        this(id,name,email,password);
        this.role = role;
    }

    public User(int id, String name, String email, String password, String role, String address, String phone) {
        this(id,name,email,password,role);
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}




//on a un objet qui possède plusieurs attributs
/* le problème c'est que lorsqu'on veut créer une instance, on va tombé dans deux problèmes principaux
 *
 * le 1 : on a plusieurs attributs donc on doit focuser donc on doit avoir un grand constructeur
 * le 2 : si on veut seulement creer une instances avec tels attributs dans ce cas on doit passé beacuoup de null ou des valeur par default
 *    la solution bete c'est que on va creer plusieurs constructeurs pour chaque cas
 * le 3 : c'est le probleme d'utilisé des setter pour aussi resoudre ce probleme dans ce cas on risque d'oublié un attribut
 *
 * donc l'objet devient unreadable et complexe la solution c'est d'utiliser le pattern builder :
 *
 * */
