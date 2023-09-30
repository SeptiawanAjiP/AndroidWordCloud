package com.dewakoding.wordcloud

import android.content.Context
import android.webkit.JavascriptInterface


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
class JavascriptInterface(
    context: Context,
    text: String?
) {
    companion object {
        const val TAG_HANDLER = "Android"
    }
    private val mText = text


    @JavascriptInterface
    fun getText(): String? {
        return mText
    }
}