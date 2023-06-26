/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUbigeo.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiUbigeo.dao.UbigeoRepository;
import pe.cibertec.ecommerce.ApiUbigeo.entity.Ubigeo;

/**
 *
 * @author USUARIO
 */
@Service
public class UbigeoServiceImpl implements UbigeoService{
    @Autowired
    private UbigeoRepository ubigeoRepository; 

    @Override
    public List<Ubigeo> findAll() {
       return (List<Ubigeo>) ubigeoRepository.findAll();
    }

    @Override
    public Ubigeo findById(Long id) {
         return ubigeoRepository.findById(id).orElse(null);  
    }

    @Override
    public Ubigeo add(Ubigeo ubigeo) {
        
        if (ubigeo.getTipo() != 4) { // Si no es un país
            if ( ubigeo.getUbiPadre() == 0) {
                throw new IllegalArgumentException("Ingrese el ID del ubigeo padre.");
            }
        }
        return ubigeoRepository.save(ubigeo);
    }

    @Override
public Ubigeo update(Long id, Ubigeo ubigeo) {
    Ubigeo existingUbigeo = ubigeoRepository.findById(id).orElse(null);
    if (existingUbigeo != null) {
        existingUbigeo.setTipo(ubigeo.getTipo());
        existingUbigeo.setDescripcion(ubigeo.getDescripcion());
        existingUbigeo.setUbiPadre(ubigeo.getUbiPadre());
        return ubigeoRepository.save(existingUbigeo);
    } else {
        throw new IllegalArgumentException("El Ubigeo con ID " + id + " no existe.");
    }
}

    @Override
    public void delete(Long id) {
        Ubigeo ubigeosDB = ubigeoRepository.findById(id).get();
        ubigeoRepository.delete(ubigeosDB);
    }

    @Override
    public List<Ubigeo> findByUbigeoPadre(int ubiPadre) {
        return ubigeoRepository.findByUbiPadre(ubiPadre);
    }
    
    
    
}


