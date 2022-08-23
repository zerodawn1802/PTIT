#Ex1
in4 = {'fist_name': 'Tran', 'last_name': 'Duc', 'age': '21', 'city': 'Ha Noi'}
for key in in4.keys():
    print(in4[key])


#Ex2
num = {'Duc': '18', 'Hieu': '9', 'Phuong': '18', 'Duy': '10', 'Duong': '20'}
for key in num.keys():
    print(key, "like number", num[key])


#Ex3
diction = {'list': 'danh sách', 'loop': 'vòng lặp',
           'print': 'in/xuất ra', 'array': 'mảng', 'syntax': 'cú pháp'}
for key in diction.keys():
    print(f"{key.title()} means {diction[key]} in Vietnamese")


#Ex4
diction = {'list': 'danh sách', 'loop': 'vòng lặp',
           'print': 'in/xuất ra', 'array': 'mảng', 'syntax': 'cú pháp'}
for key in diction.keys():
    print(f"{key.title()} means {diction[key]} in Vietnamese")


#Ex5
river = {'nile': 'egypt', 'me kong': 'viet nam', 'to lich': 'viet nam'}
for key in river.keys():
    print(f"{key.title()} runs through {river[key].title()}")
for key in river.keys():
    print(key.title())
for key in river.keys():
    print(river[key].title())


#Ex6
favourite_language = {'Duc': 'null', 'Hieu': 'English',
                      'Phuong': 'Vietnamese', 'Duy': 'null', 'Duong': 'null'}
for key in favourite_language.keys():
    if favourite_language[key] == "null":
        print(f"{key} lets vote")
    else:
        print(f"{key}, thanks for your vote")


#Ex7
people = [
    {
        "first name": "Minh",
        "last name": "Nguyen",
        "age": 21,
        "city": "Ha Noi"
    },
    {
        "first name": "Duy",
        "last name": "Kieu",
        "age": 21,
        "city": "Phu Tho"
    },
    {
        "first name": "Hieu",
        "last name": "Dinh",
        "age": 21,
        "city": "Nam Dinh"
    }
]

for person in people:
    for key, value in person.items():
        print(f"{key} : {value}")

#Ex8
pets = [{
    "kind": "Cat",
    "owner": "Duy"
},
    {
    "kind": "Dog",
            "owner": "Duc"
},
    {
    "kind": "Mouse",
            "owner": "Hieu"
}
]

for pet in pets:
    for key, value in pet.items():
        print(f"{key} : {value}")
