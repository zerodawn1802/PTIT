favourite_language = {'Duc': 'null', 'Hieu': 'English',
                      'Phuong': 'Vietnamese', 'Duy': 'null', 'Duong': 'null'}
for key in favourite_language.keys():
    if favourite_language[key] == "null":
        print(f"{key} lets vote")
    else:
        print(f"{key}, thanks for your vote")
