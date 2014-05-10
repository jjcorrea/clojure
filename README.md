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

Syntax
=================
> Things that would be declarations, control structures, function calls,
> operators, are all just lists with the op at the front

- Data structures **are** the code
- Not text-based syntax, syntax is the **interpretation** of the data structures
- No statements, everything is an expression
- Tiny core, extended with Macros

Java interoperability
=================
- `Math/PI 3.141592653589793`
- `(.. System getProperties (get "java.version"))`
- `(new java.util.Date)`

Clojure is functional
=================
> Functional programming as easy as programming in Python or Ruby

- Immutability
- Core library functions have no side effect
- Easier to understand
- Easier to test
- Higher order functions


References:
=================
http://www.infoq.com/presentations/hickey-clojure

http://clojure.com/blog/

  [1]: http://clojure.org/functional_programming
  
