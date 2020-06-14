(ns func.Euler5)

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x)
  )

(defn gcd
  [x y]
  (loop [a x b y]
    (if (zero? b)
        a
        (recur b (mod a b))
      ))
    )

(defn lcm
  [a b]
    (/ (abs (* a b)) (gcd a b) ))


;;(reduce lcm (range 1 21))                                   ;; nie działa

(println (reduce lcm (range 1 21)))