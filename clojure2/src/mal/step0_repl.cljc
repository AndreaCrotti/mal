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

(defn REP
  [s]
  (-> s
      READ
      (EVAL {})
      PRINT))

(defn LOOP
  []
  (let [line (read-line)]
    (when line
      (REP line)
      (recur))))

(defn -main [& args]
  (LOOP))
