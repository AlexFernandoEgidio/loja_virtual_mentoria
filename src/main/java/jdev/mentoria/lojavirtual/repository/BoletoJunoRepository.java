package jdev.mentoria.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jdev.mentoria.lojavirtual.model.BoletoJuno;

@Repository
public interface BoletoJunoRepository extends JpaRepository<BoletoJuno, Long> {

}
