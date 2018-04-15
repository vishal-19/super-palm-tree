# This is called as a feature file here we can have one Feature tag and any number of scenarios under that
# This is written in gherkin language ( just like english) see below
#
@fulltest
Feature: Testing different operations
@add
Scenario: addition of two numbers

Given i have two numbers 3 and 5
When i add these numbers
Then i get 8


#In the below sceario we are re-using few lines but the multiplication step cant be used as that point
#we are checking multiplication method at that step hence we have to add one more line to the step def class
#Sequence doesnt matter we can put the line anywhere with any tag "given", when", "then", "and", "but"
@mult
Scenario: Multiplication of two numbers

Given i have two numbers 6 and 7
When i multiply these
Then i get 42