package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // si agregamos el value de la anotacion con el metodo SQL no es necesario
    // usar un query metod, podemos nombrar el metodo de cualquier forma
    // pero es mejor usar el query metod por su flexibilidad y por buena practica
    // agregar el value con el metodo SQL igual
    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoria(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantodadStock, boolean estado);
}
