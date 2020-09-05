
  package com.oms.controller;
  
  import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.web.bind.annotation.PathVariable; import
  org.springframework.web.bind.annotation.RequestBody; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RequestMethod; import
  org.springframework.web.bind.annotation.RestController;
  
  import com.oms.entity.Asset;
import com.oms.entity.Tenant;
import com.oms.service.AssetService; import
  com.oms.service.TenantService;
  
  @RestController
  
  @RequestMapping(value = "/oms") public class AssetController {
  
  @Autowired public AssetService assetService;
  
  @Autowired public TenantService tenantService;
  
  @RequestMapping(method = RequestMethod.POST, value="/addAsset/{id}" )
	public Tenant addAsset(@RequestBody List<Asset> assets, @PathVariable String id)
	{
		return tenantService.addAsset(id, assets);
	}
  
	@RequestMapping(method = RequestMethod.GET, value ="/getAllAssets")
	public List<Asset> getAssets()
	{
		return assetService.getAllAssets();

	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/getAllAssetsByTenantId/{id}")
	public List<Asset> getAssetsByTenantId(@PathVariable String id)
	{
		return assetService.getAllAssetByTenantId(id);

	}
  
  }
 