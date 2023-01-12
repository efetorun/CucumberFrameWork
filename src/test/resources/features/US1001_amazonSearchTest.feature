Feature: US1001 Benutzer macht Test in Website Amazon

  Scenario: C01 Benutzer sucht Nutella in Website Amazon

    Given benutzer geht zu amazon hauptSeite
    Then schreibt Nutella in SearchBox und sucht
    And testet ob ergebnis der Suchung Nutella enthalt
    Then mach webseite zu
