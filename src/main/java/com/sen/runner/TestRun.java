package com.sen.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = {"G:\\SeleniumCucumberWorkSpace\\BCSProject\\src\\main\\java\\com\\sen\\features\\homePage.feature"},
                 glue = {"com\\sen\\tests"},
                 monochrome = true,
                 plugin = {"pretty","json:target/reports/jsonreport/index.json","html:target/reports/htmlreport","junit:target/reports/xmlreport.xml"},
                 dryRun = false)

public class TestRun {

}
//,"G:\\SeleniumCucumberWorkSpace\\BCSProject\\src\\main\\java\\com\\sen\\features\\searchpage.feature"