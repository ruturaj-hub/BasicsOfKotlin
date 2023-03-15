package com.example.oopskotlin

sealed class Student { //We can access it in the same module but not in other modules
}

class UnderGraduate: Student()
class PostGraduate: Student()
class SSC: Student()
class HSC:Student()