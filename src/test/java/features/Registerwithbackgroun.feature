
    @TestBackground
      Feature: user can register 
      I want to test if the user can register on lidl website
   Background: User in Register Page
    Given User in Register page
      
      #@TestValidTD
      Scenario: User Registeration
      When EnterUser Data with "<Email>" , "<Password>"
      Then Registeration is succesfully
      
      
       Examples: 
      | Email  | Password  |
      | kareem.1212313456@gmail.com |  Password1234556! |
     | kareem.123123114567@gmail.com |  Password1234556! |
     
      #@TestinValidTD
      Scenario: User Register with invalid insuccesful 
           When Enter User invalid Data with "<Email>" , "<Password>"
      Then Registeration is unsuccesfully
      
      
       Examples: 
      | Email  | Password  |
      | kareem.12345122316gmail.com |  Password1234556! |
      | kareem.1231234567gmail.com |  PPassword1234556! |
     