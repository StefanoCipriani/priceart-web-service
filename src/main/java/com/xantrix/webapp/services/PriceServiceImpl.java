package com.xantrix.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xantrix.webapp.entities.DettListini;
import com.xantrix.webapp.repositories.PrezziRepository;

@Service
public class PriceServiceImpl implements PriceService{

	@Autowired
	PrezziRepository prezziRepository;

	@Override
	//@Cacheable(value = "chacheprezzo",key = "#CodArt",sync = true)
	public DettListini selPrezzo(String CodArt, String Listino)
	{
		return prezziRepository.findByCodArtAndIdList(CodArt, Listino);
	}

	@Override
	//@Caching(evict = { 
	//	@CacheEvict(cacheNames="chacheprezzo",key = "#dettListini.codArt")})
	public void insPrezzo(DettListini dettListini) 
	{
		prezziRepository.save(dettListini);
	}

	@Override
	//@Caching(evict = { 
	//	@CacheEvict(cacheNames="chacheprezzo",key = "#CodArt")})
	public void delPrezzo(String CodArt, String IdList) 
	{
		prezziRepository.delRowDettList(CodArt, IdList);
	}

}
