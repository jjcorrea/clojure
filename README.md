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

Clojure is functional
=================
> Functional programming as easy as programming in Python or Ruby

- Immutability
- Core library functions have no side effect
- Easier to understand
- Easier to test
- Higher order functions

Abstractions
=================
- [Sequences][2]
- Maps and Sets

Persistent data structures
=================
- Immutable - Making a new version is cheap
- All clojure data structures are persistent
- Structural sharing - Thread safe, iteration safe

Concurrency
=================
- Conventional way: Direct references to mutable objects with **Locks**
- Clojure way: Indirect references to immutable and persistent data structures. **No locks in code**.

Clojure references
=================
> The only thing that modifies a reference is the reference itself, in a controlled way

3 types of mutable references:

- **Refs** Share Synchronous changes between threads - **Transactional** system

- **Agents** Share Asynchronous changes between threads - Like **actor** models, but doent require message passing to read values

- **Vars** Isolates changes within threads - **Thread local**


Refs and Transactions
=================
- Software transactional model system (STM)
- Refs can only be changed within a transaction
- All changes are atomic, consistent and isolated
- Will be retried automatically if conflict
- User must avoud side-effects
- Surround code with `(dosync ...)`

Agents
=================
- Agents are not actors (Erlang / Scala)
- Independent state
- Actions = Functions
- Actions occur asynchronously, in a thread pool, and are dispatched using **send** or **send-off** which returns immediately
- One action per agent at a time

References:
=================
http://www.infoq.com/presentations/hickey-clojure

http://clojure.com/blog/

  [1]: http://clojure.org/functional_programming
  [2]: http://clojure.org/sequences  
