package `in`.hbb20.countrycodepickerproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.sunkengod.CountryCodePicker
import com.sunkengod.ccp.R

/**
 * A simple [Fragment] subclass.
 */
class GetCountryFragment : Fragment() {

    private lateinit var textViewCountryName: TextView
    private lateinit var textViewCountryCode: TextView
    private lateinit var textViewCountryNameCode: TextView
    private lateinit var buttonReadCountry: Button
    private lateinit var ccp: CountryCodePicker
    private lateinit var buttonNext: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_get_country, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        assignViews()
        setClickListener()
    }

    private fun setClickListener() {
        buttonReadCountry.setOnClickListener {
            textViewCountryName.text = ccp.selectedCountryName
            textViewCountryCode.text = ccp.selectedCountryCode
            textViewCountryNameCode.text = ccp.selectedCountryNameCode
        }

        buttonNext.setOnClickListener {
            (activity as ExampleActivity).viewPager.currentItem =
                (activity as ExampleActivity).viewPager.currentItem + 1
        }
    }

    private fun assignViews() {
        ccp = requireView().findViewById(R.id.ccp)
        textViewCountryCode = requireView().findViewById(R.id.textView_countryCode)
        textViewCountryName = requireView().findViewById(R.id.textView_countryName)
        textViewCountryNameCode = requireView().findViewById(R.id.textView_countryNameCode)
        buttonReadCountry = requireView().findViewById(R.id.button_readCountry)
        buttonNext = requireView().findViewById(R.id.button_next)
    }
}
