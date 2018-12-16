package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;


@Controller
public class HomeController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final String INDEX = "index";

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/")
    public String index(Model model) {
        log.info("index action called...");

        List<Student> students = userService.fetchAll();
        model.addAttribute("students", students);

        log.info("FIND user by firstName: " + userService.findByFirstName("Faisal"));
        log.info("FIND user by firstName and lastname: " + userService.findByName("Faisal", "Jarkass"));

        log.info("index action ended...");
        return INDEX;
    }

    @GetMapping("/create")
    public String create(Model model) {
        log.info("create action called...");
        model.addAttribute("student", new Student());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student, Model model) {
        log.info("create post action called...");

        userService.save(student);
        model.addAttribute("students", userService.fetchAll());

        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable("id") int id, Model model) {
        log.info("details action called...");


        model.addAttribute("student", userService.findById(id));
        return "details";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, Model model) {
        log.info("delete  action called...");

        model.addAttribute("student", userService.findById(id));

        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Student student, Model model) {
        log.info("delete post action called...");

        userService.delete(student.getStudentId());


        model.addAttribute("students", userService.fetchAll());
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        log.info("edit action called...");

        model.addAttribute("student", userService.findById(id));
        return "edit";
    }

    @PutMapping("/edit")
    public String edit(@ModelAttribute Student student, Model model) {
        log.info("edit post action called...");

        userService.save(student);

        model.addAttribute("students", userService.fetchAll());
        return "redirect:/";
    }

    @GetMapping("/test/{id}")
    public String test(@PathVariable int id) {
        log.info("delete test action called id: " + id);
        return "redirect:/";
    }

}
