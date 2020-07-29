package com.web.dispatcher;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.web.modelos.Servicios;
import com.web.modelos.ServiciosDAO;

@SuppressWarnings("serial")
public class ServiciosDispatcher extends ActionSupport {

	// Atributos

	// Cargar servicios
	ArrayList<Servicios> lista = new ArrayList<Servicios>();
	private Servicios servi = new Servicios();
	int id; // como el nombre del dato que se le pasa por AJAX

	// Eliminar servicios
	int ideliminar; // tiene que coincidir con el name del form
	
	// Añadir servicios
	
	private String servicename;
	private String servicedesc;
	private double serviceprice;	
	
	// Update servicios
	
	private int serviceid;
	
	// Cargar un servicio
	
	private String nombre;
	private String descripcion;
	private double precio;
	
	// Esto es para el Grid de verServicio.jsp
	private Servicios serv;

	// Métodos

	public String cambiarServicio() {
		// es mejor crear un objeto y pasárselo después 
		new ServiciosDAO().cambiarServiciosDAO(serviceid, servicename, servicedesc, serviceprice);
		return SUCCESS;
	}

	public String anadirServicio() {

		new ServiciosDAO().anadirServiciosDAO(servicename, servicedesc, serviceprice);
		return SUCCESS;
	}

	public String eliminarServicio() {

		new ServiciosDAO().eliminarServiciosDAO(ideliminar);
		return SUCCESS;
	}

	public String cargarServicios() {
		ArrayList<Servicios> serv = new ArrayList<Servicios>();
		serv = new ServiciosDAO().listadoServiciosDAO();

		setLista(serv);
		// System.out.println(serv);
		return SUCCESS;
	}
	
	public String cargarUnServicio() {
		setId(id);
		return SUCCESS;
	}
	
	public String cargarUnServicio2() {
		ArrayList<Servicios> servicios = new ArrayList<Servicios>();
		serv = new ServiciosDAO().cargarUnServicioDAO(id);
		servicios.add(serv);
		setLista(servicios);
		// System.out.println(id);
		
		return SUCCESS;
	}
	
	public String datosServicio() {
		Servicios serv = new ServiciosDAO().cargarUnServicioDAO(serviceid);
		setServiceid(serv.getId());
		setServicename(serv.getNombre());
		setServicedesc(serv.getDescripcion());
		setServiceprice(serv.getPrecio());
		
		return SUCCESS;
	}

	// Getter Setter

	public ArrayList<Servicios> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Servicios> lista) {
		this.lista = lista;
	}

	public Servicios getServi() {
		return servi;
	}

	public void setServi(Servicios servi) {
		this.servi = servi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdeliminar() {
		return ideliminar;
	}

	public void setIdeliminar(int ideliminar) {
		this.ideliminar = ideliminar;
	}
	
	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public String getServicedesc() {
		return servicedesc;
	}

	public void setServicedesc(String servicedesc) {
		this.servicedesc = servicedesc;
	}
	
	public double getServiceprice() {
		return serviceprice;
	}

	public void setServiceprice(double serviceprice) {
		this.serviceprice = serviceprice;
	}
	
	public int getServiceid() {
		return serviceid;
	}

	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Servicios getServ() {
		return serv;
	}

	public void setServ(Servicios serv) {
		this.serv = serv;
	}

	// toString()
	
	@Override
	public String toString() {
		return "ServiciosDispatcher [lista=" + lista + ", servi=" + servi + ", id=" + id + ", ideliminar=" + ideliminar
				+ ", servicename=" + servicename + ", servicedesc=" + servicedesc + ", serviceprice=" + serviceprice
				+ ", serviceid=" + serviceid + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
				+ precio + ", serv=" + serv + "]";
	}

}
