package com.oms.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.dao.TenantRepo;
import com.oms.entity.Asset;
import com.oms.entity.Tenant;

@Service
public class TenantService {
	
	
	private static final Logger log = LoggerFactory.getLogger(TenantService.class);

	@Autowired
	private TenantRepo tenantRepo;
	
	public List<Tenant> getAllTenants()
	{
		List<Tenant> TenantList = new ArrayList<>();
		tenantRepo.findAll()
		.forEach(TenantList::add);
		return TenantList;
	}
	
	public void addTenant(Tenant tenant)
	{
		tenantRepo.save(tenant);
	}
	
	public Tenant getTenant(String id)
	{
		return tenantRepo.findOne(id);
	}
	
	public Tenant updateTenant(String id, Tenant updatedTenant)
	{
		Tenant tenant = tenantRepo.findOne(id);
		
		tenant.setEmail(updatedTenant.getEmail());
		tenant.setName(updatedTenant.getName());
		tenant.setOffering(updatedTenant.getOffering());
		tenant.setNumber(updatedTenant.getNumber());
		return tenantRepo.save(tenant);
	}
	
	public Tenant addAsset(String id, List<Asset> assets)
	{
		Tenant tenant = tenantRepo.findOne(id);
		tenant.setAssets(assets);
		return tenantRepo.save(tenant);
	}
	
	public void deleteTenant(String id)
	{
		tenantRepo.delete(id);
	}
	
	
	

}
