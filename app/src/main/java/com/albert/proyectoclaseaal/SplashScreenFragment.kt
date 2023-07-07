package com.albert.proyectoclaseaal

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.albert.proyectoclaseaal.databinding.FragmentRickymortyBinding
import com.albert.proyectoclaseaal.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment() {

    private var _binding: FragmentSplashScreenBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtMombre.text = "Alberto Aramburo Lucer Mostra y Descargas Datos"

        binding.animationView.setOnClickListener{



            with(binding.animationView){

                if (isAnimating.not()) {
                    Log.i("","se ha presionado el boton")
                    playAnimation()
                }

            }

        }
        redirection()

    }
//
   // findNavController().navigate(R.id.action_loginFragment_to_recyclerFragment)
private fun redirection() {



    Handler(Looper.getMainLooper()).postDelayed({
        findNavController().navigate(R.id.actionAnimationSplashScreen)


    },3000)


}

}