package in.hbb20.countrycodepickerproject;

import com.sunkengod.CCPCountry;
import com.sunkengod.CCPTalkBackTextProvider;

class CCPCustomTalkBackProvider implements CCPTalkBackTextProvider {
    @Override
    public String getTalkBackTextForCountry(CCPCountry country) {
        if (country != null) {
            return "Country code is +" + country.getPhoneCode();
        } else {
            return null;
        }
    }
}
