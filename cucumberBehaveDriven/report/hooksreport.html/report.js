$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HooksAvengerExample.feature");
formatter.feature({
  "line": 2,
  "name": "Hooks example with Avenger film concept",
  "description": "",
  "id": "hooks-example-with-avenger-film-concept",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Hooks"
    }
  ]
});
formatter.before({
  "duration": 256500,
  "status": "passed"
});
formatter.before({
  "duration": 125600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Learn Hook Concept using Avengers",
  "description": "",
  "id": "hooks-example-with-avenger-film-concept;learn-hook-concept-using-avengers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Thanos has infinity stones",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Thanos snaps his fingers",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Half of the population killed",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksAvengerExample.thanos_has_infinity_stones()"
});
formatter.result({
  "duration": 244898400,
  "status": "passed"
});
formatter.match({
  "location": "HooksAvengerExample.thanos_snaps_his_fingers()"
});
formatter.result({
  "duration": 79800,
  "status": "passed"
});
formatter.match({
  "location": "HooksAvengerExample.half_of_the_population_killed()"
});
formatter.result({
  "duration": 153000,
  "status": "passed"
});
formatter.after({
  "duration": 66900,
  "status": "passed"
});
formatter.after({
  "duration": 56800,
  "status": "passed"
});
formatter.after({
  "duration": 71000,
  "status": "passed"
});
});