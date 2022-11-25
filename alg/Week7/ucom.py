# https://medium.com/@adambene/fixed-point-combinators-in-javascript-c214c15ff2f6

U = lambda g: g(g) # U(g) = g(g) = U(g)

fact = U( # fact = U(g) = g(g) = 1 if x == 0 else x*fact(x-1)
    lambda f: # g for self-referencing
        lambda x: # currying is for passing the halting condition #丟進去Ｕ的g便是這個lambda的f裡面的lambda x
            1 if x == 0 else x * f(f)(x - 1) # g(g) = fact
            #1 if x == 0 else x * f(f)(x - 1)
)

print('fact(5)=', fact(5))
# 令 f = lambda g: lambda x: 1 if x == 0 else x * g(g)(x - 1)

# fact(5) = f(f)(5) = 1 if x == 0 else x * f(f)(x - 1)
#                   = 5*f(f)(4)

