package co.paulfran.mvvmshoppinglist.data.repositories

import co.paulfran.mvvmshoppinglist.data.db.ShoppingDatabase
import co.paulfran.mvvmshoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(private val db: ShoppingDatabase) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}