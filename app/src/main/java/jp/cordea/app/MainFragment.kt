package jp.cordea.app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import jp.cordea.app.databinding.MainFragmentBinding

class MainFragment : Fragment(R.layout.main_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = MainFragmentBinding.bind(view)
    }
}
