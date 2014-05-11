(ns fizzbuzz.core)

(defn isFizz
  "Checks if a number is fizz"
  [x]
  (= (mod x 3) 0))

(defn isBuzz
  "Checks if a number is buzz"
  [x]
  (= (mod x 5) 0))

(defn isFizzBuzz
  "Checks if a number is fizzbuzz"
  [x]
  (and (isFizz x) (isBuzz x))
)

(defn fizzBuzz
	"Maps a number to fizz / buzz"
	[x]
	(if (isFizzBuzz x) "fizzbuzz" (if (isFizz x) "fizz" (if (isBuzz x) "buzz" x)))	
)

(defn fizzbuzzGame
  "Takes a number and runs the game"
  [x]
  (map fizzBuzz (range 1 (+ x 1)))
)

; ("fizzbuzz" 1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11 "fizz" 13 14 "fizzbuzz") 
; ("fizz" 1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11 "fizz" 13 14 "fizzbuzz")