@wip
Feature: US1005 Der Benutzer verwendet die in configuration.properties geschriebenen Daten als Parameter

# 3 Erstellen Sie ein Szenario und gehen Sie zu den Homepages von Amazon, Wisequarter und Walmart
  # und teste, dass wir zu diesen Homepages gehen

  Scenario:TC06 Benutzer testet den Zugriff auf die AmazonSite

    Given benutzer geht zu "amazonurl" hauptSeite
    Then tested dass url "amazon" enthalt
    And mach webseite zu

    Scenario: TC07 Benutzer testet den Zugriff auf die wisequarter

      Given benutzer geht zu "wqUrl" hauptSeite
      Then tested dass url "wisequarter" enthalt
      And mach webseite zu

      Scenario: TC08 Benutzer testet den Zugriff auf die walmart

        Given benutzer geht zu "walmartUrl" hauptSeite
        Then tested dass url "walmart" enthalt
        And mach webseite zu