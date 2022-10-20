package net.eurotech.serapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author cfuente
 *
 */

@Entity
@Table(name="documento")

public class Documento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_documento")
	private int id_documento;
	
	@Column(name="fecha_documento")
	private java.sql.Date fecha_documento;
	
	@Column(name="fecha_subida")
	private java.sql.Date fecha_subida;
	
	@Column(name="hash_md5")
	private String hash_md5;
	
	@Lob
	@Column(name="fichero")
	private byte[] fichero;
	
	@Column(name="tipo_fichero")
	private String tipo_fichero;
	
	@Column(name="id_doc_padre")
	private Long id_doc_padre;
	
	public Documento(){}
	
	public Documento(int id_documento, java.sql.Date fecha_documento, java.sql.Date fecha_subida, String hash_md5, String id_tipo_fichero, byte[] fichero, Long id_doc_padre ) {
		this.id_documento = id_documento;
		this.fecha_documento = fecha_documento;
		this.fecha_subida = fecha_subida;
		this.hash_md5 = hash_md5;
		this.fichero = fichero;
		this.tipo_fichero = tipo_fichero;
		this.id_doc_padre = id_doc_padre;
	}

	
	public Documento(String hash_md5) {
		super();
		this.hash_md5 = hash_md5;
	}

	public java.sql.Date getFecha_documento() {
		return fecha_documento;
	}

	public void setFecha_documento(java.sql.Date fecha_documento) {
		this.fecha_documento = fecha_documento;
	}

	public java.sql.Date getFecha_subida() {
		return fecha_subida;
	}

	public void setFecha_subida(java.sql.Date fecha_subida) {
		this.fecha_subida = fecha_subida;
	}

	public String getTipo_fichero() {
		return tipo_fichero;
	}

	public void setTipo_fichero(String tipo_fichero) {
		this.tipo_fichero = tipo_fichero;
	}

	public int getId_documento() {
		return id_documento;
	}

	public void setId_documento(int id_documento) {
		this.id_documento = id_documento;
	}

	public Long getId_doc_padre() {
		return id_doc_padre;
	}

	public void setId_doc_padre(Long id_doc_padre) {
		this.id_doc_padre = id_doc_padre;
	}

	public String getHash_md5() {
		return hash_md5;
	}

	public void setHash_md5(String hash_md5) {
		this.hash_md5 = hash_md5;
	}

	public byte[] getFichero() {
		return fichero;
	}

	public void setFichero(byte[] fichero) {
		this.fichero = fichero;
	}

	@Override
	public String toString() {
		return "Documento[ id_documento=" + id_documento + ", id_doc_padre=" + id_doc_padre + ", tipo_fichero=" + tipo_fichero + ", hash_md5=" + hash_md5 + "]";
	}


}
