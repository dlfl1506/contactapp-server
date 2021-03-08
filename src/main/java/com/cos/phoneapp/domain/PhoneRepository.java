package com.cos.phoneapp.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

public interface PhoneRepository extends JpaRepository<Phone,Long>{

}
