package testers;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.management.StringValueExp;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.evgen.coupons.beans.Company;
import com.evgen.coupons.beans.Coupon;
import com.evgen.coupons.beans.Customer;
import com.evgen.coupons.dao.CompanyDao;
import com.evgen.coupons.dao.CouponsDao;
import com.evgen.coupons.dao.CustomerDao;
import com.evgen.coupons.enums.CouponType;
import com.evgen.coupons.exceptions.ApplicationException;
import com.evgen.coupons.logic.CompanyController;
import com.evgen.coupons.logic.CustomerController;

public class LogicTester {

	    public static void main(String[] args) throws SQLException, ApplicationException {
	   
	    	
	    	CustomerDao customerDao = new CustomerDao();
	    	CouponsDao couponsDao = new CouponsDao();
	    	CompanyDao companyDao = new CompanyDao();
	    	
	    	 CompanyController cc = new CompanyController();
	    //	 System.out.println(cc.getCompanybyName("Kia"));
	    	 CustomerController cust = new CustomerController();
//	    	 System.out.println(customerDao.isCustomerExistByName("Mark"));
	    	 System.out.println(cust.getCustomerByName("Pavelka"));
	         System.out.println(cust.getCustomerByID((long)1));
	   	
		//System.out.println(customerDao.isCustomerExistById((long)101));
	    //	System.out.println(companyDao.isCompanyExistById((long) 1));
	    //	System.out.println(companyDao.isCompanyExistByName(""));
//	    	Company company = cc.getCompanybyID(2);
//	    	
//	    	System.out.println(company);
	    	
//Coupon Create:
//      	Coupon couponAdd = new Coupon ();
//	    	//couponAdd.setId(7);
//			couponAdd.setTitle("butter");
//			couponAdd.setStartDate("15.01.2018");
//			couponAdd.setEndDate("25.02.2018");
//			couponAdd.setAmount(100);
//			couponAdd.setPrice(11f);
//			couponAdd.setType(CouponType.TRAVELLING);
//			couponAdd.setMessage("Hello world");
//			couponAdd.setImage("IMAGE");
//			couponAdd.setCompanyId(7);
//			couponsDao.createCoupon(couponAdd);
//Company Create:	    	
//	    	JTextField q = new JTextField (5);
//	    	JTextField w = new JTextField (5);
//	    	JTextField r = new JTextField (5);
//	    	JPanel myPanel = new JPanel();
//	    	myPanel. add(new JLabel("Company: "));
//	    	myPanel.add(q);
//	    	myPanel.add(Box.createHorizontalStrut(15));
//	    	myPanel. add(new JLabel("Password: "));
//	    	myPanel.add(w);
//	    	myPanel. add(new JLabel("Email: "));
//	    	myPanel.add(r);
//	 
//	    	JOptionPane.showConfirmDialog(null, myPanel, "Please enter parameters: " , JOptionPane.OK_CANCEL_OPTION);

//	    	Company com = new Company ("Barabashka", "12345", "gdfg@fgfdh.com");
//	    	companyDao.createCompany(com);
//Customer Create:    	
//	     	Customer cust = new Customer("Girka", "123");
//	    	customerDao.createCustomer(cust);
	    	
//_________________________________________________________________

//Company Login:
//	    	boolean isComExist = companyDao.login("TEva", "12345");
//	    	System.out.println("company " + isComExist);
	    	
//Customer Login:
	    	
//	    	boolean isCustomerExist = customerDao.login("John", "123");
//	    	System.out.println("Customer  " + isCustomerExist);
	    	
	    	
	    	
	    	
//_________________________________________________________________

//Coupon Update:
//	   	Coupon couponUpd = new Coupon(2, "Glida Barvazzi", "23.05.2018", "23.06.2018", 100, "Very Tasty", 9.99f, "BIG", 7, CouponType.CAMPING);
//	    	couponsDao.couponUpdate(couponUpd);
//Company Update:
//	    	Company companyUpd = new Company(2,"KIA", "dfbg657dgDFG", "dfdf@dgdf.com");
//	    	companyDao.companyUpdate(companyUpd);
//Customer Update:
//	    	Customer customer = new Customer(5, "Sirozha", "123");
//	    	customerDao.customerUpdate(customer);
	    	
	    	
	    	//	    	________________________________
		    
			try {
       
//          List<Customer> customerList = customerDao.getAllCustomers();
//            System.out.println("Customers list:");
//           for (Customer c : customerList) {
//               System.out.println(c);
//            }
//           
//            List<Company> companyList = companyDao.getAllCompanies();
//            System.out.println("Company List:");
//            for (Company comp : companyList) {
//                System.out.println(comp);
//            }
//           
//            List<Coupon> couponList = couponsDao.getAllCoupons();
//            //Thread.sleep(10000);
//	        System.out.println("Coupons list:");
//            for (Coupon co : couponList) {   	
//                System.out.println(co);
//            }
//Get All by Company:
//				List<Coupon> couponList = couponsDao.couponGetByCompany(7);
//		        System.out.println("Coupons list:");
//	            for (Coupon co : couponList) {   	
//	                System.out.println(co);
//	            }
//Get Coupon by TYPE:	
//	            List<Coupon> couponList = couponsDao.couponGetByType(CouponType.CARS);
//		        System.out.println("Coupons list:");
//	            for (Coupon co : couponList) {   	
//	                System.out.println(co);
//	            }
//Get Coupon by Customer:	
//	            List<Coupon> couponList = couponsDao.couponGetByCustomer(1);
//		        System.out.println("Coupons list:");
//	            for (Coupon co : couponList) {   	
//	                System.out.println(co);
//	            }
//				________________________________
// DELETE:      
//           Coupon coupon = new Coupon();
//           coupon.setId(3);
//           couponsDao.couponDeleteById(coupon);
			
//			 Company company = new Company();
//			 company.setId(3);
//			 companyDao.companyDeleteById(company);
			
//			 Customer customer = new Customer();
//			 customer.setId(25);
//			 customerDao.customerDeleteById(customer);
// Get By ID:
//           Coupon coupon = couponsDao.couponGetById((long)4);
//           System.out.println(coupon);
				
//		     Company company = companyDao.getCompanyById((long)2);
//		     System.out.println(company);
			 
//			 Customer customer = customerDao.getCustomerById((long)3);
//			 System.out.println(customer);
				
//________________________________________________________________________
				
//Coupon get time:
				 
			
//				LocalDate localDate = LocalDate.now();
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//				String formattedString = localDate.format(formatter);		
//				String date = formattedString;
//		   	    couponsDao.couponDeleteExpired(date);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

}
	    
}
