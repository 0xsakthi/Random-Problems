#!/usr/bin/python3

time = "12:00:00AM"

time1 = time[0:2]
time2 = time[3:5]
time3 = time[6:8]
sele = time[8:10]
if sele=="PM":
    #print(f"{time1+12}")
    if time1=="12":
    	print(f"{int(time1)}:{time2}:{time3}")
    else:
    	print(f"{int(time1)+12}:{time2}:{time3}")
else:
	if time1=="12":
		print(f"00:{time2}:{time3}")
	else:
		print(f"{time1}:{time2}:{time3}")