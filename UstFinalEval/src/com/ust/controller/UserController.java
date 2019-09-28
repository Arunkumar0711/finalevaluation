package com.ust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.dao.UstUserDao;
import com.ust.model.UstUser;
import com.ust.model.VendorContact;

@RestController
public class UserController {
	@Autowired
	UstUserDao userdao;
	
	//userValidation
	
	@RequestMapping(value = "/api/user/{username}/{password}", method = RequestMethod.GET)
	@ResponseBody
	public UstUser selectRole1(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		return userdao.selectRole(username, password);
	}

	// view vendor list
	
	@RequestMapping(value = "/api/vendor1/{vendorName}", method = RequestMethod.GET)
	@ResponseBody
	public List getVendor(Model m, @PathVariable("vendorName") String vendorName) {
		List list;
		if (vendorName.equals("null")) {
			list = userdao.getVendor();
		} else {
			list = userdao.getVendorByName(vendorName);
		}

		return list;
	}
//Vendor list by id
	
	@RequestMapping(value = "/api/vendor2/{vendorId}", method = RequestMethod.GET)
	@ResponseBody
	public VendorContact getVendor1(Model m,
			@PathVariable("vendorId") int vendorId) {

		return userdao.getVendorById(vendorId);

	}
//Disable vendor 
	
	@RequestMapping(value = "/api/disableVendor/{vendorId}", method = RequestMethod.PUT)
	void vendorDisable(@PathVariable("vendorId") int vendorId) {
		userdao.disableVendor(vendorId);
	}

	// update vendor
	
	@ResponseBody
	@RequestMapping(value = "/api/updatevendor", method = RequestMethod.PUT)
	public void updateVendor(@RequestBody VendorContact a1) {
		int vendorid = a1.getVendorId();
		userdao.updateVendor(a1, vendorid);
	}

	// save vendor
	
	@RequestMapping(value = "/api/savevendor", method = RequestMethod.POST)
	public void saveVendor(@RequestBody VendorContact a1) {
		userdao.saveVendor(a1);

	}
	
	//Get StaffList
	
	@RequestMapping(value = "/api/staff1/{staffName}", method = RequestMethod.GET)
	@ResponseBody
	public List getStaff(Model m, @PathVariable("staffName") String staffName) {
		List list;
		if (staffName.equals("null")) {
			list = userdao.getStaff();
		} else {
			list = userdao.getStaffByName(staffName);
		}

		return list;
	}
	
	// Get Staf By id
	
	@RequestMapping(value = "/api/staff2/{staffId}", method = RequestMethod.GET)
	@ResponseBody
	public VendorContact getstaff1(Model m, @PathVariable("staffId") int staffId) {

		return userdao.getStaffById(staffId);

	}
	// @ResponseBody
	// @RequestMapping(value = "/api/updatestaff/{staffId}", method =
	// RequestMethod.PUT)
	// public void updateStaff(@RequestBody VendorContact
	// a1,@PathVariable("staffId") int staffId) {
	//
	// userdao.updateStaff(a1,staffId);
	// }
	// @RequestMapping(value = "/api/savestaff", method = RequestMethod.POST)
	// public void saveStaff(@RequestBody VendorContact a1) {
	// userdao.saveStaff(a1);

	// }
}
