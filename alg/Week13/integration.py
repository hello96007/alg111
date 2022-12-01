def integrate(f,a,b,h = 0.0001):
    area = 0
    x= a
    while x<b:
        area +=f(x)*h
        x+=h
    return area

print(f'integrate',integrate(lambda x:x**2, 0, 1))    
#黎曼積分