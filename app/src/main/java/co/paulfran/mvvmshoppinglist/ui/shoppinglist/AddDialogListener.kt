package co.paulfran.mvvmshoppinglist.ui.shoppinglist

import co.paulfran.mvvmshoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}