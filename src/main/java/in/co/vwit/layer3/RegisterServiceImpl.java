package in.co.vwit.layer3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.vwit.layer1.Register;
import in.co.vwit.layer2.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterRepository regDao;
	
	@Override
	public Register insertRegisterService(Register reg) {
		// TODO Auto-generated method stub
		return regDao.insertRegister(reg);
	}

	@Override
	public List<Register> findAllRegisterService() {
		// TODO Auto-generated method stub
		return regDao.selectAllRegisteredUser();
	}
	

}
