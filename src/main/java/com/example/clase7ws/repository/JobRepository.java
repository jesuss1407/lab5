package com.example.clase7ws.repository;

import com.example.clase7ws.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "job")
public interface JobRepository extends JpaRepository<Job, String> {
}
