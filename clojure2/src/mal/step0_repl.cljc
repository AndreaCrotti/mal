(ns mal.step0-repl
  (:gen-class))

(defn READ
  [s]
  s)

(defn EVAL
  [expr]
  expr)

(defn PRINT
  [expr]
  (println expr))

(defn LOOP
  []
  (while true
    (print "user>")
    (let [inp (read)
          parsed (READ inp)
          ev (EVAL parsed)]

      (PRINT ev))))

(defn -main [& args]
  (LOOP))
