; Small file to string
(slurp "/Users/joelcorrea/.bashrc")

; clojure.java.io reader -> java.io.Reader
; reads the file lazily
(:require [clojure.java.io :as io]))

(with-open [rdr (io/reader "/Users/joelcorrea/.bashrc")]
	(doseq [line (line-seq rdr)]
  		(println line)
  	)
)

; reads the entire file at once
(doseq [line, (with-open [rdr (io/reader "/Users/joelcorrea/.bashrc")]
    (doall (line-seq rdr)))](println line))

; copies the file
(with-open [rdr (io/reader "/Users/joelcorrea/.bashrc")
    wrt (io/writer "/Users/joelcorrea/FOO")]
    (doseq [line (line-seq rdr)]
    (.write wrt (str line "\n"))))

; read from url
(slurp "http://beaconhill.com")


; defines a build-url function
(defn build-url [sym]
    (str "http://ichart.finance.yahoo.com/table.csv?s=" sym "&ignore=.csv"))

; let sets up two variables
; that are 'used' in the following closures
(defn download-historical-quotes [sym]
    (let [url (build-url sym) filename (str sym ".csv")]
	 	 (with-open [rdr (io/reader url) wrt (io/writer filename)]
		    (doseq [line (line-seq rdr)]
		    	(.write wrt (str line "\n"))
		    )
	    )
    ))