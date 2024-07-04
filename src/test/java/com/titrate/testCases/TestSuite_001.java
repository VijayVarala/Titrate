package com.titrate.testCases;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.titrate.pageObjects.LoginPage;
 
@RunWith(Suite.class)
@Suite.SuiteClasses({TC_001_VerifyLogin.class, TC_002_VerifyAddCamera.class})
 
public class TestSuite_001 extends BaseClass {
	LoginPage lp=new LoginPage(driver);
      

}