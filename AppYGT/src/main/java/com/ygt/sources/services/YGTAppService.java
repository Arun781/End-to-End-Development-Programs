package com.ygt.sources.services;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.validation.ConstraintViolation;

import com.ygt.sources.dto.YgtDto;


public interface YGTAppService {
	Set<ConstraintViolation<YgtDto>> validateAndSave(YgtDto serviceDTO);

	default YgtDto findBy(int id) {
		return null;
	}

	default List<YgtDto> findByName(String name) {
		return Collections.emptyList();
	}

	default List<YgtDto> findByBranch(String branch) {
		return Collections.emptyList();
	}

	Set<ConstraintViolation<YgtDto>> update(YgtDto appDTO);

	default boolean delete(int id) {
		return true;
	}

	default YgtDto findByEmail(String email) {
		return null;
	}

	default List<YgtDto> findAll() {
		return Collections.emptyList();
	}

	default List<YgtDto> findByNameAndBranch(String name, String branch) {
		return null;
	}

	Boolean sendMail(String email, YgtDto appDTO);

	int otpGenerator();

	String sendEmail(String email, int otp) throws AddressException, MessagingException;

	default List<YgtDto> validateAndSavePass(String password, String reenterpas) {
		return null;
	}
}
