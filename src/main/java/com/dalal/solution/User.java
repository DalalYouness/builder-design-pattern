package com.dalal.solution;

/*
* TODO:
*  on a constaté que la création d'un objet complexe qui contient des
*  attributs obligatoires et des autres optionnels , ça peut produire
*  des problème au moment d'instanciation et que les solutions proposés
*  sont pas pratiques comme ( beaucoup de constructeurs et le remplissage
*  des attributs via des setters)
*  pour cette raison on doit utiliser le pattern de création Builder
*
*
* */
public class User {

    private final int id;
    private final String name;
    private final String email;
    private final String password;
    private final String role;
    private final String address;
    private final String phone;
    private final String fax;

    private User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.role = builder.role;
        this.address = builder.address;
        this.phone = builder.phone;
        this.fax = builder.fax;
    }

    public static  class UserBuilder {
        private int id;
        private String name;
        private String email;
        private String password;
        private String role;
        private String address;
        private String phone;
        private String fax;

         // dans le cas si y'a des attributs required
//         public UserBuilder (int id,String name,String email) {
//             this.id = id;
//             this.name = name;
//             this.email = email;
//         }

        public UserBuilder id (int id) {
            this.id = id;
            return this;
        }
        public UserBuilder name (String name) {
            this.name = name;
            return this;
        }
        public UserBuilder email (String email) {
            this.email = email;
            return this;
        }
        public UserBuilder password (String password) {
            this.password = password;
            return this;
        }
        public UserBuilder role (String role) {
            this.role = role;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public UserBuilder phone (String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder fax (String fax) {
            this.fax = fax;
            return this;
        }

         public User build() {
             return new User(this);
         }

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                '}';
    }
}



