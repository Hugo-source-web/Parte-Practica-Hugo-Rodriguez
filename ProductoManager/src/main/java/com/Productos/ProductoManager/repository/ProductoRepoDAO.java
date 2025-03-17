package com.Productos.ProductoManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Productos.ProductoManager.entity.Producto;

import java.util.List;

@Repository
public interface ProductoRepoDAO extends JpaRepository<Producto, Long> {

    List<Producto> findByPrecioLessThan(int precio);

}
