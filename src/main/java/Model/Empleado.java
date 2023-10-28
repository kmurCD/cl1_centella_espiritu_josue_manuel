package Model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "nro_hijos")
    private Integer nroHijos;

    @Column(name = "sueldo")
    private Double sueldo;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", nombres=" + nombres + ", nroHijos=" + nroHijos + ", sueldo=" + sueldo + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Integer getNroHijos() {
		return nroHijos;
	}

	public void setNroHijos(Integer nroHijos) {
		this.nroHijos = nroHijos;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate localDate) {
		this.fechaNacimiento = localDate;
	}
    
    
}
