'''
Họ và tên: Nguyễn Minh Phương
Mã SV: B19DCAT141
Email: phuongacma1802@gmail.com
Quê quán: Bắc Giang
Sđt: 0383009190
'''
#Question 6:
class Point_BacGiang():
    def __init__(self, x, y):
        self.x = float(x)
        self.y = float(y)

    def toString(self):
        print(f"({self.x}, {self.y})")

    def add_141(self, p):
        self.x += p.x
        self.y += p.y

    def subtract_141(self, p):
        self.x -= p.x
        self.y -= p.y

    def dotProduct_141(self, p):
        self.x * p.x + self.y * p.y

p1 = Point_BacGiang(1, 2)
p2 = Point_BacGiang(2, 3)
p1.add_141(p2)
p1.toString()
p1.subtract_141(p2)
p1.toString()
p1.dotProduct_141(p2)
p1.toString()

#Question 3:
class Student_B19DCAT141:
    def __init__(self, name, entranceDate, dateOfBirth, department):
        self.name = name
        self.entranceDate = entranceDate
        self.dateOfBirth = dateOfBirth
        self.department = department
        self.studentYear = -1
        self.marks = [-1]

    def displayInfo_Nguyen_Minh_Phuong(self):
        print(f"Name: {self.name}")
        print(f"Entrance Date: {self.entranceDate}")
        print(f"Date of Birth: {self.dateOfBirth}")
        print(f"Department: {self.department}")
        print(f"Student Year: {self.studentYear}")
        print(f"Marks: {self.marks}")

    def inputMarks_Nguyen_Minh_Phuong(self):
        self.marks = input("Enter student's marks: ")

s1 = Student_B19DCAT141("Maru", "19/01/2020", "18/02/2001", "Hanoi")
s1.displayInfo_Nguyen_Minh_Phuong()