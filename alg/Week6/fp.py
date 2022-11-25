def each(a, f):
    for x in a:
        f(x)

def map(a, f):
    r = []
    for x in a:
        r.append(f(x))
    return r

def filter(a, f):
    r = []
    for x in a:
        if f(x): r.append(x)
    return r

def reduce(a, f, init):
    r = init
    for x in a:
        r = f(r, x)
    return r

'''def Forloop(a,f):
    r = []
    for x in a:
        r.append(f(x))
    return r'''

def why()

if __name__=="__main__":
    a = range(1,5)
    each(a, lambda x:print(x))#對A的每一個元素印出來
    each(a, lambda x:print(x) if x%2==0 else None)#會return
    print(map(a, lambda x:x*x))#map為陣列
    print(filter(a, lambda x:x%2==1))
    print(reduce(a, lambda x,y:x+y, 0))#reduce為加總
    #print(Forloop(a,lambda x:x-10))
    


