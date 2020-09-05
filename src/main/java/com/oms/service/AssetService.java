package com.oms.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.dao.AssetRepo;
import com.oms.dao.TenantRepo;
import com.oms.entity.Asset;
import com.oms.entity.Tenant;

@Service
public class AssetService {
	
	
	private static final Logger log = LoggerFactory.getLogger(AssetService.class);

	@Autowired
	private TenantRepo tenantRepo;
	@Autowired
	private AssetRepo assetRepo;
	
	public List<Asset> getAllAssets() {
		
		List<Asset> AssetList = new ArrayList<>();
		assetRepo.findAll()
		.forEach(AssetList::add);
		return AssetList;
		
	}
	
	public List<Asset> getAllAssetByTenantId(String Id) {
		
		Tenant tenant = tenantRepo.findOne(Id);
		List<Asset> AssetList = new ArrayList<>();
		tenant.getAssets()
		.forEach(AssetList::add);
		return AssetList;
	}
	
	
	

}
