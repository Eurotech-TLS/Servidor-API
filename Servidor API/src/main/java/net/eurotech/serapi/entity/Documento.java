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
	
	@Column(name="id_doc_padre")
	private int id_doc_padre;
	
	@Column(name="id_tipo_fichero")
	private int id_tipo_fichero;
	
	@Column(name="hash_md5")
	private String hash_md5;
	
	@Lob
	@Column(name="fichero")
	private byte[] fichero;
	
	public Documento(){}
	
	public Documento(int id_documento, int id_doc_padre, int id_tipo_fichero, String hash_md5, byte[] fichero) {
		this.id_doc_padre = id_doc_padre;
		this.id_documento = id_documento;
		this.id_tipo_fichero = id_tipo_fichero;
		this.hash_md5 = hash_md5;
		this.fichero = fichero;
	}

	public int getId_documento() {
		return id_documento;
	}

	public void setId_documento(int id_documento) {
		this.id_documento = id_documento;
	}

	public int getId_doc_padre() {
		return id_doc_padre;
	}

	public void setId_doc_padre(int id_doc_padre) {
		this.id_doc_padre = id_doc_padre;
	}

	public int getId_tipo_fichero() {
		return id_tipo_fichero;
	}

	public void setId_tipo_fichero(int id_tipo_fichero) {
		this.id_tipo_fichero = id_tipo_fichero;
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
		return "Documento[ id_documento=" + id_documento + ", id_doc_padre=" + id_doc_padre + ", id_tipo_fichero=" + id_tipo_fichero + ", hash_md5=" + hash_md5 + "]";
	}


}
