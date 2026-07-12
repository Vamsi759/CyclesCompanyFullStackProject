package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.Component;

public interface ComponentRepository extends JpaRepository
<Component,Long> {

}
