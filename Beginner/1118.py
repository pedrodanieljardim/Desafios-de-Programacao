k: bool = True

while k:
    x = float(input())

    if x < 0 or x > 10:
        print('nota inválida')

    y = float(input())

    if y < 0 or x > 10:
        print('nota inválida')

    if 0 <= x <= 10 and 0 <= y <= 10:
        mean = (x + y)/2
        print('media = {:.2f}'.format(mean))
        print('novo calculo (1 - sim e 2 - não):')
        choose = int(input())
        if choose == 2:
            k = False

