package ru.suai.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.suai.cloud.model.Greeting;
import ru.suai.cloud.repository.GreetingRepository;

@Controller
public class GreetingController {
    GreetingRepository repository;

    @Autowired
    public GreetingController(GreetingRepository repository){
        this.repository = repository;
    }

    @GetMapping("/")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        repository.save(greeting);
        return "result";
    }

}
