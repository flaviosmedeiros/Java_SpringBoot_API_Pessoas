package br.com.fmstudos.personapi.repository;


import br.com.fmstudos.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
