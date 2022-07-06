package com.spring.aero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.aero.model.Language;
@Repository
public interface LanguageRepository extends JpaRepository<Language, Long>{

}
