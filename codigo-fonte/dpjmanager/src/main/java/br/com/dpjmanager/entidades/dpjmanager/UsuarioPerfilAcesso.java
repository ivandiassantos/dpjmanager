package br.com.dpjmanager.entidades.dpjmanager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.security.core.GrantedAuthority;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Mapeamento da tabela de relacionamento entre usuário e perfil de acesso.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Entity
@Table(name = "USUARIO_PERFIL_ACESSO")
@NoArgsConstructor
public class UsuarioPerfilAcesso implements GrantedAuthority
{
   private static final long serialVersionUID = -846268696203986334L;
   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO_PERFIL_ACESSO")
   @SequenceGenerator(name = "SEQ_USUARIO_PERFIL_ACESSO", sequenceName = "SEQ_USUARIO_PERFIL_ACESSO", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_USUARIO_PERFIL_ACESSO")
   private Long codUsuarioPerfilAcesso;
   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "COD_USUARIO")
   private Usuario usuario;
   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "COD_PERFIL_ACESSO")
   private PerfilAcesso perfilAcesso;

   @Override
   public String getAuthority()
   {
      return perfilAcesso.getRolePerfilAcesso();
   }

}
