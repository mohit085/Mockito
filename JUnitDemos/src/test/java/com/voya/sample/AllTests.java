package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.voya.testcases.CalculatorTest;

//@RunWith(Suite.class)
//@SuiteClasses({CalculatorTest.class,StudentTest.class})

@RunWith(JUnitPlatform.class)  //Junit4

@SelectPackages({"com.voya.testcases"})

//@IncludePackages({"com.voya.testcases.trial"})

@ExcludePackages({"com.voya.testcases.trial"})


//@SelectClasses({"CalculatorTest.java"})


//@IncludeTags({"first","simple","negative"})
//@ExcludeTags({"first"})

public class AllTests {
	
}
