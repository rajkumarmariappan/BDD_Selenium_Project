Feature: Amazon scenarios

  @tag1
  Scenario Outline: Valdate error message in login page of Selling functionality
    Given Launch amazon website "<url>"
     When click selling link at the bottom of the page
     Then click start selling button on New page
      And Validate the error message on login page of Selling functionalityby entering invalid "<UN>" and "<PWD>" and "<error_msg>"

    Examples: 
      | url                    | UN  | PWD | error_msg |
      | https://www.amazon.in/ | abc | 123 | To better protect your account, please re-enter your password and then enter the characters as they are shown in the image below. |

      
      @tag2
  Scenario Outline: Repeat test above
    Given Launch amazon website "<url>"
     When click selling link at the bottom of the page
     Then click start selling button on New page
      And Validate the error message on login page of Selling functionalityby entering invalid "<UN>" and "<PWD>" and "<error_msg>"

    Examples: 
      | url                    | UN  | PWD | error_msg |
      | https://www.amazon.in/ | abc | 123 | To better protect your account, please re-enter your password and then enter the characters as they are shown in the image below. |
      