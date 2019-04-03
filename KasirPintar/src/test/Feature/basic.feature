Feature: Login Feature
  File ini berguna untuk mengeksekusi basic function ke dalam cucumber

  @Login
  Scenario: Scenario Login Succes
  Ini adalah keterangan basic scenario Login Succes
    Given User berada di halaman pembuka
    When User klik button next
    And User klik field column Email dan mengisi email
    And User klik field column passwoord dan mengisi password
    Then User klik button login