(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, my name is Clojure"))

;; Tehtävä 1
(defn basic-math []
  (+ 1 2 3 4))

;; Tehtävä 2
(defn print-name [name]
  (str "Hello and nice to meet you " name))

;; Tehtävä 3
(defn first-from-array []
  (first [1 2 3 4]))

;; Tehtävä 4
(def siilien-nimet 
  ["Aleksi" "Vade"])

;; Tehtävä 5
(defn is-it-true [booleanist]
  (if booleanist
    "SUCCESS!"
    "FAILURE!"))

;; Tehtävä 6
(defn multiple-string []
  (str "What is this " " weird language " "that I kinda like"))

;; Tehtävä 7
(defn merge-array []
  (conj ["a" "b" "c"] "z"))

;; Tehtävä 8
(defn nth-from-list []
  (nth '(:a :b :c) 1))

;; Tehtävä 9
(defn do-many-things [boolean]
(if boolean
  (do (println "SUCCESS!")
      "I MADE IT, I'M AWESOME!")
  (do (println "FAILURE!")
      "WHAT IS THIS (()) MADNESS")))

;; Tehtävä 10
(defn avain-map []
  (hash-map :a 1 :b 2))

;; Tehtävä 11
(defn increment-vector []
  (map inc [0 1 2 3 4]))

;; Tehtävä 12
(defn value-from-map []
  (get {:a 1 :b 2} :b))

;; Tehtävä 13
(defn anonym-function []
  (#(* % 7) 9))