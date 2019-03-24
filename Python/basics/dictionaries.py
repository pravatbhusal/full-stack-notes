# Dictionaries are Python's version of Hash Tables, using key-value pairs

myDictionary = {"key1": "value1", "key2": "value2", "key3": {"123": [1, 2, 3]}}
print(myDictionary)  # (prints the dictionary in no particular order)
print(myStuff["key1"])  # (gets key1 value) prints: "value1"
print(myStuff["key3"]["123"][2])  # (nested dictionaries) prints: 3

myStuff["key2"] = "a new value"  # updates the value of "key2"
print(myStuff["key2"])  # prints: "a new value"
