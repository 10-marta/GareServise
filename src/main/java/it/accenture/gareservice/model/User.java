package it.accenture.gareservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Utente")
public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String cognome;
    String username;
    String email;
    String password;

    public User(Long id, String nome, String cognome, String username, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //public User update(User item){
    //   this.id= item.getId();
    //   this.nome=item.getNome();
    //   this.cognome=item.getCognome();
    //   this.email=item.getEmail();
    //   this.username=item.getUsername();
    //   this.password=item.getPassword();
    //   return this;
    //
}
