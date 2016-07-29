
package br.com.dpjmanager.entidades.cq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DEFEITO")
public class Defeito
{

   @Id
   @Getter
   @Setter
   @Column(name = "DBID")
   private Long codDefeito;

   @Getter
   @Setter
   @Column(name = "ORIGEM")
   private String origem;

}
