package com.cg.payroll.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
@Component("payrollServices")
public class PayrollServicesImpl implements PayrollServices{
@Autowired
	private AssociateDAO  associateDao;

	@Override
	public Associate acceptAssociateDetails(Associate associate) {
	
		return associateDao.save(associate);
	}
	@Override
	public double calculateNetSalary(int associateId) throws AssociateDetailsNotFoundException {
		Associate associate = getAssociateDetails(associateId);
		associate.getSalary().setNetSalary((int) (12*calculateGrossSalary(associateId)+associate.getSalary().getCompanyPf()+associate.getSalary().getEpf()));
		associateDao.save(associate);
		return associate.getSalary().getNetSalary();
//		return 12*calculateGrossSalary(associateId)+associate.getSalary().getCompanyPf()+associate.getSalary().getEpf();
	}
	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailsNotFoundException {
		return associateDao.findById(associateId).orElseThrow(()->new AssociateDetailsNotFoundException("Associate Details Not Found"));
		
	}
	@Override
	public List<Associate> getAllAssociateDetails() {
		
		return associateDao.findAll();
	}
	@Override
	public double calculateGrossSalary(int associateId)throws AssociateDetailsNotFoundException{
		Associate associate = getAssociateDetails(associateId);
		associate.getSalary().setGrossSalary ((int) (associate.getSalary().getBasicSalary()
				+0.3*associate.getSalary().getBasicSalary()*2
				+0.25*associate.getSalary().getBasicSalary()
				+0.2*associate.getSalary().getBasicSalary()
				+associate.getSalary().getCompanyPf()
				+associate.getSalary().getEpf()));
		
		associateDao.save(associate);
		return associate.getSalary().getGrossSalary();
		/*
		 * return (associate.getSalary().getBasicSalary()
		 * +0.3*associate.getSalary().getBasicSalary()*2
		 * +0.25*associate.getSalary().getBasicSalary()
		 * +0.2*associate.getSalary().getBasicSalary()
		 * +associate.getSalary().getCompanyPf() +associate.getSalary().getEpf());
		 */
	}
}
