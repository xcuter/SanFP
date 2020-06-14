(ns func.database)

(defonce persons-atom (atom {}))

(defn add-person!
  [email first-name last-name city street number post-code ]
  (swap! persons-atom assoc
         email {:first-name first-name
                :last-name  last-name
                :city       city
                :street     street
                :number     number
                :postal     post-code
                }))

(defn first-name
  [email]
  (:first-name (@persons-atom email)))

(defn last-name
  [email]
  (:last-name (@persons-atom email)))

(defn city
  [email]
  (:city (@persons-atom email))
  )

(defn street
  [email]
  (:street (@persons-atom email))
  )
(defn number
  [email]
  (:number (@persons-atom email))
  )

(defn  post-code
  [email]
  (:postal (@persons-atom email))
  )
;; (defn add-person
;;   [persons email first-name last-name]
;;   (assoc persons
;;     email {:first-name first-name
;;            :last-name   last-name}))

;; (defn first-name
;;   [persons email]
;;   (:first-name (persons email)))

;; (defn last-name
;;   [persons email]
;;   (:last-name (persons email)))

;; (-> {}
;;   (add-person"kongra@gmail.com"  "Konrad"  "Grzanek")
;;   (add-person"kongra1@gmail.com" "Konrad1" "Grzanek")
;;   (add-person"kongra2@gmail.com" "Konrad2" "Grzanek")
;;   (add-person"kongra3@gmail.com" "Konrad3" "Grzanek")
;;   (add-person"kongra4@gmail.com" "Konrad4" "Grzanek"))
(add-person! "fp@gmail.com" "Functional" "Programming" "Electronic" "Electronica" "78" "00-000")
 (println (first-name "fp@gmail.com"))