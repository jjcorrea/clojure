(def m {:a 1 :b 2 :c 3} )

(m :b) ;or (:b m)

(keys m)

(assoc m :d 4 :e 5)

(union #{:a :b :c} #{:d e :f}) -> #{:d :a :b :c :e}
