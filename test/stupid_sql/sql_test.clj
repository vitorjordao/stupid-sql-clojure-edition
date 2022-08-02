(ns stupid-sql.sql-test
    (:require [clojure.test :refer :all]
        [stupid-sql.sql :as sql]))

(deftest sql-test
    (testing "state should be create a database"
        (is (some? (sql/create-database "test"))))
    (testing "state should be exist a database created"
        (is (some? (sql/use-database "test"))))
    (testing "state should not be exist a database created"
        (not (some? (sql/use-database "test2")))))