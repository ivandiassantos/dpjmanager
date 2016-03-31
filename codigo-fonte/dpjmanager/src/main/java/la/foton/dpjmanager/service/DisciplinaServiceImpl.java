package la.foton.dpjmanager.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.DisciplinaDAO;
import la.foton.dpjmanager.entidades.Disciplina;

@Service("disciplinaService")
public class DisciplinaServiceImpl implements DisciplinaService
{
   @Autowired
   private DisciplinaDAO disciplinaDAO;

   @Override
   public List<Disciplina> listarDisciplinas()
   {
      return disciplinaDAO.listarDisciplinas();
   }

}
