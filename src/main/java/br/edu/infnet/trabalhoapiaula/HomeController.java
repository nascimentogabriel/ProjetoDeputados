package br.edu.infnet.trabalhoapiaula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@SpringBootApplication
public class HomeController {
    
    @Autowired
    DeputadoService deputadoService;

    @RequestMapping("/")
    public String home(Model model){
        List<Deputado> d =  deputadoService.buscarDeputados("10").dados;
        model.addAttribute("deputados", d);
        return "index";
    }
}
