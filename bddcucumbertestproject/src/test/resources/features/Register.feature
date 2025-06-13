Feature: Register functionality testing

  Background:
    Given user navigate to site url "https://warehouse-managmentsystem-stage-test.netlify.app/"
    Then verify home page title "Warehouse Management System"
    When user click on register link
    Then verify the register page title "Register"
@register @WMSY-T2
Scenario Outline: Verify register functionality with Valid data
    When user enter FirstName "<fname>"
    And user enter LastName "<lname>"
    And user enter EmailAddress "<email>"
    And user enter Password "<pass>"
    And user enter ConfirmPassword "<cpass>"
    When user select the role as "<role>"
    And user click on register button
    Then verify the logout button visible

  Examples:
    | fname  | lname | email                    | pass       | cpass      | role  |
    | ramesh | kumar | ramesh36543243@gmail.com | testing123 | testing123 | User  |
    | raj    | reddy | rajred3dy839722@gmail.com | testing123 | testing123 | Admin |

