Feature: US1002 Benutzer geht zu AmazonHomePage und sucht mehrere Produkte

  Scenario: TC02 Benutzer sollte in der Lager sein Produkte zu suchen und zu testen

    Given benutzer geht zu amazon hauptSeite
    Then schreibt Nutella in SearchBox und sucht
    And testet ob ergebnis der Suchung Nutella enthalt
    And mach webseite zu

    Given benutzer geht zu amazon hauptSeite
    Then schreibt Java in SearchBox und sucht
    And mach webseite zu

    Given benutzer geht zu amazon hauptSeite
    Then schreibt Samsung in SearchBox und sucht
    And mach webseite zu