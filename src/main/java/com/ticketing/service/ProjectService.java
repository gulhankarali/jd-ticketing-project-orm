package com.ticketing.service;

import com.ticketing.dto.ProjectDTO;
import com.ticketing.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProjectService extends JpaRepository<Project, Long> {

    List<ProjectDTO> listAllProjects();
    ProjectDTO findByID(Long id);
    void save(ProjectDTO dto);
    ProjectDTO update(ProjectDTO dto);
    void delete(Long id);
}
