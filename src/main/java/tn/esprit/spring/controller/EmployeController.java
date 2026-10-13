package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.service.IEmployeService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/employes")
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping("/add")
    public Employe add(@RequestBody Employe employe) {
        return employeService.add(employe);
    }

    @PutMapping("/update")
    public Employe update(@RequestBody Employe employe) {
        return employeService.update(employe);
    }

    @GetMapping("/all")
    public List<Employe> getAll() {
        return employeService.findAll();
    }

    @GetMapping("/{id}")
    public Employe getById(@PathVariable Long id) {
        return employeService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeService.delete(id);
    }
}