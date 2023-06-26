/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUbigeo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiUbigeo.entity.Ubigeo;
import pe.cibertec.ecommerce.ApiUbigeo.service.UbigeoService;

@RestController
@RequestMapping("/api/ubigeo")
public class UbigeoController {

    @Autowired
    UbigeoService ubigeoService;

    @GetMapping("/findAll")
    public List<Ubigeo> findAll() {
        return ubigeoService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Ubigeo findById(@PathVariable Long id) {
        return ubigeoService.findById(id);
    }

    
    @PostMapping("/add")
    public Ubigeo add(@RequestBody Ubigeo ubigeo) {
        return ubigeoService.add(ubigeo);
    }

    @GetMapping("/findByUbigeoPadre/{ubiPadre}")
    public List<Ubigeo> findByUbigeoPadre(@PathVariable int ubiPadre) {
    return ubigeoService.findByUbigeoPadre(ubiPadre);
    }
    
    @PutMapping("/update/{id}")
    public Ubigeo update(@PathVariable Long id,
            @RequestBody Ubigeo ubigeo) {
        return ubigeoService.update(id, ubigeo);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        ubigeoService.delete(id);
    }
}
