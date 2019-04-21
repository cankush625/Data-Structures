def sort(num) :
    for i in range(4) :
        numPos = i
        for j in range(i, 5) :
            if num[j] < num[numPos] :
                numPos = j

        temp = num[i]
        num[i] = num[numPos]
        num[numPos] = temp


num = [5, 2, 8, 3, 9]
sort(num)

print(num)