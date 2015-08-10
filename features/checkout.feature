Feature: Checkout
	Scenario Outline: Checkout a banana
	Given the price of a "banana" is 40c
	When I checkout <count> "banana"
	Then the total prise is <total>c
	
	Examples:
    |	count	|	total	|
    |	1		|	40		|
    |	2		|	80		|
    |	3		|	120		|
    
    
    Scenario: Two bananas scanned separately
	Given the price of a "banana" is 40c
	When I checkout 1 "banana"
	Then the total prise is 40c
	And I checkout 1 "banana"
	Then the total prise is 80c
	
	Scenario: A banana and an apple
	Given the price of a "banana" is 40c
	And the price of a "apple" is 25c
	When I checkout 1 "banana"
	And I checkout 1 "apple"
	Then the total prise is 65c
	
	Scenario: Two bananas and an apple
	Given the price of a "banana" is 40c
	And the price of a "apple" is 25c
	When I checkout 2 "banana"
	And I checkout 1 "apple"
	Then the total prise is 105c
	
	