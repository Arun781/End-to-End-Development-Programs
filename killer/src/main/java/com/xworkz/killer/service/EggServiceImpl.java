package com.xworkz.killer.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.killer.dto.EggDTO;
import com.xworkz.killer.repository.EggRepository;
@Service
public class EggServiceImpl implements EggService {
	
	@Autowired
	private EggRepository eggRepository;
	
	public EggServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean saveAndValidate(EggDTO dto) {
		System.out.println("Created saveAndValidate");
		boolean save=this.eggRepository.save(dto);
		System.out.println("Saved"+save);
		return false;
	}

}
