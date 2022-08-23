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
