diction = {'list': 'danh sách', 'loop': 'vòng lặp',
           'print': 'in/xuất ra', 'array': 'mảng', 'syntax': 'cú pháp'}
for key in diction.keys():
    print(f"{key.title()} means {diction[key]} in Vietnamese")
