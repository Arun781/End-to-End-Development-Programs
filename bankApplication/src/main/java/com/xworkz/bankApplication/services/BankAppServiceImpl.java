package com.xworkz.bankApplication.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.bankApplication.dto.BankAppDTO;
import com.xworkz.bankApplication.entity.BankAppEntity;
import com.xworkz.bankApplication.repository.BankAppRepository;

@Service
public class BankAppServiceImpl implements BankAppService {
	@Autowired
	private BankAppRepository bankAppRepository;

	@Override
	public Set<ConstraintViolation<BankAppDTO>> validateAndSave(BankAppDTO serviceDTO) {
		System.out.println("Running the validateAndSave in Services.............");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BankAppDTO>> violations = validator.validate(serviceDTO);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto" + serviceDTO);
			return violations;
		}
		System.out.println("violations not found");
		BankAppEntity appEntity = new BankAppEntity();
		appEntity.setName(serviceDTO.getName());
		appEntity.setIfscCode(serviceDTO.getIfscCode());
		appEntity.setAddress(serviceDTO.getAddress());
		appEntity.setBranch(serviceDTO.getBranch());
		appEntity.setAadharNum(serviceDTO.getAadharNum());
		appEntity.setPhoneNum(serviceDTO.getPhoneNum());
		appEntity.setEmail(serviceDTO.getEmail());
		appEntity.setPassword(serviceDTO.getPassword());
		appEntity.setReenterpas(serviceDTO.getReenterpas());
		boolean saved = this.bankAppRepository.save(appEntity);
		System.out.println("Entity is saved" + saved);
		if (saved) {
			Boolean sendMail = this.sendMail(serviceDTO.getEmail(), serviceDTO);
			System.out.println(sendMail);
		}
		System.out.println("Entity is saved" + saved);
		return Collections.emptySet();
	}

	@Override
	public BankAppDTO findBy(int id) {
		System.out.println("Running the findByID in Services.............");
		if (id > 0) {
			BankAppEntity appEntity = this.bankAppRepository.findById(id);
			System.out.println("Entity is found in service for id" + id);
			BankAppDTO appDTO = new BankAppDTO();
			appDTO.setId(appEntity.getId());
			appDTO.setName(appEntity.getName());
			appDTO.setIfscCode(appEntity.getIfscCode());
			appDTO.setBranch(appEntity.getBranch());
			appDTO.setAddress(appEntity.getAddress());
			appDTO.setAadharNum(appEntity.getAadharNum());
			appDTO.setPhoneNum(appEntity.getPhoneNum());
			appDTO.setEmail(appEntity.getEmail());
			appDTO.setPassword(appEntity.getPassword());
			appDTO.setReenterpas(appEntity.getReenterpas());
			return appDTO;
		}
		return BankAppService.super.findBy(id);
	}

	@Override
	public List<BankAppDTO> findByName(String name) {
		if (name != null && !name.isEmpty()) {
			System.out.println("Running the findByName in Services.............");
			List<BankAppEntity> appEntities = this.bankAppRepository.findByName(name);
			List<BankAppDTO> list = new ArrayList<BankAppDTO>();
			System.out.println("The Name is valid, calling repo" + appEntities);
			for (BankAppEntity appEntity : appEntities) {
				BankAppDTO appDTO = new BankAppDTO();
				appDTO.setId(appEntity.getId());
				appDTO.setName(appEntity.getName());
				appDTO.setIfscCode(appEntity.getIfscCode());
				appDTO.setBranch(appEntity.getBranch());
				appDTO.setAddress(appEntity.getAddress());
				appDTO.setAadharNum(appEntity.getAadharNum());
				appDTO.setPhoneNum(appEntity.getPhoneNum());
				appDTO.setEmail(appEntity.getEmail());
				appDTO.setPassword(appEntity.getPassword());
				appDTO.setReenterpas(appEntity.getReenterpas());
				list.add(appDTO);

			}
			System.out.println("Size of dtos" + list.size());
			System.out.println("Size of entities" + appEntities.size());
			return list;
		}
		return BankAppService.super.findByName(name);
	}

	@Override
	public List<BankAppDTO> findByBranch(String branch) {
		if (branch != null && !branch.isEmpty()) {
			System.out.println("Running the findByBranch in Services.............");
			List<BankAppEntity> appEntities = this.bankAppRepository.findByBranch(branch);
			List<BankAppDTO> list = new ArrayList<BankAppDTO>();
			System.out.println("The Name is valid, calling repo" + appEntities);
			for (BankAppEntity appEntity : appEntities) {
				BankAppDTO appDTO = new BankAppDTO();
				appDTO.setId(appEntity.getId());
				appDTO.setName(appEntity.getName());
				appDTO.setIfscCode(appEntity.getIfscCode());
				appDTO.setBranch(appEntity.getBranch());
				appDTO.setAddress(appEntity.getAddress());
				appDTO.setAadharNum(appEntity.getAadharNum());
				appDTO.setPhoneNum(appEntity.getPhoneNum());
				appDTO.setEmail(appEntity.getEmail());
				appDTO.setPassword(appEntity.getPassword());
				appDTO.setReenterpas(appEntity.getReenterpas());
				list.add(appDTO);
			}
			System.out.println("Size of dtos" + list.size());
			System.out.println("Size of entities" + appEntities.size());
			return list;
		}
		return BankAppService.super.findByBranch(branch);
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Running the delete in Services.............");
		boolean deleted = this.bankAppRepository.delete(id);
		System.out.println("Deleted: " + deleted);
		return deleted;
	}

	@Override
	public Set<ConstraintViolation<BankAppDTO>> update(BankAppDTO appDTO) {
		System.out.println("Running the update in Services.............");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BankAppDTO>> violation = validator.validate(appDTO);
		if (!violation.isEmpty()) {
			System.out.println("Violation found");
			return violation;
		} else {
			System.out.println("No viloations");
			BankAppEntity appEntity = new BankAppEntity();
			appEntity.setId(appDTO.getId());
			appEntity.setName(appDTO.getName());
			appEntity.setIfscCode(appDTO.getIfscCode());
			appEntity.setBranch(appDTO.getBranch());
			appEntity.setAddress(appDTO.getAddress());
			appEntity.setAadharNum(appDTO.getAadharNum());
			appEntity.setPhoneNum(appDTO.getPhoneNum());
			appEntity.setEmail(appDTO.getEmail());
			appEntity.setPassword(appDTO.getPassword());
			appEntity.setReenterpas(appDTO.getReenterpas());
			this.bankAppRepository.update(appEntity);
			return Collections.emptySet();
		}
	}

	@Override
	public BankAppDTO findByEmail(String email) {
		if (email != null && !email.isEmpty()) {
			System.out.println("Running the findByEmail in Services.............");
			BankAppEntity appEntities = this.bankAppRepository.findByEmail(email);
			BankAppDTO appDTO = new BankAppDTO();
			appDTO.setId(appEntities.getId());
			appDTO.setName(appEntities.getName());
			appDTO.setIfscCode(appEntities.getIfscCode());
			appDTO.setBranch(appEntities.getBranch());
			appDTO.setAddress(appEntities.getAddress());
			appDTO.setAadharNum(appEntities.getAadharNum());
			appDTO.setPhoneNum(appEntities.getPhoneNum());
			appDTO.setEmail(appEntities.getEmail());
			appDTO.setPassword(appEntities.getPassword());
			appDTO.setReenterpas(appEntities.getReenterpas());
			return appDTO;
		}
		return null;
	}

	@Override
	public List<BankAppDTO> findAll() {
		System.out.println("Running FindAll in service");
		List<BankAppEntity> entities = this.bankAppRepository.findAll();
		List<BankAppDTO> listDto = new ArrayList<BankAppDTO>();
		for (BankAppEntity fruitsEntity : entities) {
			BankAppDTO dto = new BankAppDTO();
			BeanUtils.copyProperties(fruitsEntity, dto);
			listDto.add(dto);
		}

		return listDto;
	}

	@Override
	public List<BankAppDTO> findByNameAndBranch(String name, String branch) {
		System.out.println("Running findByNameAndLocation in service: " + name + branch);
		if ((name != null && !name.isEmpty()) || (branch != null && !branch.isEmpty())) {
			List<BankAppEntity> entities = this.bankAppRepository.findByNameAndBranch(name, branch);

			List<BankAppDTO> listDtos = new ArrayList<BankAppDTO>();
			for (BankAppEntity appEntities : entities) {
				BankAppDTO appDTO = new BankAppDTO();
				appDTO.setId(appEntities.getId());
				appDTO.setName(appEntities.getName());
				appDTO.setIfscCode(appEntities.getIfscCode());
				appDTO.setBranch(appEntities.getBranch());
				appDTO.setAddress(appEntities.getAddress());
				appDTO.setAadharNum(appEntities.getAadharNum());
				appDTO.setPhoneNum(appEntities.getPhoneNum());
				appDTO.setEmail(appEntities.getEmail());
				appDTO.setPassword(appEntities.getPassword());
				appDTO.setReenterpas(appEntities.getReenterpas());
				listDtos.add(appDTO);
			}
			// BeanUtils.copyProperties(appEntities, appDTO);
			System.out.println("Size of dtos:" + listDtos.size());
			System.out.println("Size of entitys:" + entities.size());
			return listDtos;
		} else {
			System.out.println("Name ANd LOcation in invalid:" + name + branch);
		}
		return BankAppService.super.findByNameAndBranch(name, branch);
	}

	@Override
	public Boolean sendMail(String email, BankAppDTO appDTO) {
		String host = "smtp.office365.com";
		final String fromEmail = "arunbv9999@outlook.com";
		final String password = "arun1996@AR";
		String toEmail = email;
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.transport.protocol", "smtp");
		     
		   Session session = Session.getDefaultInstance(props,  
		    new javax.mail.Authenticator() {  
		      protected PasswordAuthentication getPasswordAuthentication() {  
		    return new PasswordAuthentication(fromEmail,password);  
		      }  
		    });  
		  
		   //Compose the message  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(fromEmail));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));  
		     message.setSubject("javatpoint");  
		     message.setText("This is simple program of sending email using JavaMail API");  
		       
		    //send the message  
		     Transport.send(message);  
		  
		     System.out.println("message sent successfully...");  
		   
		     } catch (MessagingException e) {e.printStackTrace();}
			return true;  
	}

	@Override
	public int otpGenerator() {
		System.out.println("Running the otpGenerator......");
		int randomPin = (int) (Math.random() * 9000) + 1000;
		System.out.println("OTP : " + randomPin);
		return randomPin;
	}

	@Override
	public String sendEmail(String email, int otp) throws AddressException, MessagingException {
		String host = "smtp.office365.com";
		final String user = "arunbv9999@outlook.com";
		final String password1 = "arun1996@AR";
		String to = email;
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.transport.protocol", "smtp");
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(user, password1);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("OTP sent successfully");
			message.setText("The OTP is " + otp);
			// send the message
			Transport.send(message);
			System.out.println("email with otp sent ......");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return "otp sent successfully";
	}

	@Override
	public List<BankAppDTO> validateAndSavePass(String password, String reenterpas) {
		System.out.println("Running the validateAndSavePass in services");
		if (password.equals(reenterpas)) {
			System.out.println("The password is matched you can save to repo..");
		}else {
			System.err.println("Please check the entered password..");
		}
		boolean saved = this.bankAppRepository.validateAndSavePass(password, reenterpas);
		System.out.println("The forgot password is verified and saved in repo"+saved);
        return null ;
	}	
}
