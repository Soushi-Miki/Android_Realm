package app.miki.mikiso.skilllistrealm

import android.icu.text.CaseMap
import io.realm.RealmObject
import java.net.ContentHandler


open class Memo(
    open var title: String = "",
    open var content:String = ""

) : RealmObject()
