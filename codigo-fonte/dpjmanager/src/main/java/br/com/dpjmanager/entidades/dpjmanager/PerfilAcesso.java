package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Classe de mapeamento da tabela de perfis de acesso.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Entity
@Table(name = "PERFIL_ACESSO")
@NoArgsConstructor
public class PerfilAcesso implements Serializable
{

   private static final long serialVersionUID = -516690773963025779L;

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERFIL_ACESSO")
   @SequenceGenerator(name = "SEQ_PERFIL_ACESSO", sequenceName = "SEQ_PERFIL_ACESSO", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_PERFIL_ACESSO")
   private Long codPerfilAcesso;
   @Getter
   @Setter
   @Column(name = "DESCRICAO_PERFIL_ACESSO")
   private String descricaoPerfilAcesso;
   @Getter
   @Setter
   @Column(name = "ROLE_PERFIL_ACESSO")
   private String rolePerfilAcesso;
}
