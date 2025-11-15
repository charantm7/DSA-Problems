import datetime

day = list(map(int, input().split()))

date_object = datetime.date(day[2], day[0], day[1])

day_object = date_object.strftime("%A")

print(day_object.upper())
