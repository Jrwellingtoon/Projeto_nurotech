package com.unit.Neurotech.Controle;


import com.unit.Neurotech.Repositorio.RepositoryFunctionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Functionary")
public class FunctionaryControl {

    @Autowired
    private RepositoryFunctionary repository;

    @GetMapping
   public ResponseEntity getAllFunctionary(){
        var allFunctionary = repository.findAll();
        return ResponseEntity.ok(allFunctionary);
    }

}
