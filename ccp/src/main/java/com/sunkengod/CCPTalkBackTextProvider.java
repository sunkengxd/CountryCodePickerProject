package com.sunkengod;

public interface CCPTalkBackTextProvider {
    String getTalkBackTextForCountry(CCPCountry country);
}

class InternalTalkBackTextProvider implements CCPTalkBackTextProvider {

    @Override
    public String getTalkBackTextForCountry(CCPCountry country) {
        if (country == null) {
            return null;
        } else {
            return country.name + " phone code is +" + country.phoneCode;
        }
    }
}


