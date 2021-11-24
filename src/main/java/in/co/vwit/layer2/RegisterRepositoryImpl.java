package in.co.vwit.layer2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



import in.co.vwit.layer1.Register;

@Repository
public class RegisterRepositoryImpl implements RegisterRepository{

	@PersistenceContext
	EntityManager entityManager; //1. PersistenceContext.createEMF("MyJPA"); 2. EMF.createEM()
	
	

	@Override
	@Transactional
	public Register insertRegister(Register reg) {
		entityManager.persist(reg);
		return reg;
	}



	@Override
	public List<Register> selectAllRegisteredUser() {
		TypedQuery<Register> query = entityManager.createQuery("from Register", Register.class);
		return query.getResultList();
	}

}
