$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Testcase3.feature");
formatter.feature({
  "line": 1,
  "name": "Test Case3",
  "description": "",
  "id": "test-case3",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To check in Members Benefits Page",
  "description": "",
  "id": "test-case3;to-check-in-members-benefits-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User open URL \"https://www.marriott.com/default.mi\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks Member Benefits under Marriot Bonvoy module",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should verify whethere thers is Mobile Checkin and Mobile key present or not",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageSteps.user_open_the_chrome_browser()"
});
formatter.result({
  "duration": 12249691000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.marriott.com/default.mi",
      "offset": 15
    }
  ],
  "location": "LandingPageSteps.user_open_url(String)"
});
formatter.result({
  "duration": 45693103800,
  "status": "passed"
});
formatter.match({
  "location": "TestCase3Steps.user_clicks_member_benefits_under_marriot_bonvoy_module()"
});
formatter.result({
  "duration": 1160000,
  "error_message": "java.lang.NullPointerException\r\n\tat com.milestone4.marriot.PageObjects.TestCase3.getMemberBenefits(TestCase3.java:16)\r\n\tat com.milestone4.marriot.StepDefinitions.TestCase3Steps.user_clicks_member_benefits_under_marriot_bonvoy_module(TestCase3Steps.java:22)\r\n\tat ✽.When User clicks Member Benefits under Marriot Bonvoy module(./Features/Testcase3.feature:6)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});