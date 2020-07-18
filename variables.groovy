
def x = 10
def X = 50  // zmienne są wrażliwe na wielkosc liter


println(x) //github.com/ann352/groovy.git
println(X)

def(a,b) = [10,20]
println(a)
println(b)

def (String w, int y, Double z) = [2,3,4]
println(w)
println(y)
println(z)

//castowanie danych
def R = 20
def k = (byte)20
println(k.getClass().getName())