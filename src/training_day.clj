(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))
(defn hello
  "gives optional greetings"
  [who]
  (str "Hello, " who "!"))

(hello "beautiful")
(use 'clojure.repl)
(doc +)
