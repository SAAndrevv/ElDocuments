package com.saandrew.eldocuments.ui.qr.adapter

import com.saandrew.eldocuments.ui.TypesOfDocuments

object Dictionary {

    fun childrenDict(string: String) = when(string)
    {
        TypesOfDocuments.PASSPORT -> "Паспорт"
        TypesOfDocuments.INSUR_NUM_OF_AN_INDIVID_PERSON_ACCOUNT -> "СНИЛС"
        TypesOfDocuments.DRIVER_LICENSE -> "Водительское удостоверение"
        TypesOfDocuments.MANDATORY_HEALTH_INSURANCE -> "Полис ОМС"

        else -> "Неизвестно"
    }

    fun parentDict(int: Int) = when(int) {
        1 -> "Документы"

        else -> "Неизвестно"
    }

}