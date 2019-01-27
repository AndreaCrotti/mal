(ns mal.step0-repl
  (:gen-class))

(defn read
  [s]
  s)

(defn eval
  [expr]
  expr)

(defn print
  [expr]
  (println expr))

(defn loop
  []
  (while true
    (println "user>")
    (let [inp (read-line)
          parsed (read inp)
          ev (eval parsed)]

      (print ev))))

(defn -main [& args]
  (loop))
