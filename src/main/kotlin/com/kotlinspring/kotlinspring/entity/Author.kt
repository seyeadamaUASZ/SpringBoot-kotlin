package com.kotlinspring.kotlinspring.entity

import javax.persistence.*

@Entity
@Table(name = "author")
data class Author(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                  var id:Long? = null,
                  var name:String? = null,
                  @OneToMany(mappedBy = "author")
                  var books: List<Book> = mutableListOf()
)