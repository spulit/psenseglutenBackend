package com.psensegluten.backend.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.psensegluten.backend.Entity.SectionEntity;

@Repository
public interface SectionRepository extends CrudRepository<SectionEntity, String> {
}
