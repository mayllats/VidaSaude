package com.example.mayllasouza.vidasaude.service;

import com.example.mayllasouza.vidasaude.Medico;
import com.example.mayllasouza.vidasaude.Especialidade;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface InterfaceDeServicos {
    @GET("medicos.php")
    Call<List<Medico>>  Medico(@Path("MED_NOME") String nome, @Path("MED_CRM") String crm);
    @GET("especialidades.php")
    Call<List<Especialidade>> especialidades(@Path("Id") int id, @Path("ESP_NOME") String nome);
}
