package com.ticketing.converter;

import com.ticketing.dto.ProjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class ProjectDTOConverter implements Converter<Long, ProjectDTO> {
    @Override
    public ProjectDTO convert(Long source) {
        return null;
    }

//    @Autowired
//    ProjectService projectService;
//
//    @Override
//    public ProjectDTO convert(Long source) {
//        return projectService.findByID(source) ;
//    }
}
