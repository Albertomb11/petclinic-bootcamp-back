package com.bootcamp.petclinic.service.impl;

import org.springframework.stereotype.Service;

import com.bootcamp.petclinic.entity.Oferta;
import com.bootcamp.petclinic.service.OfertaService;

@Service
public class OfertaServiceImpl implements OfertaService{ 
	
	private OfertaRepository ofertaRepo;
	
	@Autowired
	public OfertaServiceImpl(OfertaRepository ofertaRepo) {
		this.ofertaRepo = ofertaRepo;
	}
	
	public Oferta findById(int id) {
		return this.ofertaRepo.findById(id);
	}
	
	public Oferta findAll() {
		return this.ofertaRepo.findAll();
	}
	
	public void saveOferta(Oferta oferta) {
		return this.ofertaRepo.save(oferta);
	}
	
	public void insertOferta(Oferta oferta) {
		return this.ofertaRepo.insert(oferta);
	}
	
	public void updateOferta(Oferta oferta) {
		return this.ofertaRepo.update(oferta);
	}
	
	public void deleteOferta(Oferta oferta) {
		return this.ofertaRepo.delete(oferta);
	}


	
}
