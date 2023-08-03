package academy.atl.newsletter.validators;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class EmailValidatorTest {

    @Test
    public void elEmailTieneQueTenerArroba(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("fhiehfiehfhfe");
        assertFalse(resultado);
    }

    @Test
    public void elEmailTieneQueTenerPunto(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("fhiehf@iehfhfe");
        assertFalse(resultado);
    }

    @Test
    public void elArrobaNoSeaLaUltimaLetra(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("fhiehf.iehfhfe@");
        assertFalse(resultado);
    }

    @Test
    public void noTieneQueTenerMasDeUnArroba(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("fhi@ehf.ieh@fhfe@");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaEspacios(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("gini.bl anco@gmail.com");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaMasDe255Caracteres(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("a123456789b123456789c123456789d123456789e123456789f123456789g123456789h123456789i123456789j123456789k123456789l123456789m123456789n123456789o123456789p123456789q123456789r123456789s123456789t123456789u123456789v123456789w123456789x123456789y123456789z123456789a123456789b123456789c123456789d123456789e123456789f123456789g123456789h123456789i123456789j123456789k123456789l123456789m123456789n123456789o123456789p123456789q123456789r123456789s123456789t123456789u123456789v123456789w123456789x123456789y123456789z123456789a123456789b123456789c123456789d123456789e123456789f123456789g123456789h123456789i123456789j123456789k123456789l123456789m123456789n123456789o123456789p123456789q123456789r123456789s123456789t123456789u123456789v123456789w123456789x123456789y123456789z123456789a123456789b123456789c123456789d123456789e123456789f123456789g123456789h123456789i123456789j123456789k123456789l123456789m123456789n123456789o123456789p123456789q123456789r123456789s123456789t123456789u123456789v123456789w123456789x123456789y123456789z123456789@example.com");
        assertFalse(resultado);
    }

    @Test
    public void queTengaUnPuntoDespuesDelArroba(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("gini.blan.co@sagecom");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaCaracteresNoPermitidos() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("gini.bla%$£*(n.co@sage.com");
        assertFalse(resultado);
    }
}
