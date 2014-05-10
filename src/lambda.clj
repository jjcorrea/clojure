; lambda using fn
(map (fn [a] (str "hi " a)) ["mum" "dad" "sister"])

; lambda using the shorthand #()
(map #(str "hi " %) ["mum" "dad" "sister"])

; lambda with optional parameter
(map #(+ 2 %)[1][2])

