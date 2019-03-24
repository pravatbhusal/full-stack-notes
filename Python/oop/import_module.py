# Importing modules from across files, specifically export_module.py
# Utilizing modules creates a __pycache__ folder, which is optimized cache

import export_module as em  # importing a module with the optional identifer of em
from export_module import my_export_func  # no need to use the imported object when importing from specific functions
from export_module import top_level_func

# from export_module import * # this imports all the functions from the export_module.py without needing the import object

em.my_func()  # prints: "I am inside the export_module.py file"
my_export_func()  # prints: "This is an exported function used without the import object"
top_level_func()  # prints: "export_module.py has been imported by import_module.py"
