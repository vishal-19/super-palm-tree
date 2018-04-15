package com.bdd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This runner is used to run the feature files tags option describes which
 * feature file or files or which scenario of feature needs to be run
 * 
 * @author vishal
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = { "@fulltest" }, features = { "." })
public class RunCukesTest {

	/**
	 * Here you can setup anything you want prior to executing a scenario
	 */
	@BeforeClass
	public static void setUp() {

	}

	/**
	 * Here you can put anything you want to be executed after every scenario
	 */
	@AfterClass
	public static void endSetUp() {

	}

}