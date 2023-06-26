/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUbigeo.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiUbigeo.entity.Ubigeo;


public interface UbigeoService {
    public List<Ubigeo> findAll();
    public Ubigeo findById(Long id);
    public List<Ubigeo> findByUbigeoPadre(int ubiPadre);
    public Ubigeo add(Ubigeo ubigeo);
    public Ubigeo update(Long id, Ubigeo ubigeo);
    public void delete(Long id);
   
}
