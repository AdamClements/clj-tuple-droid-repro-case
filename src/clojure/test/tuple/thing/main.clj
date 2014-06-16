(ns test.tuple.thing.main
  (:use [neko.activity :only [defactivity set-content-view!]]
        [neko.threading :only [on-ui]]
        [clj-tuple :refer [tuple]]
        [neko.ui :only [make-ui]]))

(defactivity test.tuple.thing.MainActivity
  :on-create
  (fn [this bundle]
    (on-ui
     (set-content-view! this
      (make-ui [:linear-layout {}
                [:text-view {:text (str "Here is a tuple: " (tuple 5 5))}]])))))
