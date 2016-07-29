
package br.com.dpjmanager.entidades.dpjmanager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DISCIPLINA")
@Getter
@Setter
@NamedQuery(name = "listaDisciplinas", query = "select d from Disciplina d ")
public class Disciplina
{

   @Id
   @Column(name = "COD_DISCIPLINA")
   private Long codDisciplina;
   @Column(name = "DESCRICAO_DISCIPLINA")
   private String descricaoDisciplina;
}
