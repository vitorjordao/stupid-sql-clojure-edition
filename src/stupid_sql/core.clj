(ns stupid-sql.core
  (:gen-class))


(defn hello-messages []
  (println "Project Stupid SQL"))

(defn -main
  "Starting project"
  [& args]
  (hello-messages)
  0)
