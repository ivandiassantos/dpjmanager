package br.com.dpjmanager.entidades.rhour;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRJ")
@NamedQuery(name = "listaPorSolicitacao",
         query = "select p from Projeto p join fetch p.atividades a where a.nomeAtividade like (:nomeSolicitacao)")
public class Projeto implements Serializable
{
   private static final long serialVersionUID = 8841329206163703638L;
   @Id
   @Getter
   @Setter
   @Column(name = "PRJCOD")
   private Long codProjeto;

   @Getter
   @Setter
   @Column(name = "PRJNOM")
   private String nomeProjeto;
   @Getter
   @Setter
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "projeto")
   private List<Atividade> atividades;

}
