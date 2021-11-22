package com.Comp.stepDef;

import com.Comp.reusableCompon.Base;

import io.cucumber.java.BeforeAll;
public class HookforExtentreport extends Base{
	
	@BeforeAll
	public static void init()
	{
		initializeReport();
	}


}
