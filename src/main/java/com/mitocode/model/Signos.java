package com.mitocode.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "signos")
public class Signos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSigno;

	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_signo_paciente"))
	private Paciente paciente;


	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;

	@Size(min = 1, max = 4, message = "Temperatura debe tener minimo 1 caracteres")
	@Column(name = "temperatura", nullable = true, length = 4)
	private String temperatura;

	@Size(min = 1, max = 10, message = "Ritmo debe tener minimo 1 caracteres")
	@Column(name = "ritmo", nullable = true, length = 10)
	private String ritmo;

	@Size(min = 1, max =20, message = "Pulso debe tener minimo 1 caracteres")
	@Column(name = "pulso", nullable = true, length = 20)
	private String pulso;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getRitmo() {
		return ritmo;
	}

	public void setRitmo(String ritmo) {
		this.ritmo = ritmo;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public void setIdSigno(Integer idSigno) {
		this.idSigno = idSigno;
	}

	public Integer getIdSigno() {
		return idSigno;
	}
}
