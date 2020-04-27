package com.example.pwccomparisontoolapp

import android.os.Parcel
import android.os.Parcelable
import org.junit.Test

import org.junit.Assert.*

class CalcBudget<Budget>() {

    fun getBudget(Int: Budget) : Int {
        return -1
    }

    
}

class CalcBudgetTest() : Parcelable {
    //Function for financing test assertions and exceptions

    constructor(parcel: Parcel) : this() {
    }

    @Test
    fun checkBudget() {
        assertEquals(0, SetBudget().getBudget(Budget.getInstance()))
        fail()
    }

    private fun SetBudget(): Any {

    }

    @Test
    fun financingBudget() {
        //val u_budget = Budget.getInstance()
        //u_budget.divide(Budget / 36)

        //assertEquals(2, CalcBudget().getBudget(u_budget))
    }






    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CalcBudgetTest> {
        override fun createFromParcel(parcel: Parcel): CalcBudgetTest {
            return CalcBudgetTest(parcel)
        }

        override fun newArray(size: Int): Array<CalcBudgetTest?> {
            return arrayOfNulls(size)
        }
    }
}

private fun Any.getBudget(instance: Any): Long {

}
