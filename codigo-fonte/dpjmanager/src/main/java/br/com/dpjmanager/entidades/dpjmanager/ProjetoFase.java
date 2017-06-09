package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Mapeamento de relacionamento entre projeto e fase.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Entity
@Table(name = "PROJETO_FASE")
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ProjetoFase implements Serializable
{
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
