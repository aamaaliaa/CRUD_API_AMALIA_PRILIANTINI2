package com.example.crud_api_amalia_priliantini

interface CrudView {
    // Untuk mendapatkan data
    fun onSuccessGet(data: List<DataItem>?)
    fun onFailedGet(msg: String)

    // Untuk menghapus data
    fun onSuccessDelete(msg: String)
    fun onErrorDelete(msg: String)

    // Untuk menambahkan data
    fun successAdd(msg: String)
    fun errorAdd(msg: String)

    // Untuk memperbarui data
    fun onSuccessUpdate(msg: String)
    fun onErrorUpdate(msg: String)
}
