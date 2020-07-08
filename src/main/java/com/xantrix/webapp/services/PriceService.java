package com.xantrix.webapp.services;

import com.xantrix.webapp.entities.DettListini;

public interface PriceService {

	public DettListini selPrezzo(String CodArt, String Listino);

	public void insPrezzo(DettListini dettListini);

	public void delPrezzo(String CodArt, String IdList);
}
