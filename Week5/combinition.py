import random

def com(n,k):
    a=list(range(0,n))
    check= random.randrange(0,n)
    a[0]=check
    i=1
    while(i!=k+1):
        replace= random.randrange(0,n)
        for r in range(i):
            print("i?",r,replace,a[r])
            if(replace!=a[r]):
                print(replace)
                a[r]=replace
                i=i+1

        
          

com(5,3)