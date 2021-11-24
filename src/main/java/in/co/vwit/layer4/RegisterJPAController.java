package in.co.vwit.layer4;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import in.co.vwit.layer1.Register;
import in.co.vwit.layer3.RegisterService;

@CrossOrigin
@RestController
@RequestMapping("/regJPA")
public class RegisterJPAController {
	
	@Autowired
	RegisterService regService;


	
	public RegisterJPAController() {
		System.out.println("RegisterJPAController: RegisterJPAController() ctor...");
	
		
	}
	
	
	@GetMapping("/getreg") // http://localhost:8085/regJPA/getreg
	public List<Register>  getAllRegisteredUser() {
		System.out.println("RegisterController: /regJPA/getreg/");
		return regService.findAllRegisterService(); //controller is invoking service
		
	}

	@PostMapping("/addRegBody") // http://localhost:8085/regJPA/addRegBody
	public Register  addRegister(@RequestBody Register useRegister) {
		System.out.println(useRegister.getEmail());
         regService.insertRegisterService(useRegister);
         
		return useRegister;
		
	}
	
	
//	@PostMapping("/addRegBody") // http://localhost:8080/regJPA/addRegBody
//	public Register  addDepartmentBody(@RequestBody Register newReg) {
////		System.out.println("RegisterController: /regJPA/addDeptBody/"+newReg.getDepartmentNumber()+" "+newDept.getDepartmentName()+" "+newDept.getDepartmentLocation());
//
//		regService.insertRegisterService(newReg);
//		return newReg;
//		
	}
	
	


