package jp.co.sample.emp_management.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.NameList;

import jp.co.sample.emp_management.domain.Employee;
import jp.co.sample.emp_management.form.NameResearchForm;
import jp.co.sample.emp_management.service.EmployeeService;

@RestController
@RequestMapping("")
public class nameResearchController {


	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * 使用するフォームオブジェクトをリクエストスコープに格納
	 *  @return　フォーム
	 */
	@ModelAttribute
	public NameResearchForm setUpForm() {
		return new NameResearchForm();
	}
	
	@RequestMapping(value="/getJSON",method=RequestMethod.GET)
	public List<String> nameResearch(NameResearchForm form){
		
		List<Employee> employeeList=employeeService.showList();
		System.out.println(employeeList);
		List<String> nameList=new ArrayList<>();
		for(Employee employee:employeeList) {
			nameList.add(employee.getName());			
		}
		System.out.println(nameList);
		return nameList;
 		
	}
}
