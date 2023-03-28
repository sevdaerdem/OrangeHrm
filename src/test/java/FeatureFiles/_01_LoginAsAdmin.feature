

Feature: Login as Admin

  Scenario: As an Admin user I should be able to create an ESS user account so that ESS user will be having his own valid username and valid password.


    Given Navigate to Site

    When login as an Admin

    And Navigate to Admin Page and Click add Button



#    And   Click on the element in LeftNav
#    |  Admin  |
#
#    And   Click on the element in Dialog
#    | addBtn  |

  And   fill up the form by entering the required info to the all input boxes I click on Save button
#
#  Then  I verify that ESS – user name is added on the list