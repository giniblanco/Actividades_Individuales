package academy.atl.newsletter.controllers;

import academy.atl.newsletter.models.Subscriber;
import academy.atl.newsletter.repository.EmailRepository;
import academy.atl.newsletter.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsletterController {

    @Autowired
    private EmailRepository emailRepository;

    @PostMapping("/api/newsletter")
    public String registrar (@RequestBody Subscriber subscriber) {

        String email = subscriber.getEmail();

        EmailValidator emailValidator = new EmailValidator();
        if (!emailValidator.esValido(email)){
            return "El email no es valido";
        }

        // guardar el email en base de datos
        emailRepository.guardarEmail(email);

        return "Email guardado: " + email;
    }

    @PostMapping("/api/newsletter/unsubscribe")
    public String getUnsubscribe (@RequestBody Subscriber subscriber) {

        String email = subscriber.getEmail();

        // traer el email de la base de datos para luego eliminarlo
        emailRepository.eliminarEmail(email);

        return ("email eliminado: " + email);
    }

    @GetMapping("/api/newsletter/emails")
    public List<String> getAllEmails (){
        List<String> emails = emailRepository.traerTodosLosEmails();
        return emails;
    }
}
