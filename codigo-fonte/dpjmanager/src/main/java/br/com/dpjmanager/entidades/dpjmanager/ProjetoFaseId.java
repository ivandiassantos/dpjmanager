package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import javax.persistence.Column;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class ProjetoFaseId implements Serializable
{

   /** @TODO Comentar atributo */
   private static final long serialVersionUID = -4846884453560419629L;

   @Getter
   @Setter
   @Column(name = "COD_PROJETO")
   private Long codProjeto;

   @Getter
   @Setter
   @Column(name = "COD_FASE")
   private Long codFase;
}
