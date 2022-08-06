package com.guiSuttanni.testeSpringH2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENTO
	private Long id;
	
	private String name;
	
	//Construtor
	//Pode ser instanciada sem nenhum argumento	
	public Department() {
		
	}
	
	//Gerar getters and setters automaticos
	//Btn direito - Source - Generate Getters and Setters	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
