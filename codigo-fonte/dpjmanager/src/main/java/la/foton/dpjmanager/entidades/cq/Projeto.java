package la.foton.dpjmanager.entidades.cq;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "REPOPROJECT")
public class Projeto implements Serializable
{

   /** @TODO Comentar atributo */
   private static final long serialVersionUID = 5098193696916950068L;

   @Id
   @Column(name = "DBID")
   @Getter
   @Setter
   private Long codProjeto;

   @Column(name = "NAME")
   @Getter
   @Setter
   private String nomeProjeto;
}
