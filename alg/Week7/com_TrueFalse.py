from pickle import TRUE


YES=lambda a:lambda b :a
NO=lambda a:lambda b :b
IF = lambda con:lambda a:lambda b:con(a)(b)
print(IF(NO)("YES")("NO"))