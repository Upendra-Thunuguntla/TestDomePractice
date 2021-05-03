import math
def find_roots(a, b, c):
    bNeg = 0-b
    bSquare = b*b
    ac4 = 4*a*c
    a2 = a*2
    root = math.sqrt(bSquare-ac4)

    return ((bNeg-root)/a2,(bNeg+root)/a2)

print(find_roots(2, 10, 8));