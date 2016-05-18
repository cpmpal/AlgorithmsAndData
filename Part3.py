import random

random.seed()

a = []
for i in range(random.randint(10,20)):
    a.append(random.randint(1,3))

    
print(a, len(a))

lowTwo = 0
midTwo = 0
highTwo = len(a)-1

for i in range(len(a)):
	if a[midTwo] is 2:
		midTwo+=1
	elif a[midTwo] is 1:
		a[midTwo], a[lowTwo] = a[lowTwo], a[midTwo]
		lowTwo+=1
		midTwo+=1
	elif a[midTwo] is 3:
		a[midTwo], a[highTwo] = a[highTwo], a[midTwo]
		highTwo-=1
	else:
		pass
print(a, len(a))
