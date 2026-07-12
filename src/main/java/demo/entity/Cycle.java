package demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;

@Entity
public class Cycle {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String cycleName;


@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(
    name = "cycle_component",
    joinColumns = @JoinColumn(name = "cycle_id"),
    inverseJoinColumns = @JoinColumn(name = "component_id")
)
private List<Component> components;



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCycleName() {
	return cycleName;
}

public void setCycleName(String cycleName) {
	this.cycleName = cycleName;
}

public List<Component> getComponents() {
	return components;
}

public void setComponents(List<Component> components) {
	this.components = components;
}



}
