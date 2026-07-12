package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.Component;
import demo.entity.Cycle;

public interface CycleRepository  extends JpaRepository
<Cycle,Long> {

}