package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PROJETO_FASE")
@EqualsAndHashCode
public class ProjetoFase implements Serializable
{

   /** @TODO Comentar atributo */
   private static final long serialVersionUID = 6366423233306035418L;

   @Id
   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "COD_PROJETO")
   private Projeto projeto;

   @Id
   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "COD_FASE")
   private Fase fase;

}
