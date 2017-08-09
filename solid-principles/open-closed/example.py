import math
from random import randint

class Shape:
    def area():
        pass

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return math.pi * (self.radius ** 2)

class Square(Shape):
    def __init__(self, side):
        self.side = side

    def area(self):
        return (self.side ** 2)

class Triangle(Shape):
    def __init__(self, base, height):
        self.base = base
        self.height = height

    def area(self):
        return (self.base * self.height) / 2.0

class SomethingUseful:
    def areaSummation(self, figures):
        total = 0.0
        for figure in figures:
            total += figure.area()
        return total

if __name__ == '__main__':
    circles = [Circle(randint(5, 25)) for i in range(10)]
    squares = [Square(randint(5, 25)) for i in range(10)]
    triangles = [Triangle(randint(5, 25), randint(36, 96)) for i in range(10)]

    usefulThing = SomethingUseful()
    print(usefulThing.areaSummation(circles + squares + triangles))
