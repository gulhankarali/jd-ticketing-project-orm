package com.ticketing.implementation;

import com.ticketing.dto.RoleDTO;
import com.ticketing.entity.Role;
import com.ticketing.repository.RoleRepository;
import com.ticketing.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<RoleDTO> listAllRoles() {
        List<Role> list = roleRepository.findAll();
        return null;
    }

    @Override
    public RoleDTO findByID(Long id) {
        return null;
    }
}
