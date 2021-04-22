package com.SpringWebmvc2.MedicalDao;
import com.SpringWebmvc2.MedicalDto.Customer;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
public class MedicalDaoImp implements MedicalDao
{
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate()
    {
        return hibernateTemplate;
    }
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
    {
        this.hibernateTemplate = hibernateTemplate;
    }
    @Override
    @Transactional
    public Customer save(Customer customer)
    {
        System.out.println("inside dao");
        int result=(int)this.hibernateTemplate.save(customer);
        return customer;
    }

}
