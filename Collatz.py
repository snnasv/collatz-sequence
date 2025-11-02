def collatz(n):
    if n == 1:
        print('Please type a number bigger than 1')
        return
    
    print(n, end=' ')
    while n != 1:
        if n % 2 == 0:
            n = n // 2
        else:
            n = 3 * n + 1

        print(n, end= ' ')
    print()


collatz(7)

    
