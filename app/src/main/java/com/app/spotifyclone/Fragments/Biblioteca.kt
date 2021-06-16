package com.app.spotifyclone.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentPagerAdapter
import com.app.spotifyclone.FragmentsTab.Albuns
import com.app.spotifyclone.FragmentsTab.Artistas
import com.app.spotifyclone.FragmentsTab.Playlists
import com.app.spotifyclone.R
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.fragment_biblioteca.*


class Biblioteca : Fragment() {

    companion object{

        fun newInstance():Biblioteca{
            val fragmentBiblioteca = Biblioteca()
            val argumentos = Bundle()
            fragmentBiblioteca.arguments = argumentos
            return fragmentBiblioteca



        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_biblioteca, container, false)
    }
    //------------ conf fragments


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var adapter = FragmentPagerItemAdapter(fragmentManager, FragmentPagerItems.with(context)

            .add("Playlists", Playlists::class.java)
            .add("Artistas", Artistas::class.java)
            .add("Albuns",Albuns::class.java)
            .create())
        viewpager.adapter = adapter
        viewpagertab.setViewPager(viewpager)

    }

}