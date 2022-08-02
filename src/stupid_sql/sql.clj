(ns stupid-sql.sql)

(def state (atom {}))

(defn create-database [name]
    (swap! state (fn [state-map] (assoc state-map name {}))))

(defn use-database [name]
    (let [database (get @state name)]
        (if (some? database)
            database
            (println (str "Not exist " name " database.")))))