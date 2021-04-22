package com.SpringWebmvc2.MedicalService;
import com.SpringWebmvc2.MedicalDao.MedicalDao;
import com.SpringWebmvc2.MedicalDto.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class MedicalServiceImp implements MedicalService {
    @Autowired
    private MedicalDao medicalDao;
    @Override
    public Customer customerService(Customer customer) {
        System.out.println("inside service class");
        medicalDao.save(customer);

        return customer;
    }
    public MedicalDao getMedicalDao() {
        return medicalDao;
    }

    public void setMedicalDao(MedicalDao medicalDao) {
        this.medicalDao = medicalDao;
    }

}
