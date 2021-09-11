// Code generated by sqlc. DO NOT EDIT.

package querytest

import (
	"database/sql"

	"github.com/jackc/pgtype"
)

type Order struct {
	ID     int32
	Price  pgtype.Numeric
	UserID int32
}

type User struct {
	ID        int32
	FirstName string
	LastName  sql.NullString
	Age       int32
	JobStatus string
}