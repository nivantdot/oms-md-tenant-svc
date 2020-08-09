package com.oms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oms.entity.Tenant;
import com.oms.service.TenantService;

@RestController
@RequestMapping(value = "/tenant")
public class TenantController {

	
	@Autowired
	public TenantService tenantService;

	@RequestMapping(method = RequestMethod.GET, value ="/getAllTenants")
	public List<Tenant> getTenants()
	{
		return tenantService.getAllTenants();

	}

	
	@RequestMapping(method = RequestMethod.POST, value="/addTenant" )
	public void addTenant(@RequestBody Tenant tenant)
	{
		tenantService.addTenant(tenant);
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/getTenant/{id}")
	public Tenant getTenant(@PathVariable String id)
	{
		return tenantService.getTenant(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/updateTenant/{id}")
	public Tenant updateTenant(@RequestBody Tenant tenant, @PathVariable String id)
	{
		return tenantService.updateTenant(id, tenant);
	}

	@RequestMapping(method = RequestMethod.DELETE, value="/deleteTenant/{id}")
	public void deleteTenant(@PathVariable String id)
	{
		tenantService.deleteTenant(id);
	}
	
	
}
