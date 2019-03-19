/*
 * package com.cg.payroll.tests;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * import java.util.ArrayList;
 * 
 * import org.easymock.EasyMock; import org.junit.After; import
 * org.junit.AfterClass; import org.junit.Before; import org.junit.BeforeClass;
 * import org.junit.Test;
 * 
 * import com.cg.payroll.beans.Associate; import
 * com.cg.payroll.beans.BankDetails; import com.cg.payroll.beans.Salary; import
 * com.cg.payroll.daoservices.AssociateDAO; import
 * com.cg.payroll.exceptions.AssociateDetailsNotFoundException; import
 * com.cg.payroll.services.PayrollServices; import
 * com.cg.payroll.services.PayrollServicesImpl;
 * 
 * public class PayyrollServicesTestEasyMock {
 * 
 * private static PayrollServices payrollServices; private static AssociateDAO
 * mockAssociateDao;
 * 
 * @BeforeClass public static void setUpTestMockEnv() { mockAssociateDao =
 * EasyMock.mock(AssociateDAO.class); payrollServices = new
 * PayrollServicesImpl(mockAssociateDao);
 * 
 * }
 * 
 * @Before public void setUpTestMockData() { Associate associate1 = new
 * Associate(1001, 78000, "Tirtharaj", "Sur", "JEE", "Jn Cons",
 * "APQ1256CDS","tirtharajsur@gmail.com", new Salary(35000, 1800, 1800), new
 * BankDetails(12345, "CITI Bank", "CITI000051")); Associate associate2 = new
 * Associate(1002, 75000, "Laltu", "Gopal", "JEE", "Jn Cons",
 * "JWK1256BCS","laltukole@gmail.com", new Salary(25000, 1800, 1800), new
 * BankDetails(12345, "HDFC", "HDFC00059")); Associate associate3 = new
 * Associate(5000, 75000, "Laltu", "Gopal", "JEE", "Jn Cons",
 * "JWK1256BCS","laltukole@gmail.com", new Salary(25000, 1800, 1800), new
 * BankDetails(12345, "HDFC", "HDFC00059"));
 * 
 * 
 * ArrayList<Associate> associatesList = new ArrayList<>();
 * associatesList.add(associate1); associatesList.add(associate2);
 * 
 * EasyMock.expect(mockAssociateDao.save(associate3)).andReturn(associate3);
 * 
 * EasyMock.expect(mockAssociateDao.findOne(1001)).andReturn(associate1);
 * EasyMock.expect(mockAssociateDao.findOne(1002)).andReturn(associate2);
 * EasyMock.expect(mockAssociateDao.findOne(1234)).andReturn(null);
 * EasyMock.expect(mockAssociateDao.findAll()).andReturn(associatesList);
 * EasyMock.replay(mockAssociateDao);
 * 
 * }
 * 
 * @Test(expected = AssociateDetailsNotFoundException.class) public void
 * testGetAssociateDataForInvalidAssociateId()throws
 * AssociateDetailsNotFoundException{ payrollServices.getAssociateDetails(1234);
 * EasyMock.verify(mockAssociateDao.findOne(1234)); }
 * 
 * @Test public void testGetAssociateDataForValidAssociateId() throws
 * AssociateDetailsNotFoundException{ Associate expectedAssociate = new
 * Associate(1001, 78000, "Tirtharaj", "Sur", "JEE", "Jn Cons",
 * "APQ1256CDS","tirtharajsur@gmail.com", new Salary(35000, 1800, 1800), new
 * BankDetails(12345, "CITI Bank", "CITI000051")); Associate actualAssociate =
 * payrollServices.getAssociateDetails(1001);
 * assertEquals(expectedAssociate,actualAssociate);
 * EasyMock.verify(mockAssociateDao.findOne(1001)); }
 * 
 * @After public void tearDownTestMockData() {
 * EasyMock.resetToDefault(mockAssociateDao); }
 * 
 * @AfterClass public static void tearDownTestMockEnv() { mockAssociateDao =
 * null; payrollServices = null; } }
 * 
 */