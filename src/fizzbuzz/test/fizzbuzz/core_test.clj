(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizbuzz
  (testing "is fizz" (is (= (isFizz 3) true)))
  (testing "is buzz" (is (= (isBuzz 5) true)))
  (testing "is not fizz" (is (= (isFizz 1) false)))
  (testing "is not buzz" (is (= (isBuzz 1) false)))
  (testing "is fizzbuzz" (is (= (isFizzBuzz 15) true)))
  (testing "is not fizzbuzz" (is (= (isFizzBuzz 5) false)))
)

(deftest fizbuzz-game
  (testing "take fifteen" 
  	(is (= (fizzbuzzGame 15) '(1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11 "fizz" 13 14 "fizzbuzz")))
  )
)