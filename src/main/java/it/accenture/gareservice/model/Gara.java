package it.accenture.gareservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Gara")
public class Gara {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String  nome;

    public Gara(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Gara() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", nome:'" + nome + '\'' +
                '}';
    }

    //public Gara update(Gara item){
      //  this.id= item.getId();
       // this.nome= item.getNome();
        //return this;
    //}
}
