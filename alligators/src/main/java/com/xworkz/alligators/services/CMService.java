package com.xworkz.alligators.services;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.alligators.dto.CMDto;

public interface CMService {
 Set<ConstraintViolation<CMDto>> validateAndSave(CMDto dto);
}
