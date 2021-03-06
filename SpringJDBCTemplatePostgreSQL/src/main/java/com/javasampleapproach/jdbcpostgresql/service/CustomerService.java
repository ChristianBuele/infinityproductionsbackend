package com.javasampleapproach.jdbcpostgresql.service;

import java.util.ArrayList;
import java.util.List;

import com.javasampleapproach.jdbcpostgresql.model.*;

public interface CustomerService {
	void insert(Customer cus);
	void insertBatch(List<Customer> customers);
	List<Customer> loadAllCustomer();
	void getCustomerById(long cust_id);
	void getCustomerNameById(long cust_id);
	void getTotalNumerCustomer();
	public carrito insertarCarrito(carrito carrito);
	int verMaxId();
	usuario insertarUsuario(usuario usuario);
	tarjeta ingresarTarjeta (tarjeta tarjeta);
	productos ingresarProducto(productos producto);
	void insertarImagen(ImageModel image);
	ImageModel cargarImagen(String id);
	usuario existeUsuario(String correo);
	boolean contraseniaCorrecta(String correo,String contra);
	factura insertarFactura(factura factura);
	venta insertarVenta(venta venta);
	carritoproducto insertarcarritoProducto(carritoproducto carritoproducto);
	boolean addProducto(productos producto);
	int getIdImagen();
	List<productoDao> findAllProducts();
	List<productos> listarProductos();
	int getIdUsuario(String correo);
	boolean addPreset(presets preset);
	List<presets> getPreset(ArrayList<String> nombres);
	List<presets> findPremiumPresets();
	List<presets> findFreePresets();
	List<tarjeta> listAllTarjeta(int id);
	List<eventosDao> listarEventos();
	List<facturaDao> listarFacturas(int id);
	List<carritoproducto> getProductoCarrito(int idCarrito);
	boolean pagarFactura(int id_tarjeta,double nuevo_valor); 
	double saldoTarjeta(int id);
	usuario getDatosUsuario(int id);
	int getIdFactura();
	List<preventa> listarpreventa(int id_usuario,int id_tarjeta);
	void eliminarProducto(int id);
	List<carritoDetallado> getCarritoDetalladoProductos(int idCarrito);
	List<carritoDetallado> getCarritoDetalladoPresets(int idCarrito);
	boolean addValorCarrito(int id,double valor);
	boolean actualizarIdCarrito(int id_usuario,int id_Carrito);
	void hola();
	void eliminarproductocarrito(int id);
	usuario datosUsuario(int id);
	void actualizarDataUsuario(String nom,String ape,String contra,int id);
	List<carritoproductoDao> listarProCarri (int id);
	int idCarrito(int id);
	boolean addPresetCarrito(presetcarrito preset);
	String getCorreoUsuario(int id_usuario);
	boolean eliminarTarjeta(int id);
	boolean eliminarPresetCarrito(int id);
	List<usuario> cargarUsuario();
	boolean actualizarEstadoUsuario(int id,String estado);
}
