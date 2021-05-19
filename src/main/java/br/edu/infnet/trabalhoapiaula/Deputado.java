package br.edu.infnet.trabalhoapiaula;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Deputado {
  
    @JsonIgnoreProperties(ignoreUnknown = true)
    
    @JsonProperty("nome")
    private String nome;

    @JsonProperty("id")
    private String id;

    @JsonProperty("email")
    private String email;

    @JsonProperty("siglaPartido")
    private String siglaPartido;

    @JsonProperty("urlFoto")
    private String urlFoto;

    public Deputado(){

    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonProperty("siglaPartido")
    public String getSiglaPartido() {
        return siglaPartido;
    }

    public void setSiglaPartido(String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }
    @JsonProperty("urlFoto")
    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }
    @JsonProperty("")
    public void setNome(String nome) {
        this.nome = nome;
    }

    

}
