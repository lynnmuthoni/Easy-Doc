package com.example.easysdoc

class User {
    var name:String=""
    var email:String=""
    var PhoneNumber:String=""
    var Password:String=""
    var ConfirmPassword:String=""
    var id :String=""
    constructor (name:String,email:String,PhoneNumber:String,Password:String,ConfirmPassword:String,id :String){
        this.name=name
        this.email=email
        this.PhoneNumber=PhoneNumber
        this.Password=Password
        this.ConfirmPassword=ConfirmPassword
        this.id=id
    }
    constructor()
}