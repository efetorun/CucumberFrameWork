
Feature: US1005 Der Benutzer verwendet zu Beginn den Hintergrund für allgemeine Schritte

  Background:Gemeinsamer Schritt für alle Szenarien
    Given benutzer geht zu amazon hauptSeite

    Scenario:TC03 Sucht Java mit der vom Benutzer parametrisierten Methode

      Then schreibt "Java" in SearchBox und sucht
      And testet ob ergebnis der Suchung "Java" enthalt
      And mach webseite zu

      Scenario: TC04 Sucht Nutella mit der vom Benutzer parametrisierten Methode

        Then schreibt "Nutella" in SearchBox und sucht
        And testet ob ergebnis der Suchung "Nutella" enthalt
        And mach webseite zu

        Scenario: TC05 Sucht Samsung mit der vom Benutzer parametrisierten Methode

          Then schreibt "Samsung" in SearchBox und sucht
          And testet ob ergebnis der Suchung "Samsung" enthalt
          And mach webseite zu