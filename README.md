# Raindrops

## About

Simple application that takes a number, checking factor of 3, 5 or 7 and returning appropriate message.

- If 3 is a factor, return 'Pling'
- If 5 is a factor, return 'Plang'
- If 7 is a factor, return 'Plong'
- If does not have any factor of above return String value of the number

## Examples

|Input |Factors of 3 |Factors of 5 |Factors of 7 |Output |
--- | --- | --- | --- | ---
|**6**|**YES**|**X**|**X**|**'Pling'**|
|**10**|**X**|**YES**|**X**|**'Plang'**|
|**14**|**X**|**X**|**YES**|**'Plong'**|
|**15**|**YES**|**YES**|**X**|**'PlingPlang'**|
|**21**|**YES**|**X**|**YES**|**'PlingPlong'**|
|**35**|**X**|**YES**|**YES**|**'PlangPlong'**|
|**105**|**YES**|**YES**|**YES**|**'PlingPlangPlong'**|
|**127**|**X**|**X**|**X**|**'127'**|
|**-277**|**X**|**X**|**X**|**'-277'**|
|**0**|**X**|**X**|**X**|**'0'**|

## Summary

In this project I implemented Test driven Development which means I first created failing tests
for all possible return messages and next I implemented the plingPlangPlong method.

After making sure the app is working as intended I implemented
Behaviour Driven Development and wrote the gherkin scenario for all 
return messages and created stepdefs file.






