# form
- (get {:a 2 :b 4} :a)
- (get-in {:a {:b 2}} [:a :b])
- (:a {:c 1 :b "cd"} "abc")
- (get [1 2] 0)
- (vector 1 2 3)
- ( get (vector 1 2 3) 2)
- (conj [1 3 4] 5)
- ( nth '(1 2 3 ) 2)
- ( conj '(1 2 3) 6)
- #{1 2 3}
- (hash-set 1 2 3 1)
- (set [1 2 3 1])
- (set '(1 2 3 1))
- (conj #{2 3} 1)
- (conj #{1 2} 1)
- (contains? #{2 3} 2)
- (contains? #{2 3} 1)
- (get #{1 2 nil} 1)
- (get #{1 2 nil} 3)
- (get #{1 2 nil} nil)

# Function
- (+ 212 3 0)
- (defn say  "a function example" [name] (str "hello " name))
- (defn say "none" [name] (str "hello " name))
- (defn func-multi ([] (println "no args")) ([args1 args2](println args1 args2)))
- (defn func-args [name & names] (str name "" (clojure.string/join "" names)))
- (defn func-body [] (+ 1 3) (+ 2 6))
- ((fn [name](+ name 1)) 5)
- (#(str "hello " %1 %2) "world" "!")
- (#(str "hello " %1 (clojure.string/join " " %&)) "world " "my " "china " "!")

# Abstraction
- (first [1 2 4])
- (first #{1 2 4})
- (first {:1 2})
- (first '(:1 2))
- (rest '(2 3 4))
- (cons 1 [1 3 4])
- (cons {:1 2} {:1 3 :6 5})
- (defn  say [name] (str "hello " name)) (map say [1 3])
- (map #(str "hello " %1) {:a 1 :b 2})
- (#(* %1 %1) 6)
- (defn -main [& args] (println "hello world!" args))
- (count [1  2 3])
- (empty? [1])
- (every? #(> %1 3) [2 5 6])
- (into [] (map inc [2 3 5])) <=>  (into [] (map #(+ %1 1) [2 3 5]))
- (macroexpand '(when true [1 2 3]))
- (defmacro my-plus [args] (list (second args) (first args)(last args)))
- (my-plus (1 + 2))

# Concurrency
- (future (Thread/sleep 3000)(println "I am back!"))
- (let [result (future (println "run only once")(+ 1 1))] (println (deref result)) (println @result))
- (deref (future (Thread/sleep 100) 0) 1000 5)
- (let [f (future)] @f (realized? f))
- (let [notify (delay (println "hello world"))] (future ((Thread/sleep 2000) (force notify))))
- (def my-promise (promise)) -> (deliver my-promise (+ 2 3)) -> @my-promise
- (let [hello-promise (promise)] (future (println "hello" @hello-promise)) (Thread/sleep 3000) (deliver hello-promise (+ 2 3)))
- (def n (atom 1)) -> (swap! n inc) -> (reset! n 0)
- (map (fn [num] (map (fn [x y] (str x "*" y "=" (* x y))) (repeat num num) (range 1 10))) (range 1 10))
- (map (fn [num] (map #(str %1 "*" %2 "=" (* %1 %2)) (repeat num num) (range 1 10))) (range 1 10))
- (map (fn [num] (map #(str %1 %2)(repeat num num)(range 1 10))) (range 1 10))
- (map #(str %1 "*" %2 "=" (* %1 %2)) (repeat 4 4)(range 1 10))
- (map #(str %1) (range 1 10))
- (def x (ref 0)) ->  (def y (ref 0)) -> (dosync (ref-set x 1) (ref-set y 4)) -> [@x @4] -> (dosync (ref-set x (ensure y))) -> [@x @y]

# Polymorphism
- multimethod
- protocol
- 