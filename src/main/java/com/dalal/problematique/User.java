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

    //on a un objet qui possède plusieurs attributs
    /* le problème c'est que lorsqu'on veut créer une instance, on va tombé dans deux problèmes principaux
    *
    * le 1 : on a plusieurs attributs donc on doit focuser donc on doit avoir un grand constructeur
    * le 2 : si on veut seulement creer une instances avec tels attributs dans ce cas on doit passé beacuoup de null ou des valeur par default
    *    la solution bete c'est que on va creer plusieurs constructeurs pour chaque cas
    * */

}
