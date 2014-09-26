package bcmshipping.ejb;

import bcmshipping.entity.Usuario;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;


@Stateful
@LocalBean
public class UsuarioBean {

    private Usuario usuarioActual;
    

public void logearse(String unAlias, String unaClae) {
    this.usuarioActual = new Usuario();
}
    
}
