/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUbigeo.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiUbigeo.entity.Ubigeo;


public interface UbigeoRepository extends CrudRepository<Ubigeo, Long>{
    List<Ubigeo> findByUbiPadre(int ubiPadre);
}
