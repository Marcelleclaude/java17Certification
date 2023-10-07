You use a Set when you don’t want to allow duplicate entries

**Comparing Set Implementations**:

A HashSet stores its elements in a hash table, which means the keys are a hash and the
values are an Object. This means that the HashSet uses the hashCode() method of the
objects to retrieve them more efficiently. (soooo sa pa care de order lan . janl vini li pranl)

-A TreeSet stores its elements in a sorted tree structure. The main benefit is that the set is
always in sorted order. The trade-off is that adding and checking whether an element exists
takes longer than with a HashSet, especially as the tree grows larger.( sa se on gendarme, en ordre ou li ye)

**Working with Set Methods** :

Like a List, you can create an immutable Set in one line or make a copy of an existing one.
Set<Character> letters = Set.of('z', 'o', 'o');
Set<Character> copy = Set.copyOf(letters);

Remember: The hashCode() method is used to know which bucket to look in so that Java doesn’t have to look through
the whole set to find out whether an object is there
