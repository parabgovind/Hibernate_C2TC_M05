package nmfc.services;

import javax.persistence.EntityManager;

import nmfc.entities.Students;

public class StudentDaoImpl implements StudentsDao{

	private EntityManager entityManager; 
	
	public StudentDaoImpl() { 
	    entityManager = JPAUtil.getEntityManager(); 
	}

	@Override
	public Students findStudentByBarcode(String barcode_number) {
		// TODO Auto-generated method stub
		Students student = entityManager.find(Students.class, barcode_number); 
	    return student;
	}
}