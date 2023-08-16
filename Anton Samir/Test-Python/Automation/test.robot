*** Settings ***
Library     SeleniumLibrary

*** Variables ***
${url}  https://www.evapharma.com/
${browser}  chrome
*** Test Cases ***
Google
    Happy-Scenario
*** Keywords ***
Happy-Scenario
    Open Browser    ${url}   ${browser}
    Maximize Browser Window
    Sleep    1
    Click Button    xpath: //h6[normalize-space()='Contact Us']
    Sleep    2
    Input Text    xpath://input[@placeholder='Your Name']    Anton Samir
    Input Text    xpath://input[@placeholder='Your email']    antonsamir882@gmail.com
    Input Text    xpath://input[@placeholder='Your phone']    1287090732
    Input Text    xpath://input[@placeholder='Your subject']    Fresh
    Input Text    xpath://input[@id='custom-css-outlined-input']    jkfgfgf dfgfdgkk kdfgfdkg dfgfgfdgnj fdfkgjfdgkfngkgd
    Sleep    2
    Click Button    xpath: //span[normalize-space()='Submit']
    Sleep    2
    ${input_txt}    Set Variable     xpath: //*[@id="__next"]/div[2]/div[2]/div
    Element Should Be Enabled    ${input_txt}
    Element Should Be Visible    ${input_txt}
    Sleep    2
    Close Browser


