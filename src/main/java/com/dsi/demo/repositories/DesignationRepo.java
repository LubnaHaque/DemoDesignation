package com.dsi.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dsi.demo.model.Designation;

@Repository
public interface DesignationRepo extends CrudRepository<Designation , Integer>{}
