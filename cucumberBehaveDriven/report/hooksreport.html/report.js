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
  "duration": 232109899,
  "status": "passed"
});
formatter.match({
  "location": "HooksAvengerExample.thanos_snaps_his_fingers()"
});
formatter.result({
  "duration": 113300,
  "status": "passed"
});
formatter.match({
  "location": "HooksAvengerExample.half_of_the_population_killed()"
});
formatter.result({
  "duration": 284500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Check for Thanos birth",
  "description": "",
  "id": "hooks-example-with-avenger-film-concept;check-for-thanos-birth",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Thanos birth is defined",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enters into the universe",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Destory the universe",
  "keyword": "And "
});
formatter.match({
  "location": "HooksAvengerExample.thanos_birth_is_defined()"
});
formatter.result({
  "duration": 221800,
  "status": "passed"
});
formatter.match({
  "location": "HooksAvengerExample.enters_into_the_universe()"
});
formatter.result({
  "duration": 430800,
  "status": "passed"
});
formatter.match({
  "location": "HooksAvengerExample.destory_the_universe()"
});
formatter.result({
  "duration": 377399,
  "status": "passed"
});
});