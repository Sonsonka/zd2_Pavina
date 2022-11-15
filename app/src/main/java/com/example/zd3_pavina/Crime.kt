package com.example.zd3_pavina

import java.util.*

class Crime {
    private var mId: UUID? = null
    public var mTitle: String? = null
    var mDate: Date? = null
    public var mSolved = false
    private var mSuspect: String? = null

    fun Crime(id: UUID?){
        mId = id
        mDate = Date()
    }

    fun Crime() {
        (UUID.randomUUID())
    }

    private var mRequestPolice= false

    fun RequiresPolice(): Boolean {
        return mRequestPolice
    }

    fun setRequestPolice(mReqPolice: Boolean) {
        mRequestPolice = mReqPolice
    }

    fun getId() : UUID?
    {
        return mId
    }

    fun getTitle(): String? {
        return mTitle
    }

    fun setTitle(mTitle: String?) {
        this.mTitle = mTitle
    }

    fun getDate(): Date? {
        return mDate
    }

    fun setDate(mDate: Date?) {
        this.mDate = mDate
    }

    fun isSolved(): Boolean? {
        return mSolved
    }

    fun setSolved(_mSolved: Boolean){
        mSolved = _mSolved
    }

    fun getTime(): Long{
        return mDate!!.time
    }

    fun setTime(mTime: Long) {
        mDate!!.time = mTime
    }

    fun getSuspect(): String? {
        return mSuspect
    }

    fun setSuspect(suspect: String) {
        mSuspect = suspect
    }

    fun getPhotoFilename(): String? {
        return "IMG" + getId().toString() + ".jpg"
    }
}
