package com.carlos.AppSixPack.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\appSixPack.feature", glue = "com.carlos.AppSixPack",tags= {"@CP013"})

public class runner__appSixPack {

}
