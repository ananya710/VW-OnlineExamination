package in.co.vwit.layer2;

import java.util.List;

import in.co.vwit.layer1.Register;

public interface RegisterRepository {
	public Register insertRegister(Register reg);
	public List<Register> selectAllRegisteredUser();


}
