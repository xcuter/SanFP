(ns func.heronWithSteps)
(defn limit?
  [steps]
  (= 0 steps)

  )

(defn avg
  [x y]
  (/ (+ x y) 2)
  )

(defn improve
  [y x]
  (avg y (/ x y))
  )

(defn heron-sqrt
  [y x steps]
  (if (limit? steps)
    y
    (heron-sqrt (improve y x) x (dec steps))
    )
  )

(println (double(heron-sqrt 1 125 10))  )
