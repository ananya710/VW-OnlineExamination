package in.co.vwit.layer3;

import java.util.List;

import in.co.vwit.layer1.Register;

public interface RegisterService {
	public List<Register> findAllRegisterService();
	public Register insertRegisterService(Register reg);

}
