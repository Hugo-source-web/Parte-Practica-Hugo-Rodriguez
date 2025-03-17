package com.Productos.ProductoManager.controller;

import com.Productos.ProductoManager.entity.Producto;
import com.Productos.ProductoManager.repository.ProductoRepoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Productos")
public class ProductoController {

    @Autowired
    private ProductoRepoDAO productoRepoDAO;

    @GetMapping
    public List<Producto> ListarProductos() {
        return productoRepoDAO.findAll();
    }

    @GetMapping("/menor-precio")
    public List<Producto> ListarProductosMenorPrecioA(@RequestParam int precio) {
        return productoRepoDAO.findByPrecioLessThan(precio);
    }
}
