def sort(num) :
    for i in range(len(num) - 1) :
        for j in range(i, len(num)) :
            if num[i] > num[j] :
                temp = num[i]
                num[i] = num[j]
                num[j] = temp

num = [2, 6, 4, 8, 7]

sort(num)

print(num)

'''
Output :
[2, 4, 6, 7, 8]
'''