package org.zone

import javax.inject.Singleton

@Singleton
class Seven {
    def type = Parity.ODD
    def weight = 7.0
    def isPrime = true // 2,3,5,7,11, 13, etc

    def add(n){
        return this.weight + n
    }
    def subtract(n){
        return this.weight-n
    }
    def multiply(n){
        return this.weight * n
    }
    def divide(n){
        return this.weight/n
    }
    def squareRoot(){
        return Math.sqrt(this.weight)
    }
    def raise(n){
        return Math.pow(this.weight,n)
    }
    def inverse(){
        return 1/this.weight
    }
    def negative(){
        return -this.weight
    }
    def exp() {  // Euler's num
        return Math.exp(this.weight )
    }
    def absolute(){
        return Math.abs(this.weight)
    }
    def sine(){
        def sevenRad = Math.toRadians(this.weight)
        return Math.sin(sevenRad)
    }
    def cosine(){
        def sevenRad = Math.toRadians(this.weight)
        return Math.cos(sevenRad)
    }
    def tan(){
        def sevenRad = Math.toRadians(this.weight)
        return Math.tan(sevenRad)
    }

}