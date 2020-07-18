byte b = 3
println(b)

println(Byte.MIN_VALUE)
println(Byte.MAX_VALUE)  // typ byte


long longValue = 100_000L
print(longValue)
print Long.MIN_VALUE
print Long.MAX_VALUE  // typ long


float floatNumber = 100.002F
println(floatNumber)
print Float.MIN_VALUE
print Float.MAX_VALUE    // typ float


double doubleNumber = 1000.00003D   //typ double, ma wieksza precyzje niz float
println(doubleNumber)
println(Float.MIN_VALUE)
println(Float.MAX_VALUE)


char c = 'a' //typ character to pojedyncze znaki,
println(c)

boolean flag = true
print(flag)   // typ boolean true / false


String name = "Monika"
println(name)    // zmienna typu String


// typ danych sprawdzimy w poniższy sposób

println(name.getClass().getName())
println(flag.getClass().getName())
println(c.getClass().getName())










