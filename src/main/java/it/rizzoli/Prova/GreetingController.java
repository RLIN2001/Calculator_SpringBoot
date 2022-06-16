package it.rizzoli.Prova;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @RequestMapping(value = "/somma", method = RequestMethod.GET)
    public String somma(
            @RequestParam("val1") int num1,
            @RequestParam("val") int num2,Model model) {
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("ris", num1+num2);
        return "greeting";
       }
    @RequestMapping(value = "/differenza", method = RequestMethod.GET)
    public String differenza(
            @RequestParam("val1") int num1,
            @RequestParam("val") int num2,Model model) {
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("ris", num1-num2);
        return "greeting";
    }   @RequestMapping(value = "/prodotto", method = RequestMethod.GET)
    public String prodotto(
            @RequestParam("val1") int num1,
            @RequestParam("val") int num2,Model model) {
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("ris", num1*num2);
        return "greeting";

    }   @RequestMapping(value = "/divisione", method = RequestMethod.GET)
    public String divisione(
            @RequestParam("val1") int num1,
            @RequestParam("val") int num2,Model model) {
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("ris", num1/num2);
        return "greeting";
    }   @RequestMapping(value = "/potenza", method = RequestMethod.GET)
    public String potenza(
            @RequestParam("val1") int num1,
            @RequestParam("val") int num2,Model model) {
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("ris", Math.pow(num1,num2));
        return "greeting";
    }



}
