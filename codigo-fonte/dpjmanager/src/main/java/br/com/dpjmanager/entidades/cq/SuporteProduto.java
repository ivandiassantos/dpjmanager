
package br.com.dpjmanager.entidades.cq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe de mapeamento de ocorrências.
 * 
 * @author Junho/2017: Ivan Dias <DD>
 */
@Entity
@Table(name = "suporte_produtos")
@Getter
@Setter
public class SuporteProduto
{

   @Id
   @Column(name = "DBID")
   private Long id;

   @Column(name = "ID")
   private String idSuporte;

   @Column(name = "ASSUNTO")
   private String descricaoSuporte;
}
