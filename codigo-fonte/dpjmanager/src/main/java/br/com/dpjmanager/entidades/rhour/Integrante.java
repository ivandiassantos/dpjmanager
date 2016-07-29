
package br.com.dpjmanager.entidades.rhour;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ITG")
public class Integrante implements Serializable
{

   /** @TODO Comentar atributo */
   private static final long serialVersionUID = -7294048316804152796L;
   @Id
   @Getter
   @Setter
   @Column(name = "ITGCOD")
   private Long codIntegrante;
   @Getter
   @Setter
   @Column(name = "ITGNOM")
   private String nomeIntegrante;
}
