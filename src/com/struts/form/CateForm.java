/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/** 
 * MyEclipse Struts
 * Creation date: 09-12-2007
 * 
 * XDoclet definition:
 * @struts.form name="cateForm"
 */
public class CateForm extends ValidatorForm {
	/*
	 * Generated fields
	 */

	/** cateDesc property */
	private String cateDesc;

	/** cateName property */
	private String cateName;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the cateDesc.
	 * @return String
	 */
	public String getCateDesc() {
		return cateDesc;
	}

	/** 
	 * Set the cateDesc.
	 * @param cateDesc The cateDesc to set
	 */
	public void setCateDesc(String cateDesc) {
		this.cateDesc = cateDesc;
	}

	/** 
	 * Returns the cateName.
	 * @return String
	 */
	public String getCateName() {
		return cateName;
	}

	/** 
	 * Set the cateName.
	 * @param cateName The cateName to set
	 */
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
}