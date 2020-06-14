(ns func.oneMoreTImeCubeRoot)

(defn cube [x]
  (* x x x)
  )

(defn square
  [x]
  (* x x)
  )

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough?
  [y x]
  (< (abs (- x (cube y))) 0.000001)
  )

(defn improve
  [y x]
  (/ (+ (/ x (square y)) (* y 2)) 3))                       ;; => (y^2/x + 2y) /3

(defn cuRoot
  [y x]
   (if (good-enough? y x)
      y
      (cuRoot (improve y x ) x ))
  )



(println (double (cuRoot 3 729)))
