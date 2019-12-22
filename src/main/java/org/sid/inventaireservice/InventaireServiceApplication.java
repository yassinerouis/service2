package org.sid.inventaireservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Entity
class Inventaire{
	public Inventaire() {
		super();
	}
	public Inventaire(long id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Inventaire [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}
	@Id @GeneratedValue
	private long id;
	private String name;
	private String price;
	
}
@RepositoryRestResource
interface InventaireRepository extends JpaRepository<Inventaire,Long>{
	
}

@SpringBootApplication
public class InventaireServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventaireServiceApplication.class, args);
	}

}
