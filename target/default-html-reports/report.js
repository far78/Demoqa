$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ToolTips.feature");
formatter.feature({
  "name": "ToolsTips",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Hover over Button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the \"Tool Tips\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegistrationFormStepDef.the_user_is_on_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user hover over the \"Button\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.demoqa.step_definitions.ToolTipsStepDef.the_user_hover_over_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user  receives \"You hovered over the Button\" text",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.ToolTipsStepDef.theUserReceivesText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Hover over the field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the \"Tool Tips\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegistrationFormStepDef.the_user_is_on_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user hover over the \"Field\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.demoqa.step_definitions.ToolTipsStepDef.the_user_hover_over_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user  receives \"You hovered over the text field\" text",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.ToolTipsStepDef.theUserReceivesText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});