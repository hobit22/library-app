package com.group.libraryapp.domain.user.loanHistory

import com.group.libraryapp.domain.user.User
import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
class UserLoanHistory(

    @ManyToOne
    val user: User,

    val bookName: String,

    var isReturn: Boolean,

    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Long? = null,
) {

    fun doReturn() {
        this.isReturn = true
    }
}