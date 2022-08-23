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
