# creating instance using __new__

class CreateInstance:

    _instance = None

    def __new__(cls, *args, **kwargs):
        if cls._instance is None:
            # use to allocate the memory for the object
            cls._instance = super().__new__(cls)
        return cls._instance

    def __init__(self, name: str):
        self.name = name

    def __repr__(self):
        return f"Name:{self.name}"

    def __eq__(self, value):

        if self.name == 'Hi':
            return NotImplemented
        print(self.name)
        print(value.name)

        return self.name == value.name


a = CreateInstance('Hi')
b = CreateInstance('Heloo')

print(a)
