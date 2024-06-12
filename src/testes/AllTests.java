package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CadastrarUsuarioFaker.class, CadastroMovimentacao.class, CadastroUsuario.class, ExemploDeTeste.class })
public class AllTests {

}
