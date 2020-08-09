package com.oms.dao;

import org.springframework.data.repository.CrudRepository;

import com.oms.entity.Tenant;

public interface TenantRepo extends CrudRepository<Tenant, String>{

}
