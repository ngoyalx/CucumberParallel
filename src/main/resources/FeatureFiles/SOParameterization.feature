Feature: Check parameterization

Scenario Outline: Check navigation with multiple URL's
When user navigates to "<url>"
Then page should open with title "<expectedtitle>"
Examples:
|url|expectedtitle|
|https://www.google.com|Google|
#|https://www.yahoo.com|Yahoo|
#Examples:
#|url|expectedtitle|
#|https://www.google.com|Google|
#|https://www.yahoo.com|Yahoo|