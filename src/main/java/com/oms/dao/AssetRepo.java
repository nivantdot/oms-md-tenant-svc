package com.oms.dao;

import org.springframework.data.repository.CrudRepository;

import com.oms.entity.Asset;

public interface AssetRepo extends CrudRepository<Asset, String>{

}
