Feature: US1003 Benutzer sucht nach eingegebenen Werten mit Parameter

  Scenario: TC03 Benutzer sucht nach Nutella mit Parameter

   Given benutzer geht zu amazon hauptSeite
    Then schreibt "Nutella" in SearchBox und sucht
    And testet ob ergebnis der Suchung "Nutella" enthalt
    And 5 minuten wartet
    And mach webseite zu

   Given benutzer geht zu amazon hauptSeite
   Then schreibt "Java" in SearchBox und sucht
   And testet ob ergebnis der Suchung "Java" enthalt
   And 3 minuten wartet
   And mach webseite zu

   Given benutzer geht zu amazon hauptSeite
   Then schreibt "Samsung" in SearchBox und sucht
   And testet ob ergebnis der Suchung "Samsung" enthalt
   And 2 minuten wartet
   And mach webseite zu