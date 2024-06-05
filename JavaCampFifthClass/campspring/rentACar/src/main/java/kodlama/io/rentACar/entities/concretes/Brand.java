package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands")
@Data // getters and setters 

//@Getter only using for getters
//@Setter only using for setters
@AllArgsConstructor  // full parameters constructors.
@NoArgsConstructor // no parameters constructors.
@Entity // Bu class bir veritabani  icin entitysin ve tablo olarakta brandslere karsilik gelir

public class Brand {
	private int id;
	private String name;

}
