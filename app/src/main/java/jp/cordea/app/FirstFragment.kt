package jp.cordea.app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import jp.cordea.app.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentFirstBinding.bind(view)
    }
}
