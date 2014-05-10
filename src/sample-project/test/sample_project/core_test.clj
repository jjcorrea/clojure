(ns sample-project.core-test
  (:require [clojure.test :refer :all]
            [sample-project.core :refer :all]))

(deftest a-test
  (testing "Arithmetic"
  	(testing "with positive integers"
	    (is (= 4 (+ 2 2)))
	    (is (= 7 (+ 3 4))))
	(testing "with negative integers"
	    (is (= -4 (+ -2 -2)))
	    (is (= -1 (+ 3 -4))))))