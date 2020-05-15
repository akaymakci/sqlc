// Code generated by sqlc. DO NOT EDIT.

package com.example.authors

import java.sql.Connection
import java.sql.SQLException

import sqlc.runtime.ExecuteQuery
import sqlc.runtime.ListQuery
import sqlc.runtime.RowQuery

interface Queries {
  @Throws(SQLException::class)
  fun createAuthor(name: String, bio: String?): RowQuery<Author>
  
  @Throws(SQLException::class)
  fun deleteAuthor(id: Long): ExecuteQuery
  
  @Throws(SQLException::class)
  fun getAuthor(id: Long): RowQuery<Author>
  
  @Throws(SQLException::class)
  fun listAuthors(): ListQuery<Author>
  
}
