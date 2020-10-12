package com.example.demo.core

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.persistence.*

@Repository
interface SimpleEntityRepository : JpaRepository<SimpleEntity, Long>

@Entity
open class SimpleEntity(
    @Basic(fetch = FetchType.EAGER)
    open var first: String,
    open var second: Long,
    open var third: Boolean,
    @Id @GeneratedValue
    open var id: Long = 0
) {
    constructor() : this("first", 2, false)
}