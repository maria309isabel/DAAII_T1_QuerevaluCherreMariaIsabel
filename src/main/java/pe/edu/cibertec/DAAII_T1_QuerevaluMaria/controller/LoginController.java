package pe.edu.cibertec.DAAII_T1_QuerevaluMaria.controller;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAAII_T1_QuerevaluMaria.service.UsuarioService;

@Controller
@RequestMapping("/auth")
public class LoginController {
    private UsuarioService usuarioService;
    @GetMapping("/login")
    public String login(){
        return "auth/frmlogin";
    }
    @GetMapping("/registro")
    public String registro(){
        return "/auth/registro";
    }

    @GetMapping("/pass")
    public String cambiopass(){
        return "/seguridad/formpass";
    }

    @GetMapping("/login-success")
    public String loginSuccess(){
        return "redirect:/auth/dashboard";
    }
    @GetMapping("/dashboard")
    public String dashboard(){
        return "auth/home";
    }
    @RequestMapping(value="/logout", method= RequestMethod.POST)
    public String closeSession(HttpSession session, Model model){
        session.invalidate();
        model.asMap().clear();
        return "redirect:/login";
    }
}