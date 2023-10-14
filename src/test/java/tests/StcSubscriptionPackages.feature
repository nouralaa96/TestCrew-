Feature: Plan Price Feature
  In order to subscribe to STC TV
  As a valid customer from KSA KW or BH
  I want to check the plans currency in my country currency and preferred language


  Scenario Outline: check price and currency in  english

    Given user Navigate to STC Tv Website
    When  user select "<country>"
    Then   user Should see lite plan price in country currency and selected language
    And   user Should see classic plan price in country currency and selected language
    And   user Should see permium plan price in country currency and selected language

    Examples:
      | country |
      | KSA     |
      | KW      |
      | BH      |