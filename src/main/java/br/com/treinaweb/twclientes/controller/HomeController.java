package br.com.treinaweb.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    

    @GetMapping("/")
    public String home() {
        return "home";
    }

// Podemos passar atraves do  Model ou ModelMap
    @GetMapping("/menssagem")
    public ModelAndView menssagem() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("menssagem");
        modelAndView.addObject("menssagem", "outra mensagem vinda do servidor");

        return modelAndView;

    }

    // @GetMapping("/saudacao/{nome}")
    // public ModelAndView saudacao(@PathVariable String nome) {
    //     ModelAndView modelAndView = new ModelAndView();

    //     modelAndView.setViewName("saudacao");
    //     modelAndView.addObject("nome", nome);

    //     return modelAndView;
    // }

    @GetMapping("/saudacao")
    public ModelAndView saudacao(@RequestParam(required = false, defaultValue = "treinaWeb") String nome) {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);

        return modelAndView;

    }

}
