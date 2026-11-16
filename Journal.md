# Phase 0

My plan is to create a Spell class that stores the name, power level, and school of magic for each spell. I will use an ArrayList to hold all the spell objects. Then I will use Java Streams to filter spells by school, sort them by power level, and get the names of the strongest spells.

# journal Prompt

The most confusing part is understanding how the Stream pipeline works. I am not completely sure how all the steps connect, but I plan to build it one phase at a time.

# Phase 1

I created the Spell class with a name, power level, and school. I also added 10 spells to an ArrayList and printed them to the console.

A class is the blueprint that describes an object. An object is an actual instance created from that class with its own information.

# Phase 2

I used the stream and filter methods to find only Necromancy spells. The filter checks each spell's school and keeps the ones that match. The lambda expression tells the filter what condition to check.

# Phase 3

I added the sorted method to rank the spells by power level. I used Integer.compare to put the strongest spells first. Intermediate operations like filter and sorted prepare the data, while a terminal operation like collect finishes the pipeline.

# Phase 4

My pipeline starts with the ArrayList of spells. The filter keeps only Necromancy spells, sorted puts them in power order, map extracts their names, and limit keeps the top three. Collect puts the results into a new list of Strings.

# Phase 5

I tested the program with different schools of magic. The filters worked correctly, including when I searched for a school that had no spells. I also tested spells with equal power levels to make sure the sorting worked correctly. Everything worked as expected.
