package br.edu.infnet.trabalhoapiaula;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetornoApi {

    @JsonProperty("dados")    
    List<Deputado> dados;

}
