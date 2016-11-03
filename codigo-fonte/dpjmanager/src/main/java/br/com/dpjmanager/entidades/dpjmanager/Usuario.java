package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Classe de mapeamento da tabela de usuários.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Entity
@Table(name = "USUARIO")
@NoArgsConstructor
@NamedQueries({
   @NamedQuery(name = Usuario.QUERY_OBTEM_USUARIO_POR_LOGIN,
            query = "select u from Usuario u join fetch u.listaPerfisAcesso lpa join fetch lpa.perfilAcesso pa where u.login =:login")
})
public class Usuario implements UserDetails, Serializable
{
   private static final long serialVersionUID = 2315342610761571571L;
   
   public static final String QUERY_OBTEM_USUARIO_POR_LOGIN = "obtemUsuarioPorLogin";

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO")
   @SequenceGenerator(name = "SEQ_USUARIO", sequenceName = "SEQ_USUARIO", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_USUARIO")
   private Long codUsuario;
   @Getter
   @Setter
   @Column(name = "NOME_USUARIO")
   private String nomeUsuario;
   @Getter
   @Setter
   @Column(name = "LOGIN")
   private String login;
   @Getter
   @Setter
   @Column(name = "SENHA")
   private String senha;
   @Getter
   @Setter
   @Column(name = "ATIVO")
   private boolean ativo;
   @Getter
   @Setter
   @Column(name = "PRIMEIRO_ACESSO")
   private boolean primeiroAcesso;
   @Getter
   @Setter
   @Temporal(TemporalType.DATE)
   @Column(name = "DATA_CADASTRO")
   private Date dataCadastro;
   @Getter
   @Setter
   @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
   private List<UsuarioPerfilAcesso> listaPerfisAcesso;

   @Override
   public Collection<? extends GrantedAuthority> getAuthorities()
   {
      return listaPerfisAcesso;
   }

   @Override
   public String getPassword()
   {
      return senha;
   }

   @Override
   public String getUsername()
   {
      return login;
   }

   @Override
   public boolean isAccountNonExpired()
   {
      return true;
   }

   @Override
   public boolean isAccountNonLocked()
   {
      return true;
   }

   @Override
   public boolean isCredentialsNonExpired()
   {
      return true;
   }

   @Override
   public boolean isEnabled()
   {
      return ativo;
   }
}
