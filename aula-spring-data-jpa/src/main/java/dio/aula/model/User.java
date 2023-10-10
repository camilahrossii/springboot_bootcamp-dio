package main.java.dio.aula.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(length = 50, nullable=false)
    private String name;
    
    @Column(length = 50, nullable=false)
    private String username;
    
    @Column(length = 100, nullable=false)
    private String password;

    public String getName() {
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{ " +
                "id=" + id +
                ", name=" + name +
                ", username=" + username +
                ", password=" + password +
                " }";
    }
}
