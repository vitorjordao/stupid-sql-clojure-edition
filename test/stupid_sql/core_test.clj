(ns stupid-sql.core-test
  (:require [clojure.test :refer :all]
            [stupid-sql.core :as core]))

(deftest main-test
  (testing "Main working"
    (is (= 0 (core/-main)))))
