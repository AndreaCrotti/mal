(ns mal.step0-repl
  (:gen-class))

(defn READ
  [s]
  s)

(defn EVAL
  [ast env]
  ast)

(defn PRINT
  [expr]
  (println expr))

(defn LOOP
  []
  (while true
    (print "user>")
    (let [inp (read)
          ast (READ inp)
          ev (EVAL ast {})]

      (PRINT ev))))

(defn -main [& args]
  (LOOP))
