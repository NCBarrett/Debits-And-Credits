package com.neillbarrett.debitsandcredits.ManageTransactions

import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.neillbarrett.debitsandcredits.R


class ManageTransactionsFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manage_transactions, container, false)
    }

    companion object {

    }
}