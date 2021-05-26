Feature: Client sign up

    @run
    Scenario: client sign up successfully
     Given Jose wants to have an account
     When he sends required information to get the account
      Then he should be told that the account was created


    Scenario: client sign up failed
        Given Jose wants to have an account
        When he sends required information to get the account
        Then he should be told that the account was not created

    Scenario: client sign up successfully 2
      Given Jose wants to have an account
      When he sends required information to get the account
      Then he should be told that the account was created


    Scenario: client sign up failed 2
      Given Jose wants to have an account
      When he sends required information to get the account
      Then he should be told that the account was not created