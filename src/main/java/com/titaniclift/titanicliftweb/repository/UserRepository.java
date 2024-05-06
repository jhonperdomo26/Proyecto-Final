package com.titaniclift.titanicliftweb.repository;

import com.titaniclift.titanicliftweb.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuarios, Long> {

}