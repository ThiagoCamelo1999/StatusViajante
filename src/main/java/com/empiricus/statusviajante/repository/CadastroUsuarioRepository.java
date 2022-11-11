package com.empiricus.statusviajante.repository;

import com.empiricus.statusviajante.model.CadastroUsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuarioModel, Long> {

    public List<CadastroUsuarioModel> findAllByNomeContainingIgnoreCase(String nome);


}
