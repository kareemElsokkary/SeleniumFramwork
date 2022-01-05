  
  
      Feature: Check invalid Test Data 
      I want to test if the user can not register on lidl website with incorrect Data
      
      @TestinvalidTestData
      Scenario: User Register with invalid insuccesful 
      Given User in Registeration page with invalid TestData
      When Enter The User invalid Data with "<Email>" , "<Password>"
      Then Registeration is unsuccesful
      
      
       Examples: 
      | Email  | Password  |
      | kareem.12345122316gmail.com |  Password1234556! |
      | kareem.1231234567gmail.com |  PPassword1234556! |
      
      
      @Testinvalidpassword
      Scenario: User Register with invalid password insuccesful 
      Given User in Registeration page with invalid Password TestData
      When Enter The User invalid Password Data with "<Email>" , "<Password>"
      Then Registeration is unsuccesful with invalid Password 
      
      
       Examples: 
      | Email  | Password  |
      | kareem.12345122316@gmail.com |  Ab1$eg82 |
        | kareem.12345122316@gmail.com |  Ab1EFG82CC |
          | kareem.12345122316@gmail.com |  ab1efg82cc$ |
            | kareem.12345122316@gmail.com |  12345678910 |
             | kareem.12345122316@gmail.com |  Ab123aeg82 |
     
     
      