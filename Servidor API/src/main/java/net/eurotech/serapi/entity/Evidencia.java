/**
 * 
 */
package net.eurotech.serapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author Carlos
 *
 */

@Entity
@Table(name="evidencia")
public class Evidencia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_evidencia")
	private int id_evidencia;
	
	@Column(name="id_documento")
	private int id_documento;
	
	@Column(name="id_tipo_evidencia")
	private int id_tipo_evidencia;
	
	public Evidencia(){}
	
	public Evidencia(int id_evidencia, int id_documento, int id_tipo_evidencia) {
		this.id_evidencia = id_evidencia;
		this.id_documento = id_documento;
		this.id_tipo_evidencia = id_tipo_evidencia;
	}

	public int getId_evidencia() {
		return id_evidencia;
	}

	public void setId_evidencia(int id_evidencia) {
		this.id_evidencia = id_evidencia;
	}

	public int getId_documento() {
		return id_documento;
	}

	public void setId_documento(int id_documento) {
		this.id_documento = id_documento;
	}

	public int getId_tipo_evidencia() {
		return id_tipo_evidencia;
	}

	public void setId_tipo_evidencia(int id_tipo_evidencia) {
		this.id_tipo_evidencia = id_tipo_evidencia;
	}
	
	@Override
	public String toString() {
		return "Evidencia[ id_evidencia=" + id_evidencia + ", id_documento=" + id_documento + ", id_tipo_evidencia=" + id_tipo_evidencia + "]";
	}

}
