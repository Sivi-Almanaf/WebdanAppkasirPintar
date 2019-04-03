$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("basic.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "File ini berguna untuk mengeksekusi basic function ke dalam cucumber",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 185234,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Scenario Login Succes",
  "description": "Ini adalah keterangan basic scenario Login Succes",
  "id": "login-feature;scenario-login-succes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User berada di halaman pembuka",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User klik button next",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User klik field column Email dan mengisi email",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User klik field column passwoord dan mengisi password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User klik button login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_berada_di_halaman_pembuka()"
});
formatter.result({
  "duration": 21427636280,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_klik_button_next()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 3696092201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_klik_field_column_Email_dan_mengisi_email()"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 8946049562,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_klik_field_column_passwoord_dan_mengisi_password()"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 7599601565,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_klik_button_login()"
});
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 1766184931,
  "status": "passed"
});
});