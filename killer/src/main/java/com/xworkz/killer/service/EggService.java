package com.xworkz.killer.service;

import com.xworkz.killer.dto.EggDTO;

public interface EggService {
	boolean saveAndValidate(EggDTO dto);
}
