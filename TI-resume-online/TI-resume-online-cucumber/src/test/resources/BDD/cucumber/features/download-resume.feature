Feature: Download resume.
 
  Scenario Outline: sending request to download.
    Given an employee "<Arbeitnehmer>".
    And the type format to download "<Formattyp>".
    When sending request to the web service service.
    Then should return a response.

    Examples: 
      | Arbeitnehmer 						 | Formattyp            |
      | c5266979                 | PDF 									|
