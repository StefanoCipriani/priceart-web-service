package com.xantrix.webapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "dettlistini")
@Data
public class DettListini {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Size(min = 5, max = 20, message = "{Size.DettListini.codArt.Validation}")
	@NotNull(message = "{NotNull.DettListini.codArt.Validation}")
	@Column(name = "CODART")
	private String codArt;
	@NotNull(message = "{NotNull.DettListini.idList.Validation}")
	@Column(name = "IDLIST")
	private String idList;
	@Min(value = (long) 0.01, message = "{Min.DettListini.prezzo.Validation}")
	@Column(name = "PREZZO")
	private Double prezzo;
}
