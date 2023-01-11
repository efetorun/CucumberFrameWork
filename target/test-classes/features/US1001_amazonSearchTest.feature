Feature: US1001 Benutzer macht Test in Website Amazon

  Scenario: C01 Benutzer sucht Nutella in Website Amazon

    Given benutzer geht zu Amazon HauptSeite
    Then schreibt Nutella in SerachBox und sucht
    And testet ob ergebnis der Suchung Nutella enthalt
    Then mach Webseite zu
