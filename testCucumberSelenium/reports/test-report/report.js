$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/demo.feature");
formatter.feature({
  "name": "This is a feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The given test",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoSteps.the_given_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The when test",
  "keyword": "When "
});
formatter.match({
  "location": "DemoSteps.the_when_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The then test",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoSteps.the_then_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test scenario 2",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The given test",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoSteps.the_given_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The when test",
  "keyword": "When "
});
formatter.match({
  "location": "DemoSteps.the_when_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The then test",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoSteps.the_then_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});