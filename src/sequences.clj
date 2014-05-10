(drop 2 [1 2 3 4 5]) -> [3 4 5]

(take 9 (cycle [1 2 3 4])) -> [1 2 3 4 1 2 3 4 1]

(map vector [:a :b :c] [1 2 3]) -> ([:a 1] [:b 2] [:c 3])

(reduce + (range 100)) -> 4950
