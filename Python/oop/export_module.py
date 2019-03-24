# We will export this module to the import_module.py to use

def my_func():
    print("I am inside the export_module.py file")


def my_export_func():
    print("This is an exported function used without the import object")


# Name and Main
def top_level_func():
    if __name__ == "__main__":
        print("export_module.py is being run directly")
    else:
        print("export_module.py has been imported by import_module.py")
