[Clojure][1]
===============

- Emphasis in immutability and referential transparency (no side-effects)
- Explicit concurrency support
- Designed for the JVM

Clojure is a LISP
=================

- Code as data
- Dynamically typed, and compiled
- Interactive - REPL
- Load / Change code in running program

Data types
=================
- Arbitrary precision integers `123456`
- Doubles `1.234`
- BigDecimals `1.234M`
- Ratios `12/7`
- Strings `"sample"`
- Chars `\a \b \c`
- Symbols `sample`
- Keywords `:sample`
- Booleans `true false`
- Regex `#"a*b"`

Data structures
=================
- Lists - Singly linked, grow at front 
 `(1 2 3 4 5) (sample1 sample2 sample3) (list 1 2 3)`

- Vectors - Indexed (fast) access, grow at the end 
 `[1 2 3] [sample1 sample2 sample3]`

- Maps - Key-Value associations 
 `{:a 1 :b 2 :c 3} {1 "sample1" 2 "sample2"}`

- Sets 
 `#{sample1 sample2 sample3}`

References:
=================
http://www.infoq.com/presentations/hickey-clojure

  [1]: http://clojure.org/functional_programming
  
