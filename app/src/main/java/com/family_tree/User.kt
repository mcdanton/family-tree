package com.family_tree

import java.util.*

class User(
    override var name: String,
    override var birth: Date,
    override var death: Date,
    override var notes: String,
    override var parents: List<Person>?,
    var spouse: Person?,
    var children: List<Person>?
) : Person {}


interface Person {
    var name: String
    var birth: Date
    var death: Date
    var notes: String
    var parents: List<Person>?
}